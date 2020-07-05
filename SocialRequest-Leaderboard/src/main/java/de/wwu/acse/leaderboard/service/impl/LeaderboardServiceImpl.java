package de.wwu.acse.leaderboard.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.wwu.acse.leaderboard.model.dto.UserDto;
import de.wwu.acse.leaderboard.repository.FulfillmentRepository;
import de.wwu.acse.leaderboard.service.LeaderboardService;
import de.wwu.acse.leaderboard.soap.Leaderboard;
import de.wwu.acse.leaderboard.soap.LeaderboardPlace;

@Service
public class LeaderboardServiceImpl implements LeaderboardService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  @Override
  public void prepareLeaderboard(Leaderboard leaderboard, LeaderboardType type) {
    List<LeaderboardPlace> leaderboardPlaces = leaderboard.getLeaderboardPlaces();
    List<UserDto> users;

    switch (type) {
      case ALL_TIME:
        users = fulfillmentRepository.getAllTimeLeaderboard();
        break;

      case MONTH:
        users = fulfillmentRepository.getMonthlyLeaderboard();
        break;

      default:
        users = new ArrayList<>();
        break;
    }

    leaderboardPlaces.addAll(IntStream.range(0, users.size()).mapToObj((index) -> {
      UserDto user = users.get(index);
      LeaderboardPlace leaderboardPlace = new LeaderboardPlace();
      leaderboardPlace.setRank(index + 1);
      leaderboardPlace.setUser(user.getUsername());
      leaderboardPlace.setKilometers(user.getKilometers());
      return leaderboardPlace;
    }).collect(Collectors.toList()));
  }

}
