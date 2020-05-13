package com.group6.group6.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.group6.group6.validator.annotation.PasswordMatches;
import com.group6.group6.validator.annotation.ValidEmail;

@PasswordMatches
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "Topic name required")
  @Column(unique = true)
  private String username;

  @NotBlank(message = "Topic name required")
  @ValidEmail
  @Column(unique = true)
  private String email;

  @NotBlank(message = "Topic name required")
  private String password;

  @Transient
  private String passwordConfirmation;

  public User() {}

  public User(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public Long getId() {
    return this.id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }

  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

}
