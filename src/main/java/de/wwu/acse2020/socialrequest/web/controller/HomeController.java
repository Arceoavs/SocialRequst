package de.wwu.acse2020.socialrequest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.wwu.acse2020.socialrequest.service.QueryService;
import de.wwu.acse2020.socialrequest.service.RequestService;

@Controller
@RequestMapping("/")
public class HomeController {
  @Autowired
  private RequestService requestService;

  @Autowired
  private QueryService queryService;

  @GetMapping
  public String index(Model model) {
    model.addAttribute("requests", requestService.getLatestUnfulfilled());
    model.addAttribute("queries", queryService.getAll());
    return "home/index";
  }
}
