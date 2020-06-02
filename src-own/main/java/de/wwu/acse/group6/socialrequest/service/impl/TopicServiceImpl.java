package de.wwu.acse.group6.socialrequest.service.impl;

import java.util.List;

import de.wwu.acse.group6.socialrequest.model.Topic;
import de.wwu.acse.group6.socialrequest.repository.TopicRepository;
import de.wwu.acse.group6.socialrequest.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

  @Autowired
  TopicRepository topicRepository;

  @Override
  public List<Topic> getAllTopics() {
    return topicRepository.findAll();
  }

  @Override
  public Topic getOrCreateTopic(String name) {
    Topic topic;
    name = name.toLowerCase();

    try {
      Long topicId = Long.parseLong(name);
      topic = topicRepository.findById(topicId).get();
    } catch(NumberFormatException e) {
      topic = topicRepository.findByName(name);
    }

    if(topic != null) return topic;

    return topicRepository.save(new Topic(name));
  }

}
