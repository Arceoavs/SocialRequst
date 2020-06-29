package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Coordinates {

  @NotNull
  private float lat;

  @NotNull
  private float lon;

  public float getLat() {
    return this.lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLon() {
    return this.lon;
  }

  public void setLon(float lon) {
    this.lon = lon;
  }

}
