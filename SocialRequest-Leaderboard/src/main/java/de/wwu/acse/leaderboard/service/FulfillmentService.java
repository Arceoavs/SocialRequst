package de.wwu.acse.leaderboard.service;

import org.springframework.stereotype.Service;

import de.wwu.acse.leaderboard.model.Fulfillment;

@Service
public interface FulfillmentService {

  public Fulfillment createFulfillment(Fulfillment fulfillment);

}