package de.wwu.acse.socialrequest.model.maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Coordinates implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotNull
  private Float lat;

  @NotNull
  private Float lon;

  public Coordinates(Float lat, Float lon) {
    this.lat = lat;
    this.lon = lon;
  }

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
