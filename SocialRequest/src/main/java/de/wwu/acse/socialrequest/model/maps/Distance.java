package de.wwu.acse.socialrequest.model.maps;

public class Distance {

  private int lengthInMeters;

  public Distance(int lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }

  public int getLengthInMeters() {
    return lengthInMeters;
  }

  public void setLengthInMeters(int lengthInMeters) {
    this.lengthInMeters = lengthInMeters;
  }

  public float getLengthInKilometers() {
    return (float) (lengthInMeters / 1000.0);
  }

}