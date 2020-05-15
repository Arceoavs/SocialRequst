package com.group6.group6.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"request_id", "user_id"}))
@Entity
public class Fulfillment {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreatedDate
  private Date createdAt;

  @NotBlank(message = "Request required")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "request_id", referencedColumnName = "id")
  private Request request;

  @NotBlank(message = "User required")
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  public Fulfillment(Request request, User user) {
    this.request = request;
    this.user = user;
  }

  public Long getId() {
    return this.id;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public Request getRequest() {
    return this.request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
