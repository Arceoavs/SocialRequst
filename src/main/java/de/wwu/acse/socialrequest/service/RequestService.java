package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.model.Request;

public interface RequestService {

  /**
   * Method to create a request, based on request data and optional topics
   * New topics will be created dynamically
   * @param request non-persisted request
   * @param topics list of strings (topic names)
   * @return persisted request
   */
  public Request createRequest(Request request, String[] topics);

  public Request getRequest(String id);

}
