package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Coordinates {

  @NotNull
  private Float lat;

  @NotNull
  private Float lon;

  public Float getLat() {
    return this.lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public Float getLon() {
    return this.lon;
  }

  public void setLon(Float lon) {
    this.lon = lon;
  }

}
