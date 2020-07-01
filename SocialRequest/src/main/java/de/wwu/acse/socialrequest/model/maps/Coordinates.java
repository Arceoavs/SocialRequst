package de.wwu.acse.socialrequest.model.maps;

public class Coordinates {

  private float lat;

  private float lon;

  public Coordinates(float lat, float lon) {
    this.lat = lat;
    this.lon = lon;
  }

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
