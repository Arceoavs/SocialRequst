package de.wwu.acse.socialrequest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "requests")
public class Request implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Title required")
  @Size(min = 1, message = "Title too short")
  private String title;

  @NotBlank(message = "Description required")
  private String description;

  private float lat;
  private float lng;

  @CreatedDate
  private Date createdAt;

  @OneToOne(mappedBy = "request", cascade = CascadeType.ALL)
  private Fulfillment fulfillment;

  @NotNull(message = "User required")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
  private User user;

  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(
    name = "requests_topics",
    joinColumns = {@JoinColumn(name = "request_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "topic_id", referencedColumnName = "id")}
  )
  private Set<Topic> topics;

  public Request() {}

  public Request(String title, String description, float lat, float lng, User user) {
    this.title = title;
    this.description = description;
    this.lat = lat;
    this.lng = lng;
    this.user = user;
  }

  public Request(String title, String description, float lat, float lng, User user, Set<Topic> topics) {
    this.title = title;
    this.description = description;
    this.lat = lat;
    this.lng = lng;
    this.user = user;
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

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public boolean isFulfilled() {
    return this.fulfillment != null;
  }

  public Fulfillment getFulfillment() {
    return this.fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public Set<Topic> getTopics() {
    return this.topics;
  }

  public void setTopics(Set<Topic> topics) {
    this.topics = topics;
  }

}
