package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.model.maps.Coordinates;
import de.wwu.acse.socialrequest.model.maps.Distance;

public interface MapsApiService {

  public Distance getDistance(Coordinates origin, Coordinates destination);

}
