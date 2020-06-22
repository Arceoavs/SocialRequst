package de.wwu.acse.group6.socialrequest.controller;

import de.wwu.acse.group6.socialrequest.model.Request;
import de.wwu.acse.group6.socialrequest.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController extends ApplicationController {

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
  public String showSearchPage(@RequestParam(required = false, name = "q") String query, @RequestParam(required = false, name = "raw") String raw, Model model) {
    List<Request> results = searchService.getRequests(query);
    model.addAttribute("results", results);

    if (raw != null) {
      return "search/results :: results";
    } else {
      return "home/index";
    }

  }
}
