package de.wwu.acse.socialrequest.model.leaderboard;

import java.util.Date;

public class FulfillmentDto {

  private String username;

  private Long requestId;

  private float distance;

  private Date fulfilledAt;

  public FulfillmentDto(String username, Long requestId, float distance, Date fulfilledAt) {
    this.username = username;
    this.requestId = requestId;
    this.distance = distance;
    this.fulfilledAt = fulfilledAt;
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
