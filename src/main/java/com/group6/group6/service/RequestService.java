package com.group6.group6.service;

import com.group6.group6.model.Request;

public interface RequestService {

  public Request createRequest(Request request, String[] topics);

  public Request getRequest(String id);

}
