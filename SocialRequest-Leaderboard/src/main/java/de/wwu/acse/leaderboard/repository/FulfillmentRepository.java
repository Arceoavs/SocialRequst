package de.wwu.acse.leaderboard.repository;

import de.wwu.acse.leaderboard.model.Fulfillment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FulfillmentRepository extends JpaRepository<Fulfillment, Long> {

  /**
   * Searches for the useres that fullfiled requests
   * ordered by the sum of the kilometeres traveled
   * @return list of usernames
   */
  @Query("SELECT f.username FROM Fulfillment f " +
    "GROUP BY f.username " +
    "ORDER BY SUM(f.distance) DESC")
  public List<String> allTimeLeaderboardUsers();

  /**
   * Searches for the amount of kilometeres traveled by useres
   * that fullfiled requests ordered by the sum of the kilometeres traveled
   * @return list of kilometeres traveled
   */
  @Query("SELECT SUM(f.distance) from Fulfillment f " +
    "GROUP BY f.username " +
    "ORDER BY SUM(f.distance) DESC")
  public List<Float> allTimeLeaderboardKilometers();

  /**
   * Searches for the useres that fullfiled requests in this month
   * ordered by the sum of the kilometeres traveled
   * @return list of usernames
   */
  @Query("SELECT f.username FROM Fulfillment f " +
    "WHERE MONTH(f.fulfilledAt) = MONTH(CURRENT_TIMESTAMP) " +
    "GROUP BY f.username " +
    "ORDER BY SUM(f.distance) DESC")
  public List<String> monthlyLeaderboardUsers();

  /**
   * Searches for the amount of kilometeres traveled by useres
   * that fullfiled requests in this month
   * ordered by the sum of the kilometeres traveled
   * @return list of kilometeres traveled
   */
  @Query("SELECT SUM(f.distance) from Fulfillment f " +
    "WHERE MONTH( f.fulfilledAt ) = MONTH( CURRENT_TIMESTAMP ) " +
    "GROUP BY f.username " +
    "ORDER BY SUM(f.distance) DESC")
  public List<Float> monthlyLeaderboardKilometers();


}
