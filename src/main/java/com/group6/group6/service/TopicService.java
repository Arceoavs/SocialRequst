package com.group6.group6.service;

import java.util.List;

import com.group6.group6.model.Topic;

public interface TopicService {

  public List<Topic> getAllTopics();

  public Topic getOrCreateTopic(String topic);
}
