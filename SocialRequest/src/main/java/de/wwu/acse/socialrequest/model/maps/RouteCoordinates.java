package de.wwu.acse.socialrequest.model.maps;

public class RouteCoordinates {

  private Coordinates origin;

  private Coordinates destination;

  public RouteCoordinates(Coordinates origin, Coordinates destination) {
    this.origin = origin;
    this.destination = destination;
  }

  public Coordinates getOrigin() {
    return this.origin;
  }

  public void setOrigin(Coordinates origin) {
    this.origin = origin;
  }

  public Coordinates getDestination() {
    return this.destination;
  }

  public void setDestination(Coordinates destination) {
    this.destination = destination;
  }

}
