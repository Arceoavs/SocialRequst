package de.wwu.acse.socialrequest.controller;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.service.QueryService;
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

  /**
   * Method to display a list of requests near-by the user
   * @param model
   * @return html page with list of requests
   */
  @GetMapping("/near-by")
  public String showNearBy(Model model) {
    List<Request> results = queryService.getNearByUser();
    model.addAttribute("results", results);

    return "query/index";
  }

  /**
   * Method to display a list of requests with topics, which are specialties for the user
   * @param model
   * @return html page with list of requests
   */
  @GetMapping("/matching-specialties")
  public String showMatchingSpecialties(Model model) {
    List<Request> results = queryService.getRequestMatchingTopics();
    model.addAttribute("results", results);

    return "query/index";
  }
}
