package com.group6.group6.controller;

import com.group6.group6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/search")
public class SearchController {

  /**
   * Method to read the request parameter q, task the SearchService with fetching results
   * and rendering the html page with the results.
   *
   * @param q
   * @param model
   * @return html location
   */
  @RequestMapping
  public String showSearchPage(
          @RequestParam(required = false) String q,
          Model model) {
    model.addAttribute("searchQuery", q);

    if (q != null) {
      // do smethink
    }

    return "search/index";
  }
}
