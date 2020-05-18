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

  @RequestMapping("/search?q={str}")
  public String showSearchPage(
          @RequestParam("q") String query,
          Model model) {
    model.addAttribute("msg", query);
    return "search";
  }
}
