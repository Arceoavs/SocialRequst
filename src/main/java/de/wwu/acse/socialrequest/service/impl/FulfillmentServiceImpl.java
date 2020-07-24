package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.exception.RequestAlreadyFulfilledException;
import de.wwu.acse.socialrequest.exception.RequestCannotBeFulfilledBySameUser;
import de.wwu.acse.socialrequest.model.Fulfillment;
import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.FulfillmentRepository;
import de.wwu.acse.socialrequest.service.FulfillmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FulfillmentServiceImpl implements FulfillmentService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

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
    }
  }

}
