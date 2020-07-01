package de.wwu.acse.socialrequest.model.maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Instruction implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotNull
  private String message;

  private String street;

  @NotNull
  private Integer distance;

  @NotNull
  private Integer travelTime;

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getDistance() {
    return this.distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Integer getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }

}
