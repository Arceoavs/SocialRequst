package de.wwu.acse2020.socialrequest.web.controller.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import de.wwu.acse2020.socialrequest.data.model.Topic;
import de.wwu.acse2020.socialrequest.data.model.User;

public class UserDto implements Serializable {
  private static final long serialVersionUID = 2879663132117472030L;

  @NotBlank
  private String username;

  // NotBlank is ensured by business logic
  private String rawPassword;

  @NotBlank
  @Email
  private String email;

  @NotNull
  @Min(value = -90)
  @Max(value = 90)
  private float latitude;

  @NotNull
  @Min(value = -180)
  @Max(value = 180)
  private float longitude;

  @Pattern(regexp = "[a-zA-Z0-9,]*")
  private String specialties;

  public UserDto() {
  }

  public UserDto(User user) {
    username = user.getUsername();
    rawPassword = user.getRawPassword();
    email = user.getEmail();
    latitude = user.getLatitude();
    longitude = user.getLongitude();
    if (user.getSpecialties() != null) {
      specialties = user.getSpecialties().stream().
              map(Topic::getName).
              collect(Collectors.joining(","));
    }
  }

  public User toUser() {
    return updateUser(new User());
  }

  public User updateUser(User user) {
    user.setUsername(username);
    user.setRawPassword(rawPassword);
    user.setEmail(email);
    user.setLatitude(latitude);
    user.setLongitude(longitude);
    if (specialties != null) {
      Set<Topic> topicSet = Arrays.stream(specialties.split(",")).
              filter(s -> !"".equals(s)).
              map(s -> {
                Topic t = new Topic();
                t.setName(s);
                return t;
              }).
              collect(Collectors.toSet());
      user.setSpecialties(topicSet);
    }
    return user;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRawPassword() {
    return rawPassword;
  }

  public void setRawPassword(String rawPassword) {
    this.rawPassword = rawPassword;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public String getSpecialties() {
    return specialties;
  }

  public void setSpecialties(String specialties) {
    this.specialties = specialties;
  }
}
