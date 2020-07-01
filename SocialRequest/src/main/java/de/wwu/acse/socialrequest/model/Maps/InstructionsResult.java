package de.wwu.acse.socialrequest.model.Maps;

import java.util.ArrayList;
import java.util.List;

public class InstructionsResult {
  private List<Instruction> instructions;

  private int travelTimeInSeconds;

  public void setInstructions(List<Instruction> instructions) {
    this.instructions = instructions;
  }

  public void setTravelTimeInSeconds(int travelTimeInSeconds) {
    this.travelTimeInSeconds = travelTimeInSeconds;
  }

  public List<Instruction> getInstructions() {
    return instructions;
  }

  public int getTravelTimeInSeconds() {
    return travelTimeInSeconds;
  }
}
