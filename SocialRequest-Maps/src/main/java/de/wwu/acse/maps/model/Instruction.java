package com.group6.group6.model;

import javax.validation.constraints.NotNull;

public class Instruction {
  
  @NotNull
  String message;

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