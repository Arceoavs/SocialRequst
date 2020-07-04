package de.wwu.acse.leaderboard.repository;

import de.wwu.acse.leaderboard.model.Fulfillment;
import de.wwu.acse.leaderboard.model.dto.UserDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {

  /**
   * Searches for the users who fullfiled requests
   * ordered by the sum of the kilometeres travelled
   *
   * @return List of users wrapped in a {@link Map}
   */
  @Query("SELECT new de.wwu.acse.leaderboard.model.dto.UserDto(f.username AS user, SUM(f.distance) AS kilometers) "
      + "FROM Fulfillment f "
      + "GROUP BY f.username "
      + "ORDER BY SUM(f.distance) DESC"
  )
  public List<UserDto> getAllTimeLeaderboard();

  /**
   * Searches for the users who fullfiled requests in the current month ordered by
   * the sum of the kilometeres traveled
   *
   * @return List of users wrapped in a {@link Map}
   */
  @Query("SELECT new de.wwu.acse.leaderboard.model.dto.UserDto(f.username AS user, SUM(f.distance) AS kilometers) "
      + "FROM Fulfillment f "
      + "WHERE MONTH(f.fulfilledAt) = MONTH(CURRENT_TIMESTAMP) "
      + "GROUP BY f.username "
      + "ORDER BY SUM(f.distance) DESC"
  )
  public List<UserDto> getMonthlyLeaderboard();

}
