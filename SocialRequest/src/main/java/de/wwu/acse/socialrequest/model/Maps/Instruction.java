package de.wwu.acse.socialrequest.model.Maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Instruction implements Serializable {

  @NotNull
  String message;

  @NotNull
  String street;

  @NotNull
  int distance;

  @NotNull
  int time;

  public Instruction(@NotNull String message, @NotNull String street, @NotNull int distance, @NotNull int time) {
    this.message = message;
    this.street = street;
    this.distance = distance;
    this.time = time;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }
}
