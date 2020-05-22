package com.group6.group6.service;

import com.group6.group6.model.Request;
import com.group6.group6.model.Topic;
import com.group6.group6.model.User;
import com.group6.group6.repository.RequestRepository;
import com.group6.group6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class QueryService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  private RequestRepository requestRepository;

  /**
   * Method Method to get a list of requests, based on the logged in users topics
   * @return list of requests
   */
  public List<Request> getRequestMatchingTopics(){
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    Set<Topic> specialties = user.getSpecialties();

    return requestRepository.findByTopicsInOrderByCreatedAtDesc(specialties);
  }

  /**
   * Method to get a list of requests, based on the logged in user coordinates
   * @return list of requests
   */
  public List<Request> getNearByUser() {
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    float lat = user.getLat();
    float lng = user.getLng();

    return requestRepository.getNearBy(lat, lng);
  }

}
