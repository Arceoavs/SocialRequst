package de.wwu.acse2020.socialrequest.data.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User implements UserDetails {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	@Column(unique = true)
	private String username;
	
	@NotBlank
	private String password;
	
	@Transient
	private String rawPassword;
	
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	@Min(-90)
	@Max(90)
	private float latitude;
	
	@NotNull
	@Min(-180)
	@Max(180)
	private float longitude;
	
	@OneToMany(mappedBy = "user")
	private Set<Request> requests;
	
	@OneToMany(mappedBy = "user")
	private Set<Fulfillment> fulfillments;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Topic> specialties;
	
	public long getId() {
	    return id;
	}
	
	public void setId(long id) {
	    this.id = id;
	}
	
	public String getUsername() {
	    return username;
	}
	
	public void setUsername(String username) {
	    this.username = username;
	}
	
	public String getPassword() {
	    return password;
	}
	
	public void setPassword(String password) {
	    this.password = password;
	}
	
	public String getRawPassword() {
	    return rawPassword;
	}
	
	public void setRawPassword(String rawPassword) {
	    this.rawPassword = rawPassword;
	}
	
	public String getEmail() {
	    return email;
	}
	
	public void setEmail(String email) {
	    this.email = email;
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
	
	public Set<Fulfillment> getFulfillments() {
	    return fulfillments;
	}
	
	public void setFulfillments(Set<Fulfillment> fulfillments) {
	    this.fulfillments = fulfillments;
	}
	
	public void addFulfillment(Fulfillment fulfillment) {
	    if (fulfillments == null) {
	      fulfillments = new HashSet<>();
	    }
	    fulfillments.add(fulfillment);
	}
	
	public Set<Topic> getSpecialties() {
	    return specialties;
	}
	
	public void setSpecialties(Set<Topic> specialties) {
	    this.specialties = specialties;
	}
	
	public void addTopic(Topic topic) {
	    if (specialties == null) {
	      specialties = new HashSet<>();
	    }
	    specialties.add(topic);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	@Override
	public String toString() {
		return (
			"User{" +
			"id='" + id + '\'' +
			"username='" + username + '\'' +
			"password='" + password + '\'' +
			"email='" + email + '\'' +
			"latitude='" + latitude + '\'' +
			"longitude='" + longitude + '\'' +
			'}'
		);
	}
}
