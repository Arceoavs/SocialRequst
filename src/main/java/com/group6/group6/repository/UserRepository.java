package com.group6.group6.repository;

import com.group6.group6.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);

  public User findByEmail(String email);

}
