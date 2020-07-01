package de.wwu.acse.maps.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

public class Route {

  @NotNull
  private Set<Instruction> instructions;

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

  public Set<Instruction> getInstructions() {
    return this.instructions;
  }

  public void setInstructions(Set<Instruction> instructions) {
    this.instructions = instructions;
  }

  public void addInstructions(Instruction instructions) {
    if (this.instructions == null) {
      this.instructions = new LinkedHashSet<>();
    }
    this.instructions.add(instructions);
  }

}
