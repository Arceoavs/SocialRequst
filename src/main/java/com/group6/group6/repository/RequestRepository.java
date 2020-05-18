package com.group6.group6.repository;

import com.group6.group6.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {
  public Request findByTitle(String title);

  public List<Request> findByTitleIsContainingIgnoreCase(String title);

  public List<Request> findByDescriptionIsContainingIgnoreCase(String description);
  
}
