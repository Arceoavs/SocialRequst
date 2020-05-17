package com.group6.group6.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

import com.group6.group6.validator.annotation.PasswordMatches;
import com.group6.group6.validator.annotation.ValidEmail;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@PasswordMatches
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "Username required")
  @Column(unique = true)
  private String username;

  @NotBlank(message = "Email required")
  @ValidEmail
  @Column(unique = true)
  private String email;

  @NotBlank(message = "Password required")
  private String password;

  @Transient
  private String passwordConfirmation;

  private float lat;
  private float lng;

  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)

  @OneToMany
  @JoinTable(
    name = "fulfillment",
    joinColumns = {@JoinColumn(name = "user_id")},
    inverseJoinColumns = {@JoinColumn(name = "request_id")}
  )
  private List<Request> fulfilledRequests = new ArrayList<Request>();

  public User() {}

  public User(String username, String email, String password, String passwordConfirmation) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.passwordConfirmation = passwordConfirmation;
  }

  public User(String username, String email, String password, String passwordConfirmation, float lat, float lng) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.passwordConfirmation = passwordConfirmation;
    this.lat = lat;
    this.lng = lng;
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

  public float getLat() {
    return lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLng() {
    return lng;
  }

  public void setLng(float lng) {
    this.lng = lng;
  }

  public List<Topic> getSpecialties() {
    return this.specialties;
  }

  public boolean addSpecialty(Topic specialty) {
    return this.specialties.add(specialty);
  }

  public boolean removeSpecialty(Topic specialty) {
    return this.specialties.remove(specialty);
  }

  public List<Request> getFulfilledRequests() {
    return this.fulfilledRequests;
  }

  public List<Request> getSubmittedRequests() {
    return this.submittedRequests;
  }

}
