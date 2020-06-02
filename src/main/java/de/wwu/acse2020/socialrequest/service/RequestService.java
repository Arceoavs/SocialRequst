package de.wwu.acse2020.socialrequest.service;

import java.util.List;
import java.util.NoSuchElementException;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;

public interface RequestService {
  Request create(Request request);

  Request get(long id) throws NoSuchElementException;

  List<Request> getLatestByUser(User user);

  List<Request> getLatestUnfulfilled();

  List<Request> search(String query);
}
