package com.group6.group6.service;

import com.group6.group6.model.Request;
import com.group6.group6.repository.RequestRepository;
import com.group6.group6.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SearchService {

  @Autowired
  private RequestRepository requestRepository;

  @Autowired
  UserRepository userRepository;

  /**
   * Method to get a list of requests, based on a search query
   * @param query the search query to search for
   * @return a list of requests
   */
  public List<Request> getRequests(String query) {
    if (query == null || query.length() <= 0) {
      return Collections.emptyList();
    }

    return requestRepository.search(query);
  }
}
