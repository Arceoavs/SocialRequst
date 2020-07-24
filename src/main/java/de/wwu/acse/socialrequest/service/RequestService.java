package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.form.RequestForm;

public interface RequestService {

  /**
   * Method to create a request, based on request data and optional topics
   * New topics will be created dynamically
   * @param request non-persisted {@link RequestForm request form}
   * @param topics list of strings (topic names)
   * @return persisted request
   */
  public Request createRequest(RequestForm request, String[] topics);

  public Request getRequest(String id);

}
