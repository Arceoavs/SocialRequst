package de.wwu.acse.socialrequest.service.impl;

import java.util.*;


import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.Topic;
import de.wwu.acse.socialrequest.repository.RequestRepository;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.RequestService;
import de.wwu.acse.socialrequest.service.TopicService;

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

    // if a new topic is given in the list of topics, then the reuqest does not have any topic assigned
    // thus the request has to be assigned to all the topics in the list
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
