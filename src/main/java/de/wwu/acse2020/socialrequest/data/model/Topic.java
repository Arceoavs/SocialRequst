package de.wwu.acse2020.socialrequest.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Pattern(regexp = "[a-zA-Z0-9]+")
	private String name;
	
	@ManyToMany(mappedBy = "specialties")
	private Set<User> users;
	
	@ManyToMany(mappedBy = "topics")
	private Set<Request> requests;
	
	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public Set<User> getUsers() {
	    return users;
	}
	
	public void setUsers(Set<User> users) {
	    this.users = users;
	}
	
	public void addUser(User user) {
	    if (users == null) {
	      users = new HashSet<>();
	    }
	    users.add(user);
	}
	
	public Set<Request> getRequests() {
	    return requests;
	}
	
	public void setRequests(Set<Request> requests) {
	    this.requests = requests;
	}
	
	public void addRequest(Request request) {
	    if (requests == null) {
	      requests = new HashSet<>();
	    }
	    requests.add(request);
	}
	
	@Override
	public String toString() {
		return (
			"Topic{" +
			"name='" + name + '\'' +
			'}'
		);
	}
}
