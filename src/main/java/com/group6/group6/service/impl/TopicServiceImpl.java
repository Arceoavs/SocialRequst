package com.group6.group6.service.impl;

import java.util.List;

import com.group6.group6.model.Topic;
import com.group6.group6.repository.TopicRepository;
import com.group6.group6.service.TopicService;

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
