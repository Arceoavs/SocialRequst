package de.wwu.acse.group6.socialrequest.service;

import java.util.List;

import de.wwu.acse.group6.socialrequest.model.Topic;

public interface TopicService {

  public List<Topic> getAllTopics();

  public Topic getOrCreateTopic(String topic);
}
