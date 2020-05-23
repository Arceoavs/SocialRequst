package com.group6.group6.repository;

import com.group6.group6.model.Request;
import com.group6.group6.model.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface RequestRepository extends JpaRepository<Request, Long> {

  public Request findByTitle(String title);

  @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL AND (LOWER(r.title) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(r.description) LIKE LOWER(CONCAT('%', :query, '%'))) ORDER BY r.createdAt DESC")
  public List<Request> search(@Param("query") String query);

  public List<Request> findByTopicsInAndFulfillmentIsNullOrderByCreatedAtDesc(Set<Topic> topics);

}
