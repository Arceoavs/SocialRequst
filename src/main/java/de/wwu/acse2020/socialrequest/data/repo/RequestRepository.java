package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;

public interface RequestRepository extends JpaRepository<Request, Long> {
  List<Request> findAllByFulfillmentIsNullOrderByCreatedAtDesc();

  List<Request> findAllByUserOrderByCreatedAtDesc(User user);

  @Query("SELECT r "
          + "FROM Request r "
          + "LEFT OUTER JOIN Fulfillment f ON r = f.request "
          + "WHERE (LOWER(r.title) LIKE LOWER(CONCAT('%', ?1, '%')) "
          + "   OR  LOWER(r.description) LIKE LOWER(CONCAT('%', ?1, '%'))) "
          + "  AND f.id IS NULL "
          + "ORDER BY r.createdAt DESC")
  List<Request> fullTextSearchUnfulfilled(String query);

  @Query(value = "SELECT DISTINCT r.* "
          + "FROM Request r "
          + "LEFT OUTER JOIN Fulfillment f ON (r.id = f.request_id) "
          + "CROSS JOIN User u "
          + "WHERE f.id IS NULL "
          + "  AND u.id = ?1 "
          + "  AND 6371 * SQRT(POWER((u.longitude*PI()/180 - r.longitude*PI()/180) * COS((r.latitude*PI()/180 + u.latitude*PI()/180)/2), 2) + POWER(u.latitude*PI()/180 - r.latitude*PI()/180, 2)) < 10 "
          + "ORDER BY r.created_at DESC",
          nativeQuery = true)
  List<Request> nearByUser(long userId);

  @Query("SELECT DISTINCT r "
          + "FROM Request r "
          + "JOIN r.topics t "
          + "LEFT OUTER JOIN Fulfillment f ON r = f.request "
          + "WHERE f.id IS NULL "
          + "  AND t.name IN (SELECT t.name FROM Topic t JOIN t.users u WHERE u = ?1) "
          + "ORDER BY r.createdAt DESC")
  List<Request> matchingSpecialtiesOfUser(User user);
}
