package de.wwu.acse.leaderboard.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.wwu.acse.leaderboard.repository.FulfillmentRepository;
import de.wwu.acse.leaderboard.soap.GetAlltimeResponse;
import de.wwu.acse.leaderboard.soap.Leaderboard;
import de.wwu.acse.leaderboard.soap.GetAlltimeRequest;

@Endpoint
public class SOAPLeaderboardAlltimeWebService {
  private static final String NAMESPACE = "soap.leaderboard.acse.group6.wwu.de";
  private FulfillmentRepository fulfillmentRepository;

  @Autowired
  public SOAPLeaderboardAlltimeWebService(FulfillmentRepository fulfillmentRepository) {
    this.fulfillmentRepository = fulfillmentRepository;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getAlltimeRequest")
  @ResponsePayload
  public GetAlltimeResponse getLeaderboard(@RequestPayload GetAlltimeRequest request) {
    GetAlltimeResponse response = new GetAlltimeResponse();
    // TODO
    response.setAlltimeLeaderboard(new Leaderboard());
    return response;
  }

}
