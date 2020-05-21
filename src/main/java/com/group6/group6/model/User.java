package com.group6.group6.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

import com.group6.group6.validator.annotation.PasswordMatches;
import com.group6.group6.validator.annotation.ValidEmail;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@PasswordMatches
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(
    name = "specialties",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "topic_id", referencedColumnName = "id")}
  )
  private Set<Topic> specialties;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private Set<Request> submittedRequests;

  @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
  private Set<Fulfillment> fulfillments = new HashSet<>();

  @OneToMany
  @JoinTable(
    name = "fulfillments",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "request_id", referencedColumnName = "id")}
  )
  private Set<Request> fulfilledRequests;

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

  @PreRemove
  private void preRemove() {
    for (Fulfillment fulfillment : fulfillments) {
      fulfillment.setUser(null);
    }
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

  public Set<Topic> getSpecialties() {
    return this.specialties;
  }

  public void setSpecialties(Set<Topic> specialties) {
    this.specialties = specialties;
  }

  public Set<Request> getFulfilledRequests() {
    return this.fulfilledRequests;
  }

  public Set<Request> getSubmittedRequests() {
    return this.submittedRequests;
  }

}
