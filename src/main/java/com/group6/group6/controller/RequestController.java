package com.group6.group6.controller;

import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import com.group6.group6.auth.CurrentUser;
import com.group6.group6.exception.NoRequestException;
import com.group6.group6.exception.RequestAlreadyFulfilledException;
import com.group6.group6.exception.RequestCannotBeFulfilledBySameUser;
import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.repository.UserRepository;
import com.group6.group6.service.FulfillmentService;
import com.group6.group6.service.RequestService;
import com.group6.group6.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/requests")
public class RequestController extends ApplicationController {
  @Autowired
  RequestService requestService;

  @Autowired
  TopicService topicService;

  @Autowired
  FulfillmentService fulfillmentService;

  @Autowired
  UserRepository userRepository;

  @GetMapping("/new")
  public String request(WebRequest request, Model model) {
    model.addAttribute("request", new Request());
    model.addAttribute("availableTopics", topicService.getAllTopics());

    return "request/new";
  }

  @PostMapping
  public String createRequest(@Valid Request request, BindingResult bindingResult, HttpServletRequest webRequest, Model model, RedirectAttributes redirectAttributes) {
    // if the only error is regarding topics, handle the topic validation in the service and skip re-render
    if (bindingResult.hasErrors() && !(bindingResult.hasFieldErrors("topics") && bindingResult.getErrorCount() == 1)) {
      model.addAttribute("availableTopics", topicService.getAllTopics());

      return "request/new";
    }

    String [] topics = webRequest.getParameterValues("topics");
    try {
      request = requestService.createRequest(request, topics);
      redirectAttributes.addFlashAttribute("message", String.format("You have successfully created the request '%s'.", request.getTitle()));
      redirectAttributes.addFlashAttribute("messageType", "success");

      return String.format("redirect:/requests/%s", request.getId());
    } catch(ConstraintViolationException e) {
      model.addAttribute("availableTopics", topicService.getAllTopics());

      return "request/new";
    }
  }

  @GetMapping("/{id}")
  public String showRequest(@PathVariable String id, Model model) {
    try {
      model.addAttribute("request", requestService.getRequest(id));
      return "request/show";
    } catch (NumberFormatException e) {
      throw new NoRequestException(String.format("ID %s is no number", id));
    } catch (NoSuchElementException e) {
      throw new NoRequestException("Request does not exist.");
    }
  }

  @PostMapping("/{id}/fulfill")
  public String fulfillRequest(@PathVariable String id, Model model, RedirectAttributes redirectAttributes) {
    try {
      Request request = requestService.getRequest(id);
      User user = ((CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
      fulfillmentService.fulfillRequest(request, user);
      redirectAttributes.addFlashAttribute("message", String.format("You have successfully fulfilled the request '%s'.", request.getTitle()));
      redirectAttributes.addFlashAttribute("messageType", "success");

      return String.format("redirect:/requests/%s", id);
    } catch (NumberFormatException e) {
      throw new NoRequestException(String.format("ID %s is no number", id));
    } catch (NoSuchElementException e) {
      throw new NoRequestException("Request does not exist.");
    } catch (RequestAlreadyFulfilledException e) {
      redirectAttributes.addFlashAttribute("message", "The request has already been fulfilled.");
      redirectAttributes.addFlashAttribute("messageType", "error");

      return String.format("redirect:/requests/%s", id);
    } catch (RequestCannotBeFulfilledBySameUser e) {
      redirectAttributes.addFlashAttribute("message", "You cannot fulfill your own request.");
      redirectAttributes.addFlashAttribute("messageType", "error");

      return String.format("redirect:/requests/%s", id);
    }
  }

}
