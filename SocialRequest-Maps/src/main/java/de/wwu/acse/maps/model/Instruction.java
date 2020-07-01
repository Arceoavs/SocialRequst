package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Instruction {

  @NotNull
  private String message;

  public Instruction(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
