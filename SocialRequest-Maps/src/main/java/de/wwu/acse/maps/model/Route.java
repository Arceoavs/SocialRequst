package de.wwu.acse.maps.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

public class Route {

  @NotNull
  Set<Instruction> instructions; 

  @NotNull
  int travelTimeInSeconds;

  public int getTravelTimeInSeconds() {
    return this.travelTimeInSeconds;
  }

  public void setTravelTimeInSeconds(int travelTimeInSeconds) {
    this.travelTimeInSeconds = travelTimeInSeconds;
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
