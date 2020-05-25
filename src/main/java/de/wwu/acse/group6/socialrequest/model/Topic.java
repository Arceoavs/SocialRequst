package de.wwu.acse.group6.socialrequest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "topics")
public class Topic implements Serializable {

  private static final long serialVersionUID = -881990671040233496L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Pattern(regexp = "^\\w+$", message = "Only alphernumeric characters without whitespace")
  @NotBlank(message = "Topic name required")
  @Size(min = 1, message = "Topic name required")
  @Column(unique = true)
  private String name;

  @ManyToMany(mappedBy = "topics")
  private Set<Request> requests;

  protected Topic() {}

  public Topic(String name) {
    this.name = name;
  }

  public Topic(String name, Set<Request> requests) {
    this.name = name;
    this.requests = requests;
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

  public Set<Request> getRequests() {
    return this.requests;
  }

  public void setRequests(Set<Request> requests) {
    this.requests = requests;
  }
}
