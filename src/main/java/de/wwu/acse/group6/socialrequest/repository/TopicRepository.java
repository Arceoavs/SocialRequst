package de.wwu.acse.group6.socialrequest.repository;

import de.wwu.acse.group6.socialrequest.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

  public Topic findByName(String name);

}
