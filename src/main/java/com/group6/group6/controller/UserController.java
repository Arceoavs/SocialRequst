package com.group6.group6.controller;

import com.group6.group6.exception.DuplicateUserException;
import com.group6.group6.model.User;
import com.group6.group6.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  /*
   * Deliver registration page
   */
  @GetMapping("/register")
  public String showRegistrationForm(WebRequest request, Model model) {
    model.addAttribute("user", new User());
    return "user/register";
  }
  
  /*
   * Process registration form
   */
  @PostMapping("/register")
  public ModelAndView registerUserAccount(
    @ModelAttribute("user") @Valid User user,
    HttpServletRequest request,
    RedirectAttributes redirectAttributes
  ) {
    try {
      userService.registerNewUserAccount(user);
    } catch (DuplicateUserException e) {
      ModelAndView mav = new ModelAndView("user/register", "user", user);
      redirectAttributes.addFlashAttribute("message", e.getMessage());
      redirectAttributes.addFlashAttribute("messageType", "error");

      return mav;
    }

    redirectAttributes.addFlashAttribute("message", "You have successfully registered!");
    redirectAttributes.addFlashAttribute("messageType", "success");

    return new ModelAndView("redirect:/users/login");
  }

}
