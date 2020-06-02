package de.wwu.acse.group6.socialrequest.form;

import javax.validation.constraints.NotBlank;

import de.wwu.acse.group6.socialrequest.lib.UniversalGetter;
import de.wwu.acse.group6.socialrequest.validator.annotation.PasswordMatches;
import de.wwu.acse.group6.socialrequest.validator.annotation.ValidEmail;

@PasswordMatches
public class RegisterUserForm implements UniversalGetter {

  @NotBlank(message = "Username required")
  private String username;

  @NotBlank(message = "Email required")
  @ValidEmail
  private String email;

  @NotBlank(message = "Password required")
  private String password;

  private String passwordConfirmation;

  private float lat;
  private float lng;

  public RegisterUserForm() {}

  @Override
  public Object get(String field) {
    switch (field) {
      case "password":
        return this.password;

      case "passwordConfirmation":
        return this.passwordConfirmation;

      default:
        return null;
    }
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the lat
   */
  public float getLat() {
    return lat;
  }

  /**
   * @param lat the lat to set
   */
  public void setLat(float lat) {
    this.lat = lat;
  }

  /**
   * @return the lng
   */
  public float getLng() {
    return lng;
  }

  /**
   * @param lng the lng to set
   */
  public void setLng(float lng) {
    this.lng = lng;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the passwordConfirmation
   */
  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }

  /**
   * @param passwordConfirmation the passwordConfirmation to set
   */
  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

}
