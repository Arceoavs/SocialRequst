package com.group6.group6.controller;

import com.group6.group6.service.TTApiService;

import org.springframework.beans.factory.annotation.Autowired;

//@RestController
//@RequestMapping("/route")
public class RouteController {
  
  @Autowired
  TTApiService ttService;

  @GetMapping(value = "/coordinates", consumes = "application/json", produces = "application/json")
  public String 
}