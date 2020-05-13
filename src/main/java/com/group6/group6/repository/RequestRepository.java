package com.group6.group6.repository;

import com.group6.group6.model.Request;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long>{
    public Request findByTitle(String title);
}