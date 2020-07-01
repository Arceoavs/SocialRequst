package de.wwu.acse.maps.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.model.Address;
import de.wwu.acse.maps.model.Distance;
import de.wwu.acse.maps.model.Route;
import de.wwu.acse.maps.model.RouteCoordinates;
import de.wwu.acse.maps.service.TomTomApiService;

@RestController
@RequestMapping("")
public class RouteController {

  @Autowired
  TomTomApiService tomTomService;

  @CrossOrigin(origins = "http://localhost:8080")
  @PostMapping(value = "/geocode", consumes = "application/json", produces = "application/json")
  public ResponseEntity<?> getCoordinates(@Valid @RequestBody Address address, BindingResult bindingResult) {
    if (bindingResult.hasErrors()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    Coordinates coordinates = tomTomService.getCoordinates(address.getAddress());
    return ResponseEntity.ok(coordinates);
  }

  @PostMapping(value = "/route", consumes = "application/json", produces = "application/json")
  public ResponseEntity<?> getRoute(@Valid @RequestBody RouteCoordinates routeCoordinates, BindingResult bindingResult){
    if (bindingResult.hasErrors()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    Route route = tomTomService.getRoute(routeCoordinates.getOrigin(), routeCoordinates.getDestination());
    return ResponseEntity.ok(route);
  }

  @PostMapping(value = "/distance", consumes = "application/json", produces = "application/json")
  public ResponseEntity<?> getDistance(@Valid @RequestBody RouteCoordinates routeCoordinates, BindingResult bindingResult){
    if (bindingResult.hasErrors()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    Distance distance = tomTomService.getDistance(routeCoordinates.getOrigin(), routeCoordinates.getDestination());
    return ResponseEntity.ok(distance);
  }

}
