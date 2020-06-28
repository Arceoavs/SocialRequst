package de.wwu.acse.maps.service;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.model.Route;

public interface TTApiService {

  public Coordinates getCoordinates (String query);

  public Route getRoute(Coordinates origin, Coordinates destination);
}
