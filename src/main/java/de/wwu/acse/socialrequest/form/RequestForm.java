package de.wwu.acse.socialrequest.form;

import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import de.wwu.acse.socialrequest.model.Topic;
import de.wwu.acse.socialrequest.model.User;

public class RequestForm {

  @NotBlank(message = "Title required")
  @Size(min = 1, message = "Title too short")
  private String title;

  @NotBlank(message = "Description required")
  private String description;

  @NotNull(message = "Latitude required")
  private Float lat;

  @NotNull(message = "Longitude required")
  private Float lng;

  @NotNull(message = "User required")
  private User user;

  @Valid
  private Set<Topic> topics;

  public RequestForm() {}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Float getLat() {
    return lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public Float getLng() {
    return lng;
  }

  public void setLng(Float lng) {
    this.lng = lng;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Set<Topic> getTopics() {
    return topics;
  }

  public void setTopics(Set<Topic> topics) {
    this.topics = topics;
  }

}