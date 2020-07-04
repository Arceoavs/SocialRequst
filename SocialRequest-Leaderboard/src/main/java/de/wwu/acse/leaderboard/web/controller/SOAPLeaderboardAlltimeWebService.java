package de.wwu.acse.leaderboard.web.controller;

import de.wwu.acse.leaderboard.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.wwu.acse.leaderboard.repository.FulfillmentRepository;

import java.util.List;

@Endpoint
public class SOAPLeaderboardAlltimeWebService {
  private static final String NAMESPACE = "soap.leaderboard.acse.wwu.de";
  private FulfillmentRepository fulfillmentRepository;

  @Autowired
  public SOAPLeaderboardAlltimeWebService(FulfillmentRepository fulfillmentRepository) {
    this.fulfillmentRepository = fulfillmentRepository;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getAlltimeRequest")
  @ResponsePayload
  public GetAlltimeResponse getLeaderboard(@RequestPayload GetAlltimeRequest request) {
    GetAlltimeResponse response = new GetAlltimeResponse();
    Leaderboard leaderboard = new Leaderboard();
    List<LeaderboardPlace> leaderboardPlaces = leaderboard.getLeaderboardPlaces();
    List<String> leaderboard_users = fulfillmentRepository.allTimeLeaderboardUsers();
    List<Float> leaderboard_kilometers = fulfillmentRepository.allTimeLeaderboardKilometers();
    fillLeaderboard(leaderboardPlaces, leaderboard_users, leaderboard_kilometers);
    response.setAlltimeLeaderboard(leaderboard);
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getMonthlyRequest")
  @ResponsePayload
  public GetMonthlyResponse getLeaderboard(@RequestPayload GetMonthlyRequest request) {
    GetMonthlyResponse response = new GetMonthlyResponse();
    Leaderboard leaderboard = new Leaderboard();
    List<LeaderboardPlace> leaderboardPlaces = leaderboard.getLeaderboardPlaces();
    List<String> leaderboard_users = fulfillmentRepository.monthlyLeaderboardUsers();
    List<Float> leaderboard_kilometers = fulfillmentRepository.monthlyLeaderboardKilometers();
    fillLeaderboard(leaderboardPlaces, leaderboard_users, leaderboard_kilometers);
    response.setMonthlyLeaderboard(leaderboard);
    return response;
  }

  private void fillLeaderboard(List<LeaderboardPlace> leaderboardPlaces, List<String> leaderboard_users, List<Float> leaderboard_kilometers) {
    int leaderboard_length = Math.min(leaderboard_users.size(), 10);
    for (int i = 0; i < leaderboard_length; i++) {
      LeaderboardPlace leaderboardPlace = new LeaderboardPlace();
      leaderboardPlace.setUser(leaderboard_users.get(i));
      leaderboardPlace.setKilometers(leaderboard_kilometers.get(i));
      leaderboardPlaces.add(leaderboardPlace);
    }
  }
}
