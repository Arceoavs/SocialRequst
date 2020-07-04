package de.wwu.acse.leaderboard.web.controller;

import de.wwu.acse.leaderboard.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.wwu.acse.leaderboard.service.LeaderboardService;
import de.wwu.acse.leaderboard.service.LeaderboardService.LeaderboardType;


@Endpoint
public class SOAPLeaderboardWebService {

  private static final String NAMESPACE = "soap.leaderboard.acse.wwu.de";

  @Autowired
  private LeaderboardService leaderboardService;

  @PayloadRoot(namespace = NAMESPACE, localPart = "getAllTimeLeaderboardRequest")
  @ResponsePayload
  public GetAllTimeLeaderboardResponse getLeaderboard(@RequestPayload GetAllTimeLeaderboardRequest request) {
    GetAllTimeLeaderboardResponse response = new GetAllTimeLeaderboardResponse();
    Leaderboard leaderboard = new Leaderboard();
    leaderboardService.prepareLeaderboard(leaderboard, LeaderboardType.ALL_TIME);
    response.setAllTimeLeaderboard(leaderboard);

    return response;
  }

  @PayloadRoot(namespace = NAMESPACE, localPart = "getMonthlyLeaderboardRequest")
  @ResponsePayload
  public GetMonthlyLeaderboardResponse getLeaderboard(@RequestPayload GetMonthlyLeaderboardRequest request) {
    GetMonthlyLeaderboardResponse response = new GetMonthlyLeaderboardResponse();
    Leaderboard leaderboard = new Leaderboard();
    leaderboardService.prepareLeaderboard(leaderboard, LeaderboardType.MONTH);
    response.setMonthlyLeaderboard(leaderboard);

    return response;
  }

}
