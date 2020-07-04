package de.wwu.acse.leaderboard.model.dto;

import javax.validation.constraints.NotNull;

public class UserDto {

  @NotNull
  private String username;

  @NotNull
  private Double kilometers;

  public UserDto(String username, Double kilometers) {
    this.username = username;
    this.kilometers = kilometers;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Double getKilometers() {
    return kilometers;
  }

  public void setKilometers(Double kilometers) {
    this.kilometers = kilometers;
  }

}