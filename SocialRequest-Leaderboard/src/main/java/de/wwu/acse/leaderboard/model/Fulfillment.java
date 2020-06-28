package de.wwu.acse.leaderboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "fulfillments")
@Entity
public class Fulfillment implements Serializable {

  private static final long serialVersionUID = 6087808644310117815L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String username;

  @NotNull(message = "Distance in kilometres is required")
  private float distance;

  @NotNull
  private Date fulfilledAt;

  public Fulfillment(String username, float distance, Date fulfilledAt) {
    this.username = username;
    this.distance = distance;
    this.fulfilledAt = fulfilledAt;
  }

  public Long getId() {
    return id;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Date getFulfilledAt() {
    return fulfilledAt;
  }

  public void setFulfilledAt(Date fulfilledAt) {
    this.fulfilledAt = fulfilledAt;
  }

}
