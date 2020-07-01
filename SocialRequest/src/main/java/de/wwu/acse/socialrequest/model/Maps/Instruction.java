package de.wwu.acse.socialrequest.model.Maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Instruction implements Serializable {

  @NotNull
  String message;

  @NotNull
  String street;

  @NotNull
  Long distanceInMeters;

  @NotNull
  Long travelTimeInSeconds;

  public Instruction(String message, String street, Long distanceInMeters, Long travelTimeInSeconds) {
    this.message = message;
    this.street = street;
    this.distanceInMeters = distanceInMeters;
    this.travelTimeInSeconds = travelTimeInSeconds;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Long getDistanceInMeters() {
    return distanceInMeters;
  }

  public void setDistanceInMeters(Long distanceInMeters) {
    this.distanceInMeters = distanceInMeters;
  }

  public Long getTravelTimeInSeconds() {
    return travelTimeInSeconds;
  }

  public void setTravelTimeInSeconds(Long travelTimeInSeconds) {
    this.travelTimeInSeconds = travelTimeInSeconds;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
