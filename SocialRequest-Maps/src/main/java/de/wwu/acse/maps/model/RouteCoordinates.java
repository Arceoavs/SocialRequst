package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class RouteCoordinates {

  @NotNull
  Coordinates origin;

  @NotNull
  Coordinates destination;

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
