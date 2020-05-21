package com.group6.group6.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Table(name = "fulfillments", uniqueConstraints = @UniqueConstraint(columnNames = {"request_id", "user_id"}))
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Fulfillment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreatedDate
  private Date createdAt;

  @NotNull(message = "Request is required")
  @OneToOne
  @JoinColumn(name = "request_id", referencedColumnName = "id")
  private Request request;

  @ManyToOne(optional = true)
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = true)
  private User user;

  protected Fulfillment() {}

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
