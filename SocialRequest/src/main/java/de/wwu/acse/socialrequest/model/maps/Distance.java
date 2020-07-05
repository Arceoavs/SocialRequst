package de.wwu.acse.socialrequest.model.maps;

public class Distance {

  private int lengthInMeters;

  public int getLengthInMeters() {
    return lengthInMeters;
  }

  public void setLengthInMeters(int lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }

  public double getLengthInKilometers() {
    return lengthInMeters / 1000.0;
  }

}
