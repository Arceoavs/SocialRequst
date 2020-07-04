package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.model.maps.Coordinates;
import de.wwu.acse.socialrequest.model.maps.Instruction;
import de.wwu.acse.socialrequest.model.maps.Route;
import de.wwu.acse.socialrequest.model.maps.RouteCoordinates;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.MapsApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MapsApiServiceImpl implements MapsApiService {

  private final String API_URL = "http://localhost:8081/";

  private final RestTemplate restTemplate = new RestTemplate();

  @Autowired
  UserRepository userRepository;

  @Override
  public List<Instruction> getDirections(Coordinates origin, Coordinates destination) {
    String resourceUrl = API_URL + "route";
    HttpEntity<RouteCoordinates> request = new HttpEntity<RouteCoordinates>(new RouteCoordinates(origin, destination));
    Route route = restTemplate.postForObject(resourceUrl, request, Route.class);

    return route.getInstructions();
  }

}
