package de.wwu.acse.leaderboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.wwu.acse.leaderboard.model.Fulfillment;
import de.wwu.acse.leaderboard.repository.FulfillmentRepository;
import de.wwu.acse.leaderboard.service.FulfillmentService;

@Service
public class FulfillmentServiceImpl implements FulfillmentService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  @Override
  public Fulfillment createFulfillment(Fulfillment fulfillment) {
    if (!this.fulfillmentRepository.existsByUsernameAndRequestId(fulfillment.getUsername(),
        fulfillment.getRequestId())) {
      fulfillment = fulfillmentRepository.saveAndFlush(fulfillment);
      return fulfillment;
    }

    return null;
  }

}