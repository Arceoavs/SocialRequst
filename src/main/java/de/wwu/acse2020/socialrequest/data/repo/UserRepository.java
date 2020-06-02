package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.wwu.acse2020.socialrequest.data.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);

  boolean existsByUsername(String username);
}
