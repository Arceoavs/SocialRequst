package com.group6.group6.controller;

import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

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
   * @param q the search query string, retrieved from the request
   * @param model
   * @return html location
   */
  @RequestMapping
  public String showSearchPage(
          @RequestParam(required = false) String q,
          Model model) {
    model.addAttribute("searchQuery", q);

    List<Request> requestList = searchService.getRequests(q);
    model.addAttribute("searchResult", requestList);

    return "search/index";
  }
}
