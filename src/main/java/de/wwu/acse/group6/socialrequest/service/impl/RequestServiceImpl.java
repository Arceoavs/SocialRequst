package de.wwu.acse.group6.socialrequest.service.impl;

import java.util.HashSet;
import java.util.Set;

import de.wwu.acse.group6.socialrequest.model.Request;
import de.wwu.acse.group6.socialrequest.model.Topic;
import de.wwu.acse.group6.socialrequest.repository.RequestRepository;
import de.wwu.acse.group6.socialrequest.repository.UserRepository;
import de.wwu.acse.group6.socialrequest.service.RequestService;
import de.wwu.acse.group6.socialrequest.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
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
