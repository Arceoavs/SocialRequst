package com.group6.group6.model;

import java.util.HashSet;
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
      this.instructions = new HashSet<>();
    }
		this.instructions.add(instructions);
	}

}