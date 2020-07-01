package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Address {

  @NotNull
  String address;

  public String getAddress() {
    return this.address;
  } 

  public void setAddress(String address) {
    this.address = address;
  }

}
