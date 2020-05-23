package de.wwu.acse.group6.socialrequest.service;

import de.wwu.acse.group6.socialrequest.model.Request;

public interface RequestService {

  public Request createRequest(Request request, String[] topics);

  public Request getRequest(String id);

}
