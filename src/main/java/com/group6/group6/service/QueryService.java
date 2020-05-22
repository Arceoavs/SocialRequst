package com.group6.group6.service;

import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.repository.RequestRepository;
import com.group6.group6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class QueryService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  private RequestRepository requestRepository;

  /**
   * Method to get a list of requests, based on the logged in user
   * @return list of requests
   */
  public List<Request> getNearByUser() {
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    float lat = user.getLat();
    float lng = user.getLng();

    return requestRepository.getNearBy(lat, lng);
  }

  /**
   * Method to get a list of requests, based on coordinates
   * @param lat
   * @param lng
   * @return list of requests
   */
  public List<Request> getNearBy(float lat, float lng) {
    return requestRepository.getNearBy(lat, lng);
  }

}
