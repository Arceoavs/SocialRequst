package de.wwu.acse2020.socialrequest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

import de.wwu.acse2020.socialrequest.service.QueryResult;
import de.wwu.acse2020.socialrequest.service.QueryService;

@Controller
@RequestMapping("/query")
public class QueryController {
  @Autowired
  private QueryService queryService;

  @GetMapping("/{id}")
  public String list(@PathVariable("id") String queryId, Model model) {
    try {
      QueryResult result = queryService.get(queryId).execute();
      model.addAttribute("queryResult", result);
    } catch (NoSuchElementException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Query not found", e);
    }

    return "query/query";
  }
}
