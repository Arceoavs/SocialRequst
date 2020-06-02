package de.wwu.acse2020.socialrequest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import de.wwu.acse2020.socialrequest.data.model.Topic;
import de.wwu.acse2020.socialrequest.data.repo.TopicRepository;

@Service
public class TopicServiceImpl extends AbstractService implements TopicService {
  @Autowired
  private TopicRepository topicRepo;

  @Override
  public Set<Topic> createOrUpdateAll(Set<Topic> topics) {
    return new HashSet<>(topicRepo.saveAll(topics));
  }
}
