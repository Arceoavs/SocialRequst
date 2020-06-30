package de.wwu.acse.leaderboard.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import de.wwu.acse.leaderboard.model.Fulfillment;
import de.wwu.acse.leaderboard.service.FulfillmentService;

@Component
public class FulfillmentListener {

  @Autowired
  private FulfillmentService fulfillmentService;

  @JmsListener(destination = "fulfillments")
  public void onFulfillment(Fulfillment fulfillment) {
    fulfillmentService.createFulfillment(fulfillment);
  }

}