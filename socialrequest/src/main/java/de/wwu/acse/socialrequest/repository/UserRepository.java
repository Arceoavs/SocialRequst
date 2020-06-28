package de.wwu.acse.socialrequest.repository;

import de.wwu.acse.socialrequest.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUsername(String username);

  public User findByEmail(String email);

  @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.id != :id AND u.username = :username")
  public boolean otherUserExistsWithUsername(@Param("username") String username, @Param("id") Long id);

  @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.id != :id AND u.email = :email")
  public boolean otherUserExistsWithEmail(@Param("email") String email, @Param("id") Long id);

}
