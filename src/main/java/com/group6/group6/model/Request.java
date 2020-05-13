package com.group6.group6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Request {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "Title required")
  @Size(min = 1, message = "Title required")
  private String title;

  private String description;

  private long lat;
  private long lng;

  @GeneratedValue(strategy = GenerationType.AUTO)
  private DateTimeAtCreation createdAt; //Todo: test if this works

  // private User userId; // User Model required

  protected Request(){}

  public Request(String title, String description, long lat, long lng){
      this.title = title;
      this.description = description;
      this.lat = lat;
      this.lng = lng;
  }

  public Long getId(){
    return this.id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getTitle(){
    return this.title;
  }

  public void setTitle(String title){
    this.title = title;
  }
  
  public String getDescription(){
    return this.description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public long getLat(){
      return this.lat;
  }

  public void setLat(long lat){
      this.lat = lat;
  }

  public long getLng(){
      return this.lng;
  }

  public void setLng(long lng){
      this.lng = lng;
  }

  // returns an array consisting of both lng and lat that together form the location of the object
  public long[] getLocation(){
    long[] location = new long[]{lng, lat};
    return location;
  }

  public DateTimeAtCreation getCreatedAt(){
    return this.createdAt;
  }

  public void setCreatedAt(DateTimeAtCreation createdAt){
    this.createdAt = createdAt;
  }
}