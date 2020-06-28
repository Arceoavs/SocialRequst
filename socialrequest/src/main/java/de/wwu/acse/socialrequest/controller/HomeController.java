package de.wwu.acse.socialrequest.controller;

import java.util.List;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.repository.RequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController extends ApplicationController {

  @Autowired
  private RequestRepository requestRepository;

  @GetMapping("/")
  public String index(Model model) {
    List<Request> results = requestRepository.search("");
    model.addAttribute("results", results);

    return "home/index";
  }
}
