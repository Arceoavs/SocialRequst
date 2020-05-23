package com.group6.group6.service.impl;

import java.util.HashSet;
import java.util.Set;

import com.group6.group6.model.Request;
import com.group6.group6.model.Topic;
import com.group6.group6.repository.RequestRepository;
import com.group6.group6.repository.UserRepository;
import com.group6.group6.service.RequestService;
import com.group6.group6.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class RequestServiceImpl implements RequestService {

  @Autowired
  TopicService topicService;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RequestRepository requestRepository;

  @Override
  public Request createRequest(Request request, String[] topics) {
    if (topics == null) topics = new String[]{};

    if(request.getTopics() == null || topics.length != request.getTopics().size()) {
      Set<Topic> requestTopics = new HashSet<>();
      for(String topic : topics) {
        requestTopics.add(topicService.getOrCreateTopic(topic));
      }
      request.setTopics(requestTopics);
    }

    return requestRepository.saveAndFlush(request);
  }

  @Override
  public Request getRequest(String id) {
    Long requestId = Long.parseLong(id);
    Request req = requestRepository.findById(requestId).get();
    return req;
  }

}
