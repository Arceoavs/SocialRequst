package de.wwu.acse.socialrequest.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import de.wwu.acse.socialrequest.model.maps.Coordinates;
import de.wwu.acse.socialrequest.model.maps.Distance;
import de.wwu.acse.socialrequest.model.maps.Instruction;
import de.wwu.acse.socialrequest.model.maps.Route;
import de.wwu.acse.socialrequest.model.maps.RouteCoordinates;
import de.wwu.acse.socialrequest.repository.UserRepository;

@Component
public class MapsApiClient {

  private final String API_URL = "http://localhost:8081/";

  private final RestTemplate restTemplate = new RestTemplate();

  @Autowired
  UserRepository userRepository;

  /**
   * Determines the distance between two coordinates (lat, lng).
   *
   * @param origin      A {@link Coordinates} object for the origin
   * @param destination A {@link Coordinates} object for the destination
   * @return A {@link Distance} object that includes the distance between origin
   *         and destination (see {@link Distance#getLengthInMeters()} and
   *         {@link Distance#getLengthInKilometers()})
   */
  public Distance getDistance(Coordinates origin, Coordinates destination) {
    String resourceUrl = API_URL + "distance";
    HttpEntity<RouteCoordinates> request = new HttpEntity<RouteCoordinates>(new RouteCoordinates(origin, destination));
    Distance distance = restTemplate.postForObject(resourceUrl, request, Distance.class);

    return distance;
  }

  /**
   * Fetches a list of instructions for the route of a given origin to a given
   * destination.
   *
   * @param origin      A {@link Coordinates} object for the origin
   * @param destination A {@link Coordinates} object for the destination
   * @return list of instructions of the route
   */
  public List<Instruction> getDirections(Coordinates origin, Coordinates destination) {
    String resourceUrl = API_URL + "route";
    HttpEntity<RouteCoordinates> request = new HttpEntity<RouteCoordinates>(new RouteCoordinates(origin, destination));
    Route route = restTemplate.postForObject(resourceUrl, request, Route.class);

    return route.getInstructions();
  }

}
