package de.wwu.acse.socialrequest.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import de.wwu.acse.socialrequest.validator.annotation.ValidEmail;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User implements Serializable {

  private static final long serialVersionUID = -1956519973875122971L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Username required")
  @Column(unique = true)
  private String username;

  @NotBlank(message = "Email required")
  @ValidEmail
  @Column(unique = true)
  private String email;

  @NotBlank(message = "Password required")
  private String password;

  private float lat;
  private float lng;

  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(
    name = "specialties",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "topic_id", referencedColumnName = "id")}
  )
  private Set<Topic> specialties;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private Set<Request> submittedRequests;

  @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
  private Set<Fulfillment> fulfillments = new HashSet<>();

  @OneToMany
  @JoinTable(
    name = "fulfillments",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "request_id", referencedColumnName = "id")}
  )
  private Set<Request> fulfilledRequests;

  public User() {}

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public User(String username, String email, String password, float lat, float lng) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.lat = lat;
    this.lng = lng;
  }

  @PreRemove
  private void preRemove() {
    for (Fulfillment fulfillment : fulfillments) {
      fulfillment.setUser(null);
    }
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public float getLat() {
    return lat;
  }

  public void setLat(float lat) {
    this.lat = lat;
  }

  public float getLng() {
    return lng;
  }

  public void setLng(float lng) {
    this.lng = lng;
  }

  public Set<Topic> getSpecialties() {
    return this.specialties;
  }

  public void setSpecialties(Set<Topic> specialties) {
    this.specialties = specialties;
  }

  public Set<Request> getFulfilledRequests() {
    return this.fulfilledRequests;
  }

  public Set<Request> getSubmittedRequests() {
    return this.submittedRequests;
  }

}
