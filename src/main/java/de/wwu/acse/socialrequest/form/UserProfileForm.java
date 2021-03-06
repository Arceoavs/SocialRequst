package de.wwu.acse.socialrequest.form;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import de.wwu.acse.socialrequest.model.Topic;
import de.wwu.acse.socialrequest.validator.annotation.ValidEmail;

public class UserProfileForm {

  private Long id;

  @NotBlank(message = "Username required")
  private String username;

  @NotBlank(message = "Email required")
  @ValidEmail
  private String email;

  @NotNull(message = "Latitude required")
  private Float lat;

  @NotNull(message = "Longitude required")
  private Float lng;

  private Set<Topic> specialties;

  public UserProfileForm(Long id, String username, String email, Set<Topic> specialties, Float lat, Float lng) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.specialties = specialties;
    if (specialties == null) this.specialties = new HashSet<>();
    this.lat = lat;
    this.lng = lng;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
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
   * @return the specialties
   */
  public Set<Topic> getSpecialties() {
    return specialties;
  }

  /**
   * @param specialties the specialties to set
   */
  public void setSpecialties(Set<Topic> specialties) {
    this.specialties = specialties;
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

}
