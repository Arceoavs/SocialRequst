package de.wwu.acse.leaderboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "fulfillments", uniqueConstraints = @UniqueConstraint(columnNames = { "requestId", "username" }))
@Entity
public class Fulfillment implements Serializable {

  private static final long serialVersionUID = 6087808644310117815L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String username;

  @NotNull
  private Long requestId;

  @NotNull(message = "Distance in kilometres is required")
  private Double distance;

  @NotNull
  private Date fulfilledAt;

  public Fulfillment(String username, Long requestId, Double distance, Date fulfilledAt) {
    this.username = username;
    this.requestId = requestId;
    this.distance = distance;
    this.fulfilledAt = fulfilledAt;
  }

  public Long getId() {
    return id;
  }

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Long getRequestId() {
    return requestId;
  }

  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  public Date getFulfilledAt() {
    return fulfilledAt;
  }

  public void setFulfilledAt(Date fulfilledAt) {
    this.fulfilledAt = fulfilledAt;
  }

}
