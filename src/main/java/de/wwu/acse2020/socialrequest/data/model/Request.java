package de.wwu.acse2020.socialrequest.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
public class Request implements Serializable {
  private static final long serialVersionUID = 8007774269905869105L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank
  private String title;

  @NotBlank
  @Lob
  private String description;

  @NotNull
  @Min(value = -90)
  @Max(value = 90)
  private float latitude;

  @NotNull
  @Min(value = -180)
  @Max(value = 180)
  private float longitude;

  @NotNull
  @Past
  private Date createdAt;

  @NotNull
  @ManyToOne
  private User user;

  @OneToOne(mappedBy = "request")
  private Fulfillment fulfillment;

  @ManyToMany(fetch = FetchType.EAGER)
  private Set<Topic> topics;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public Set<Topic> getTopics() {
    return topics;
  }

  public void setTopics(Set<Topic> topics) {
    this.topics = topics;
  }

  public void addTopic(Topic topic) {
    if (topics == null) {
      topics = new HashSet<>();
    }
    topics.add(topic);
  }

  @Override
  public String toString() {
    return "Request{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", latitude="
            + latitude + ", longitude=" + longitude + ", createdAt=" + createdAt + ", user=" + user + ", fulfillment="
            + fulfillment + '}';
  }
}
