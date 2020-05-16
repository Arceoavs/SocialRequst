package com.group6.group6.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Request {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "Title required")
  @Size(min = 1, message = "Title required")
  private String title;

  private String description;
  private float lat;
  private float lng;

  @CreatedDate
  private Date createdAt;

  @ManyToMany(cascade = CascadeType.PERSIST)
  private Set<Topic> topics;

  protected Request() {}

  public Request(String title, String description, float lat, float lng) {
    this.title = title;
    this.description = description;
    this.lat = lat;
    this.lng = lng;
  }

  public Request(String title, String description, float lat, float lng, Set<Topic> topics) {
    this.title = title;
    this.description = description;
    this.lat = lat;
    this.lng = lng;
    this.topics = topics;
  }

  public Long getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public float getLat() {
    return this.lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLng() {
    return this.lng;
  }

  public void setLng(float lng) {
    this.lng = lng;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public Set<Topic> getTopics() {
    return this.topics;
  }

  public void setTopics(Set<Topic> topics) {
    this.topics = topics;
  }
}
