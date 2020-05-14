package com.group6.group6.service;

import com.group6.group6.exception.DuplicateUserException;
import com.group6.group6.model.User;
import com.group6.group6.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;
 
  @Transactional
  public User registerNewUserAccount(User user) throws DuplicateUserException { 
    if (emailExists(user.getEmail())) {
      throw new DuplicateUserException("An account with that email already exists: " + user.getEmail());
    }

    if (usernameExists(user.getUsername())) {
      throw new DuplicateUserException("An account with that username already exists: " + user.getUsername());
    }

    String encryptedPassword = (new BCryptPasswordEncoder()).encode(user.getPassword());
    user.setPassword(encryptedPassword);
    user.setPasswordConfirmation(encryptedPassword);
    
    return userRepository.save(user);
  }

  private boolean emailExists(String email) {
    return userRepository.findByEmail(email) != null;
  }

  private boolean usernameExists(String username) {
    return userRepository.findByUsername(username) != null;
  }

}
