package de.wwu.acse.socialrequest.service;

import java.util.List;

import de.wwu.acse.socialrequest.model.Request;

public interface SearchService {

  /**
   * Method to get a list of requests, based on a search query
   *
   * @param query the search query to search for
   * @return a list of requests
   */
  public List<Request> getRequests(String query);

}
