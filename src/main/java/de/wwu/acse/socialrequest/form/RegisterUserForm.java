package de.wwu.acse.socialrequest.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import de.wwu.acse.socialrequest.lib.UniversalGetter;
import de.wwu.acse.socialrequest.validator.annotation.PasswordMatches;
import de.wwu.acse.socialrequest.validator.annotation.ValidEmail;

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

  @NotNull(message = "Latitude required")
  private Float lat;

  @NotNull(message = "Longitude required")
  private Float lng;

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
  public Float getLat() {
    return lat;
  }

  /**
   * @param lat the lat to set
   */
  public void setLat(Float lat) {
    this.lat = lat;
  }

  /**
   * @return the lng
   */
  public Float getLng() {
    return lng;
  }

  /**
   * @param lng the lng to set
   */
  public void setLng(Float lng) {
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
