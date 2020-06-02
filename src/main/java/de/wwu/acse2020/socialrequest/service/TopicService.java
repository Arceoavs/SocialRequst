package de.wwu.acse2020.socialrequest.service;

import java.util.Set;

import de.wwu.acse2020.socialrequest.data.model.Topic;

public interface TopicService {
  Set<Topic> createOrUpdateAll(Set<Topic> topics);
}
