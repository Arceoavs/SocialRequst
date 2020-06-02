package de.wwu.acse2020.socialrequest.web.controller.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.Topic;

public class RequestDto implements Serializable {
  private static final long serialVersionUID = -6239797288571061722L;

  @NotBlank
  private String title;

  @NotBlank
  private String description;

  @NotNull
  @Min(value = -90)
  @Max(value = 90)
  private float latitude;

  @NotNull
  @Min(value = -180)
  @Max(value = 180)
  private float longitude;

  @Pattern(regexp = "[a-zA-Z0-9,]*")
  private String topics;

  public Request toRequest() {
    return updateRequest(new Request());
  }

  public Request updateRequest(Request request) {
    request.setTitle(title);
    request.setDescription(description);
    request.setLatitude(latitude);
    request.setLongitude(longitude);
    if (topics != null) {
      Set<Topic> topicSet = Arrays.stream(topics.split(",")).
              filter(s -> !"".equals(s)).
              map(s -> {
                Topic t = new Topic();
                t.setName(s);
                return t;
              }).
              collect(Collectors.toSet());
      request.setTopics(topicSet);
    }
    return request;
  }

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

  public String getTopics() {
    return topics;
  }

  public void setTopics(String topics) {
    this.topics = topics;
  }
}
