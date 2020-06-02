package de.wwu.acse2020.socialrequest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.wwu.acse2020.socialrequest.service.RequestService;

@Controller
@RequestMapping("/search")
public class SearchController {
  @Autowired
  private RequestService requestService;

  @GetMapping
  public String search(@RequestParam("q") String query, Model model) {
    model.addAttribute("query", query);
    model.addAttribute("requests", requestService.search(query));
    return "search/search";
  }
}
