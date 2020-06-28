package de.wwu.acse.socialrequest.repository;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface RequestRepository extends JpaRepository<Request, Long> {

  public Request findByTitle(String title);

  /**
   * Searches for unfilled requests that contain the query string in their title or description
   * @param query search query
   * @return list of requests
   */
  @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL AND (LOWER(r.title) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(r.description) LIKE LOWER(CONCAT('%', :query, '%'))) ORDER BY r.createdAt DESC")
  public List<Request> search(@Param("query") String query);

  /**
   * Searches for unfilled requests that are near by (10km) given coordinates
   * @param lat latitude
   * @param lng longitude
   * @return list of requests
   */
  @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL" +
    " AND 6371 * SQRT(POWER((radians(r.lng) - radians(:lng)) * COS((radians(:lat) + radians(r.lat))/2), 2) + POWER(radians(r.lat) - radians(:lat), 2)) <= 10" +
    "ORDER BY r.createdAt DESC")
  public List<Request> getNearBy(@Param("lat") float lat, @Param("lng") float lng);

  /**
   * Searches for unfilled requests which are associated with any of the given topics
   * @param topics list of topics
   * @return list of requests
   */
  public List<Request> findByTopicsInAndFulfillmentIsNullOrderByCreatedAtDesc(Set<Topic> topics);

}
