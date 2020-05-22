package com.group6.group6.controller;

import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/query")
public class QueryController {

  @Autowired
  private QueryService queryService;

  @GetMapping("/near-by")
  public String index(Model model) {
    List<Request> results = queryService.getNearByUser();
    model.addAttribute("results", results);

    return "query/index";
  }
}
