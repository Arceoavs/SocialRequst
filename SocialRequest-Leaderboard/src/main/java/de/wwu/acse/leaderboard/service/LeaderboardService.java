package de.wwu.acse.leaderboard.service;

import de.wwu.acse.leaderboard.soap.Leaderboard;
import de.wwu.acse.leaderboard.soap.LeaderboardPlace;

public interface LeaderboardService {
  enum LeaderboardType {
    ALL_TIME, MONTH
  }

  /**
   * Fills a given {@link Leaderboard leaderboard} with up to 10
   * {@link LeaderboardPlace leaderboardPlaces}.
   *
   * @param leaderboard The leaderboard that is filled with
   *                    {@link LeaderboardPlace}
   * @param type        The {@link LeaderboardType type} of the leaderboard
   *                    (either ALL_TIME or MONTH).
   */
  public void prepareLeaderboard(Leaderboard leaderboard, LeaderboardType type);

}
