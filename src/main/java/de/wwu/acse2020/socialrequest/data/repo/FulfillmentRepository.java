package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Fulfillment;
import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.data.model.Request;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {
	@Query(
		"SELECT f " +
		"FROM Fulfillment f " +
		"WHERE f.user =  :user f.request =  :request  "
	)
	Fulfillment findOneByUserAndRequest(@Param("user") User user, @Param("request") Request request);
	
	List<Fulfillment> findAllByUserOrderByCreatedAtDesc(User user);
	
	boolean existsByRequest(Request request);
	
}
