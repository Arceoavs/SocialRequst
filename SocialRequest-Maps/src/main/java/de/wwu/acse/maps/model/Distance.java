package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Distance {

  @NotNull
  private int lengthInMeters;

  public int getLengthInMeters() {
    return this.lengthInMeters;
  }

  public void setLengthInMeters(int lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }

}
