package de.wwu.acse.group6.socialrequest.service;

import de.wwu.acse.group6.socialrequest.exception.RequestAlreadyFulfilledException;
import de.wwu.acse.group6.socialrequest.exception.RequestCannotBeFulfilledBySameUser;
import de.wwu.acse.group6.socialrequest.model.Fulfillment;
import de.wwu.acse.group6.socialrequest.model.Request;
import de.wwu.acse.group6.socialrequest.model.User;
import de.wwu.acse.group6.socialrequest.repository.FulfillmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FulfillmentService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  /**
   * Fulfills the request and sets the user as the "fulfiller"
   * @param request the request to be fulfilled
   * @param user the user that fulfills the request
   * @throws RequestAlreadyFulfilledException if the request is already fulfilled
   * @throws RequestCannotBeFulfilledBySameUser if the creator of the request wants to fulfill their own request
   */
  public void fulfillRequest(Request request, User user) throws RequestAlreadyFulfilledException, RequestCannotBeFulfilledBySameUser {
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
