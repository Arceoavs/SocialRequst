package de.wwu.acse.group6.leaderboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.wwu.acse.group6.leaderboard.model.Fulfillment;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {
}