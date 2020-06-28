package de.wwu.acse.maps.model;

import javax.validation.constraints.NotNull;

public class Coordinates {

  @NotNull
  private String lat;

  @NotNull
  private String lon;

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

}
