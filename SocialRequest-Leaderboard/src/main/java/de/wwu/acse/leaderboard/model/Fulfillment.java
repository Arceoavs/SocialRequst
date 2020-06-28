package de.wwu.acse.leaderboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "fulfillments", uniqueConstraints = @UniqueConstraint(columnNames = { "request_id", "user_id" }))
@Entity
public class Fulfillment implements Serializable {

  private static final long serialVersionUID = 6087808644310117815L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private Date createdAt;

  private Long requestId;

  private Long userId;

  public Long getId() {
    return this.id;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public Request getRequest() {
    return this.request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
