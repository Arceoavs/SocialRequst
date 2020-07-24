package de.wwu.acse.socialrequest.consumer;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import de.wwu.acse.leaderboard.wsdl.GetAllTimeLeaderboardRequest;
import de.wwu.acse.leaderboard.wsdl.GetAllTimeLeaderboardResponse;
import de.wwu.acse.leaderboard.wsdl.GetMonthlyLeaderboardRequest;
import de.wwu.acse.leaderboard.wsdl.GetMonthlyLeaderboardResponse;
import de.wwu.acse.leaderboard.wsdl.Leaderboard;

public class LeaderboardSoapClient extends WebServiceGatewaySupport {

  private static final String SOAP_URL = "http://localhost:8082/ws";

  public Leaderboard getAllTimeLeaderboard() {
    GetAllTimeLeaderboardRequest request = new GetAllTimeLeaderboardRequest();
    GetAllTimeLeaderboardResponse response = (GetAllTimeLeaderboardResponse) getWebServiceTemplate()
        .marshalSendAndReceive(SOAP_URL, request);

    if (response != null) {
      return response.getAllTimeLeaderboard();
    }

    return null;
  }

  public Leaderboard getMonthlyLeaderboard() {
    GetMonthlyLeaderboardRequest request = new GetMonthlyLeaderboardRequest();
    GetMonthlyLeaderboardResponse response = (GetMonthlyLeaderboardResponse) getWebServiceTemplate()
        .marshalSendAndReceive(SOAP_URL, request);

    if (response != null) {
      return response.getMonthlyLeaderboard();
    }

    return null;
  }

}
