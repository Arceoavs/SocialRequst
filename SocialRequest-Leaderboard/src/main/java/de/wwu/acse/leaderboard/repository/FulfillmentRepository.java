package de.wwu.acse.leaderboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.wwu.acse.leaderboard.model.Fulfillment;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {
}