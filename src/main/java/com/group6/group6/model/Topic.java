package com.group6.group6.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Topic {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Pattern(regexp = "^\\w+$", message = "Only alphernumeric characters without whitespace")
  @NotBlank(message = "Topic name required")
  @Size(min = 1, message = "Topic name required")
  @Column(unique = true)
  private String name;

  protected Topic() {}

  public Topic(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return this.id;
  }

}
