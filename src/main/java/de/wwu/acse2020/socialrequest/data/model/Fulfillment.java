package de.wwu.acse2020.socialrequest.data.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Fulfillment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Past
	private Date createdAt;
	
	@NotNull
	@ManyToOne
	private User user;
	
	@NotNull
	@OneToOne
	private Request request;
	
	public long getId() {
	    return id;
	}
	
	public void setId(long id) {
	    this.id = id;
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
	
	public Request getRequest() {
	    return request;
	}
	
	public void setRequest(Request request) {
	    this.request = request;
	}
	
	@Override
	public String toString() {
		return (
			"Fulfillment{" +
			"id='" + id + '\'' +
			"createdAt='" + createdAt + '\'' +
			'}'
		);
	}
}
