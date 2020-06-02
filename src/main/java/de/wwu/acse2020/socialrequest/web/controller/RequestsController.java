package de.wwu.acse2020.socialrequest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.service.RequestService;
import de.wwu.acse2020.socialrequest.web.controller.dto.RequestDto;

@Controller
@RequestMapping("/requests")
public class RequestsController {
  @Autowired
  private RequestService requestService;

  @GetMapping("/new")
  public String newForm(Model model) {
    model.addAttribute("request", new Request());
    return "requests/new";
  }

  @PostMapping
  public String create(@ModelAttribute("request") @Valid RequestDto requestDto, BindingResult result) {
    if (result.hasErrors())
      return "requests/new";

    Request request;
    try {
      request = requestService.create(requestDto.toRequest());
    } catch (Exception e) {
      result.addError(new ObjectError("request", "Creation failed"));
      return "requests/new";
    }

    return "redirect:/requests/" + request.getId();
  }

  @GetMapping("/{id}")
  public String details(@PathVariable long id, Model model) {
    try {
      Request request = requestService.get(id);
      model.addAttribute("request", request);
    } catch (NoSuchElementException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Request not found", e);
    }

    return "requests/details";
  }
}
