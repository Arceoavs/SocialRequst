package de.wwu.acse.socialrequest.model.Maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Coordinates implements Serializable {

  @NotNull
  private String lat;

  @NotNull
  private String lon;

  public Coordinates(String lat, String lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public String getLat() {
    return this.lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return this.lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }
}
