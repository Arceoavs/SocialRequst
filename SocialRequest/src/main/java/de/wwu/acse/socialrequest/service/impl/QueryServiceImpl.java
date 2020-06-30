package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.Topic;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.RequestRepository;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.QueryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class QueryServiceImpl implements QueryService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  private RequestRepository requestRepository;

  @Override
  public List<Request> getRequestMatchingTopics() {
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    Set<Topic> specialties = user.getSpecialties();

    return requestRepository.findByTopicsInAndFulfillmentIsNullOrderByCreatedAtDesc(specialties);
  }

  @Override
  public List<Request> getNearByUser() {
    User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());

    float lat = user.getLat();
    float lng = user.getLng();

    return requestRepository.getNearBy(lat, lng);
  }

}