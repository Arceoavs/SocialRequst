package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Fulfillment;
import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {
  List<Fulfillment> findByOrderByCreatedAtDesc();

  List<Fulfillment> findAllByUserOrderByCreatedAtDesc(User user);

  boolean existsByRequest(Request request);
}
