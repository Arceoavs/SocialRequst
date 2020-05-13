package com.group6.group6.controller;

import com.group6.group6.exception.DuplicateUserException;
import com.group6.group6.model.User;
import com.group6.group6.repository.UserRepository;
import com.group6.group6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller


public class RegistrationController {

    @Autowired
    private UserService userService;

    /*
     * Deliver registration page
     */
    @GetMapping("/users/register")
    public String showRegistrationForm(WebRequest request, Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    /*
     * Process registration form
     */
    @PostMapping("/users/register")
    public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid User user,
            HttpServletRequest request) {

        System.out.println("Received registration post for user: " + user.getUsername());

        try {
            User registered = userService.registerNewUserAccount(user);
        } catch (DuplicateUserException duEx) {
            ModelAndView mav = new ModelAndView("register");
            mav.addObject("message", "An account for that username/email already exists.");
            return mav;
        }

        return new ModelAndView("registerSuccess", "user", user);
    }
}