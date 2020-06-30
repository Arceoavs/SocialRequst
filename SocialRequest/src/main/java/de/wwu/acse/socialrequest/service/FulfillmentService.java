package de.wwu.acse.socialrequest.service;

import org.springframework.stereotype.Service;

import de.wwu.acse.socialrequest.exception.RequestAlreadyFulfilledException;
import de.wwu.acse.socialrequest.exception.RequestCannotBeFulfilledBySameUser;
import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.User;

@Service
public interface FulfillmentService {

  /**
   * Fulfills the request and sets the user as the "fulfiller"
   * 
   * @param request the request to be fulfilled
   * @param user    the user that fulfills the request
   * @throws RequestAlreadyFulfilledException   if the request is already
   *                                            fulfilled
   * @throws RequestCannotBeFulfilledBySameUser if the creator of the request
   *                                            wants to fulfill their own request
   */
  public void fulfillRequest(Request request, User user)
      throws RequestAlreadyFulfilledException, RequestCannotBeFulfilledBySameUser;

}
