package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.exception.RequestAlreadyFulfilledException;
import de.wwu.acse.socialrequest.exception.RequestCannotBeFulfilledBySameUser;
import de.wwu.acse.socialrequest.model.Fulfillment;
import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.model.leaderboard.FulfillmentDto;
import de.wwu.acse.socialrequest.model.maps.Coordinates;
import de.wwu.acse.socialrequest.model.maps.Distance;
import de.wwu.acse.socialrequest.repository.FulfillmentRepository;
import de.wwu.acse.socialrequest.service.FulfillmentService;
import de.wwu.acse.socialrequest.service.MapsApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class FulfillmentServiceImpl implements FulfillmentService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  @Autowired
  private JmsTemplate jmsTemplate;

  @Autowired
  private MapsApiService mapsApiService;

  @Override
  public void fulfillRequest(Request request, User user)
      throws RequestAlreadyFulfilledException, RequestCannotBeFulfilledBySameUser {
    if (request.isFulfilled()) {
      throw new RequestAlreadyFulfilledException();
    } else if (request.getUser().getId() == user.getId()) {
      throw new RequestCannotBeFulfilledBySameUser();
    } else {
      Fulfillment fulfillment = new Fulfillment(request, user);
      fulfillmentRepository.saveAndFlush(fulfillment);
      transmitFulfillmentViaJms(fulfillment);
    }
  }

  /**
   * Transmits a fulfillment via JMS to the Leaderboard application. It transmits
   * a Map<String, Object> with the following details:
   *
   * <p>
   * <ul>
   * <li><strong>requestId</strong>: Id of the {@link Request Request} that was
   * fulfilled</li>
   * <li><strong>username</strong>: {@link User#getUsername()} of the {@link User
   * user} who fulfilled the given request</li>
   * <li><strong>fulfilledAt</strong>: {@link Date date} when the request was
   * fulfilled. Corresponds to {@link Fulfillment#getCreatedAt()}</li>
   * <li><strong>distance</strong>: The distance the fulfilling {@link User user}
   * travelled to fulfill the request. (This method calls the Maps application to
   * calculate the distance in km between the user's location and the request's
   * location.</li>
   * </ul>
   * </p>
   *
   * <br>
   *
   * @param fulfillment the Fulfillment to be transmitted.
   */
  private void transmitFulfillmentViaJms(Fulfillment fulfillment) {
    // call the Maps application to retrieve the distance.
    Distance distance = mapsApiService.getDistance(
      new Coordinates(fulfillment.getUser().getLat(), fulfillment.getUser().getLng()),
      new Coordinates(fulfillment.getRequest().getLat(), fulfillment.getRequest().getLng())
    );

    FulfillmentDto transmittedFulfillment = new FulfillmentDto(
      fulfillment.getUser().getUsername(),
      fulfillment.getRequest().getId(),
      distance.getLengthInKilometers(),
      fulfillment.getCreatedAt()
    );

    // transmit the fulfillment data
    this.jmsTemplate.convertAndSend("fulfillments", transmittedFulfillment);
  }

}