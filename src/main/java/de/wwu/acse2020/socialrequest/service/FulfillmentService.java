package de.wwu.acse2020.socialrequest.service;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Fulfillment;
import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.service.exceptions.FulfillmentAlreadyExistsException;

public interface FulfillmentService {
  List<Fulfillment> getLatestByUser(User user);

  Fulfillment create(Request request, User user) throws FulfillmentAlreadyExistsException;
}
