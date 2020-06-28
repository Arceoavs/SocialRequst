package de.wwu.acse.maps.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.wwu.acse.maps.model.Coordinates;
import de.wwu.acse.maps.model.Route;
import de.wwu.acse.maps.model.RouteCoordinates;
import de.wwu.acse.maps.service.TTApiService;

@RestController
@RequestMapping("")
public class RouteController {
  
  @Autowired
  TTApiService ttService;

  @GetMapping(value = "/geocode/{address}", produces = "application/json")
  public Coordinates getCoordinates(@PathVariable(value="address") String address) {
    return ttService.getCoordinates(address);
  }

  @GetMapping(value = "/route", consumes = "application/json", produces = "application/json")
  public Route getRoute(@Valid @RequestBody RouteCoordinates routeCoordinates, BindingResult bindingResult){
    return ttService.getRoute(routeCoordinates.getOrigin(), routeCoordinates.getDestination());
  }
}
