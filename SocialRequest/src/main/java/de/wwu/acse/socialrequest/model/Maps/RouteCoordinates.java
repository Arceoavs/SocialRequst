package de.wwu.acse.socialrequest.model.Maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RouteCoordinates implements Serializable {
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
