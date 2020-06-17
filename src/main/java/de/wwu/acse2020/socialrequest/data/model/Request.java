package de.wwu.acse2020.socialrequest.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String title;
	
	@Lob
	@NotBlank
	private String description;
	
	@NotNull
	@Min(-90)
	@Max(90)
	private float latitude;
	
	@NotNull
	@Min(-180)
	@Max(180)
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
		return (
			"Request{" +
			"id='" + id + '\'' +
			"title='" + title + '\'' +
			"description='" + description + '\'' +
			"latitude='" + latitude + '\'' +
			"longitude='" + longitude + '\'' +
			"createdAt='" + createdAt + '\'' +
			'}'
		);
	}
}
