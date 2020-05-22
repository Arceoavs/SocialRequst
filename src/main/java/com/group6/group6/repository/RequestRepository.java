package com.group6.group6.repository;

import com.group6.group6.model.Request;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

  public Request findByTitle(String title);

  @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL AND (LOWER(r.title) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(r.description) LIKE LOWER(CONCAT('%', :query, '%'))) ORDER BY r.createdAt DESC")
  public List<Request> search(@Param("query") String query);

  @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL" +
    " AND 6371 * SQRT(POWER((radians(r.lng) - radians(:lng)) * COS((radians(:lat) + radians(r.lat))/2), 2) + POWER(radians(r.lat) - radians(:lat), 2)) <= 10" +
    "ORDER BY r.createdAt DESC")
  public List<Request> getNearBy(@Param("lat") float lat, @Param("lng") float lng);

}
