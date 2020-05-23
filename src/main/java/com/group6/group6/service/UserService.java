package com.group6.group6.service;

import com.group6.group6.exception.DuplicateUserException;
import com.group6.group6.form.RegisterUserForm;
import com.group6.group6.form.UserProfileForm;
import com.group6.group6.model.User;
import com.group6.group6.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserAuthenticationService authenticationService;

  @Transactional
  public User registerNewUserAccount(RegisterUserForm userForm) throws DuplicateUserException {
    if (emailExists(userForm.getEmail())) {
      throw new DuplicateUserException("An account with that email already exists: " + userForm.getEmail());
    }

    if (usernameExists(userForm.getUsername())) {
      throw new DuplicateUserException("An account with that username already exists: " + userForm.getUsername());
    }

    String encryptedPassword = passwordEncoder.encode(userForm.getPassword());
    User user = new User(
      userForm.getUsername(),
      userForm.getEmail(),
      encryptedPassword,
      userForm.getLat(),
      userForm.getLng()
    );

    return userRepository.save(user);
  }

  @Transactional
  public User updateUser(UserProfileForm userForm) throws DuplicateUserException {
    if (emailExists(userForm.getEmail(), userForm.getId())) {
      throw new DuplicateUserException("An account with that email already exists: " + userForm.getEmail());
    }

    if (usernameExists(userForm.getUsername(), userForm.getId())) {
      throw new DuplicateUserException("An account with that username already exists: " + userForm.getUsername());
    }

    User user = userRepository.getOne(userForm.getId());
    user.setUsername(userForm.getUsername());
    user.setEmail(userForm.getEmail());
    user.setSpecialties(userForm.getSpecialties());
    user.setLat(userForm.getLat());
    user.setLat(userForm.getLng());

    userRepository.save(user);
    authenticationService.reloadUserAuthentication(user.getUsername(), user.getPassword());

    return user;
  }
  }

  private boolean emailExists(String email) {
    return userRepository.findByEmail(email) != null;
  }

  private boolean usernameExists(String username) {
    return userRepository.findByUsername(username) != null;
  }

  private boolean emailExists(String email, Long id) {
    return userRepository.otherUserExistsWithEmail(email, id);
  }

  private boolean usernameExists(String username, Long id) {
    return userRepository.otherUserExistsWithUsername(username, id);
  }

}
