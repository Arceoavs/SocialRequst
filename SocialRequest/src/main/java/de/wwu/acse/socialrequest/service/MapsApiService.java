package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.model.maps.Coordinates;
import de.wwu.acse.socialrequest.model.maps.Distance;
import de.wwu.acse.socialrequest.model.maps.Instruction;

import java.util.List;

public interface MapsApiService {

  public Distance getDistance(Coordinates origin, Coordinates destination);

  /**
   * Method to get a list of instructions to go to a destination
   * The start location must be read from the user in the implementation
   * @param requestLat latitude of the destination
   * @param requestLng longitude of the destination
   * @return list of instructions
   */
  public List<Instruction> getDirections(Coordinates origin, Coordinates destination);

}
