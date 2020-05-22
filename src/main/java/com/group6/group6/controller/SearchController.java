package com.group6.group6.controller;

import com.group6.group6.model.Request;
import com.group6.group6.repository.UserRepository;
import com.group6.group6.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {

  @Autowired
  private SearchService searchService;

  /**
   * Method to read the request parameter q, task the SearchService with fetching results
   * and rendering the html page with the results.
   *
   * @param query the search query string, retrieved from the request
   * @param model
   * @return html location
   */
  @GetMapping
  public String showSearchPage(@RequestParam(required = false, name = "q") String query, Model model) {
    List<Request> results = searchService.getRequests(query);
    model.addAttribute("results", results);

    return "search/results :: results";
  }

  @GetMapping("/matching-specialties")
  public String showMatchingSpecialties(Model model) {
    model.addAttribute("request", searchService.getRequestMatchingTopics());
    return "search/specialties";
  }
}
