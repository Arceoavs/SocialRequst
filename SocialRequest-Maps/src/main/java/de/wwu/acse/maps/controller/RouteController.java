package de.wwu.acse.maps.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.exception.UnprocessableEntityException;
import de.wwu.acse.maps.model.Address;
import de.wwu.acse.maps.model.Distance;
import de.wwu.acse.maps.model.Route;
import de.wwu.acse.maps.model.RouteCoordinates;
import de.wwu.acse.maps.consumer.TomTomApiClient;

@RestController
@RequestMapping("")
public class RouteController {

  @Autowired
  TomTomApiClient tomTomApiClient;

  @CrossOrigin(origins = "http://localhost:8080")
  @PostMapping(value = "/geocode", consumes = "application/json", produces = "application/json")
  public Coordinates getCoordinates(@Valid @RequestBody Address address, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      throw new UnprocessableEntityException();
    }
    return tomTomApiClient.getCoordinates(address.getAddress());
  }

  @PostMapping(value = "/route", consumes = "application/json", produces = "application/json")
  public Route getRoute(@Valid @RequestBody RouteCoordinates routeCoordinates, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      throw new UnprocessableEntityException();
    }
    return tomTomApiClient.getRoute(routeCoordinates.getOrigin(), routeCoordinates.getDestination());
  }

  @PostMapping(value = "/distance", consumes = "application/json", produces = "application/json")
  public Distance getDistance(@Valid @RequestBody RouteCoordinates routeCoordinates, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      throw new UnprocessableEntityException();
    }
    return tomTomApiClient.getDistance(routeCoordinates.getOrigin(), routeCoordinates.getDestination());
  }

}
