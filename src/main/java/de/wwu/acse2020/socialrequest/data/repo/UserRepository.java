package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import de.wwu.acse2020.socialrequest.data.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByUsername(String username);
	
	User findByUsername(String username);
	
}
