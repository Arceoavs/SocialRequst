package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.model.Maps.Instruction;
import de.wwu.acse.socialrequest.model.Request;

import java.util.List;

public interface MapsService {

  /**
   * Method to get a list of instructions to go to a destination
   * The start location must be read from the user in the implementation
   * @param requestLat latitude of the destination
   * @param requestLng longitude of the destination
   * @return list of instructions
   */
  public List<Instruction> getDirections(float requestLat, float requestLng);

}
