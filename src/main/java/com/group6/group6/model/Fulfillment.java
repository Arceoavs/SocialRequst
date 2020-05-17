package com.group6.group6.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"request_id", "user_id"}))
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Fulfillment {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreatedDate
  private Date createdAt;

  @NotNull(message = "Request is required")
  @OneToOne(optional = false)
  @JoinColumn(name = "request_id", referencedColumnName = "id")
  private Request request;

  @NotNull(message = "User is required")
  @ManyToOne(optional = false)
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
