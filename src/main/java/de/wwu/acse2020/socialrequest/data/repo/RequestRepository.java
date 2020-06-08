package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;

public interface RequestRepository extends JpaRepository<Request, Long> {
        List<Request> findAllByFulfillmentIsNullOrderByCreatedAtDesc();

        List<Request> findAllByUserOrderByCreatedAtDesc(User user);

        @Query("SELECT r " + "FROM Request r " + "LEFT OUTER JOIN Fulfillment f ON r = f.request "
                        + "WHERE (LOWER(r.title) LIKE LOWER(CONCAT('%', :query, '%')) "
                        + "   OR  LOWER(r.description) LIKE LOWER(CONCAT('%', :query, '%'))) " + "  AND f.id IS NULL "
                        + "ORDER BY r.createdAt DESC")
        List<Request> fullTextSearchUnfulfilled(@Param("query") String query);

        @Query("SELECT r from Request r LEFT JOIN r.fulfillment f WHERE f.id IS NULL"
                        + " AND 6371 * SQRT(POWER((radians(r.longitude) - radians(:lng)) * COS((radians(:lat) + radians(r.latitude))/2), 2) + POWER(radians(r.latitude) - radians(:lat), 2)) <= 10"
                        + "ORDER BY r.createdAt DESC")
        List<Request> nearByUser(@Param("lat") float lat, @Param("lng") float lng);

        @Query("SELECT DISTINCT r " + "FROM Request r " + "JOIN r.topics t "
                        + "LEFT OUTER JOIN Fulfillment f ON r = f.request " + "WHERE f.id IS NULL "
                        + "  AND t.name IN (SELECT t.name FROM Topic t JOIN t.users u WHERE u = :user) "
                        + "ORDER BY r.createdAt DESC")
        List<Request> matchingSpecialtiesOfUser(@Param("user") User user);
}
