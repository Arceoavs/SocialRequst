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

  public void fulfillRequest(Request request, User user) throws RequestAlreadyFulfilledException {
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
