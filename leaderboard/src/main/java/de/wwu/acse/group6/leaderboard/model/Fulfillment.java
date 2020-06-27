package de.wwu.acse.group6.leaderboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Table(name = "fulfillments")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Fulfillment implements Serializable {

  private static final long serialVersionUID = 6087808644310117815L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @CreatedDate
  private Date createdAt;

  @NotNull(message = "Username is required")
  private String username;

  @NotNull(message = "Distance in kilometres is required")
  private String kilometres;

  protected Fulfillment() {
  }

  public Fulfillment(String username, String kilometres) {
    this.username = username;
    this.kilometres = kilometres;
  }

  public Long getId() {
    return this.id;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  // Fulfilled at is just an alias for created at
  public Date getFulfilledAt() {
    return this.createdAt;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getKilometres() {
    return kilometres;
  }

  public void setKilometres(String kilometres) {
    this.kilometres = kilometres;
  }

}
