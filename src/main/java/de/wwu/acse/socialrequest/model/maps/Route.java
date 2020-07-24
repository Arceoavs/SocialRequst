package de.wwu.acse.socialrequest.model.maps;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class Route {

  @NotNull
  private List<Instruction> instructions;

  @NotNull
  private int travelTimeInSeconds;

  @NotNull
  private int travelDistanceInMeters;

  public int getTravelTimeInSeconds() {
    return this.travelTimeInSeconds;
  }

  public void setTravelTimeInSeconds(int travelTimeInSeconds) {
    this.travelTimeInSeconds = travelTimeInSeconds;
  }

  public int getTravelDistanceInMeters() {
    return travelDistanceInMeters;
  }

  public void setTravelDistanceInMeters(int travelDistanceInMeters) {
    this.travelDistanceInMeters = travelDistanceInMeters;
  }

  public List<Instruction> getInstructions() {
    return this.instructions;
  }

  public void setInstructions(List<Instruction> instructions) {
    this.instructions = instructions;
  }

  public void addInstructions(Instruction instructions) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructions);
  }

}
