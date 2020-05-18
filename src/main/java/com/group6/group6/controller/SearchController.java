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

  @RequestMapping
  public String showSearchPage(
          @RequestParam(required = false) String q,
          Model model) {
    model.addAttribute("searchQuery", q);
    System.out.println(q);
    return "search/index";
  }
}
