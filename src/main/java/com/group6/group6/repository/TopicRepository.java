package com.group6.group6.repository;

import com.group6.group6.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
  public Topic findByName(String name);
}
