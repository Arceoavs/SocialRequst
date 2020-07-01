package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Instruction {
  
  @NotNull
  int distance;

  @NotNull
  String street;

  @NotNull
  String message;

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getDistance() {
    return this.distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

}
