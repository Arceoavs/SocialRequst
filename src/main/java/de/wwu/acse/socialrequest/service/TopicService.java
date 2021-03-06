package de.wwu.acse.socialrequest.service;

import java.util.List;

import de.wwu.acse.socialrequest.model.Topic;

public interface TopicService {

  public List<Topic> getAllTopics();

  /**
   * Either fetched a given topic from the database by its name,
   * or creates a new topic with the given name
   * @param topic
   * @return
   */
  public Topic getOrCreateTopic(String topic);
}
