package com.group6.group6.controller;

import com.group6.group6.auth.CurrentUser;
import com.group6.group6.exception.DuplicateUserException;
import com.group6.group6.form.RegisterUserForm;
import com.group6.group6.form.UserProfileForm;
import com.group6.group6.model.User;
import com.group6.group6.repository.UserRepository;
import com.group6.group6.service.TopicService;
import com.group6.group6.service.UserAuthenticationService;
import com.group6.group6.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController extends ApplicationController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserService userService;

  @Autowired
  private TopicService topicService;

  @Autowired
  private UserAuthenticationService authenticationService;

  /*
   * Deliver registration page
   */
  @GetMapping("/register")
  public String showRegistrationForm(WebRequest request, Model model, RedirectAttributes redirectAttributes) {
    if (userIsLoggedIn()) {
      redirectAttributes.addFlashAttribute("message", "You are already logged in.");
      redirectAttributes.addFlashAttribute("messageType", "error");
      return redirectToBack(request).orElse("redirect:/");
    }

    model.addAttribute("userForm", new RegisterUserForm());
    return "user/register";
  }
  
  /*
   * Process registration form
   */
  @PostMapping("/register")
  public String registerUserAccount(
    @ModelAttribute("userForm") @Valid RegisterUserForm userForm,
    BindingResult bindingResult,
    RedirectAttributes redirectAttributes
  ) {
    if (bindingResult.hasErrors()) {
      return "user/register";
    }

    try {
      userService.registerNewUserAccount(userForm);
    } catch (DuplicateUserException e) {
      if (e.getMessage().contains("username already exists")) {
        bindingResult.rejectValue("username", "", e.getMessage());
      } else if (e.getMessage().contains("email already exists")) {
        bindingResult.rejectValue("email", "", e.getMessage());
      }

      return "user/register";
    }

    redirectAttributes.addFlashAttribute("message", "You have successfully registered!");
    redirectAttributes.addFlashAttribute("messageType", "success");

    return "redirect:/users/login";
  }

  @GetMapping("/me")
  public String showUserProfile(Model model) {
    User currentUser = userRepository.getOne(
      ((CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getId()
    );
    model.addAttribute("user", currentUser);
    model.addAttribute("userForm", new UserProfileForm(
      currentUser.getId(),
      currentUser.getUsername(),
      currentUser.getEmail(),
      currentUser.getSpecialties(),
      currentUser.getLat(),
      currentUser.getLng()
    ));
    model.addAttribute("availableTopics", topicService.getAllTopics());

    return "user/me";
  }

  @PostMapping("/me")
  public String updateUser(
    @ModelAttribute("userForm") @Valid UserProfileForm userForm,
    BindingResult bindingResult,
    Model model,
    RedirectAttributes redirectAttributes
  ) {
    User currentUser = userRepository.getOne(
      ((CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getId()
    );

    if (bindingResult.hasErrors()) {
      model.addAttribute("availableTopics", topicService.getAllTopics());
      model.addAttribute("user", currentUser);

      return "user/me";
    }

    try {
      userService.updateUser(userForm);
    } catch (DuplicateUserException e) {
      if (e.getMessage().contains("username already exists")) {
        bindingResult.rejectValue("username", "", e.getMessage());
      } else if (e.getMessage().contains("email already exists")) {
        bindingResult.rejectValue("email", "", e.getMessage());
      }
      model.addAttribute("availableTopics", topicService.getAllTopics());
      model.addAttribute("user", currentUser);

      return "user/me";
    }

    // isAuthenticated() is false. It has to be true
    // this is necessary, so the username is reloaded in case it was changed by the form
    Authentication authentication = new UsernamePasswordAuthenticationToken(
      authenticationService.loadUserByUsername(userForm.getUsername()),
      currentUser.getPassword()
    );
    SecurityContextHolder.getContext().setAuthentication(authentication);

    redirectAttributes.addFlashAttribute("message", "You have successfully updated your account!");
    redirectAttributes.addFlashAttribute("messageType", "success");

    return "redirect:/users/me";
  }

  // @PostMapping("/update-password")
  // @ResponseBody
  // public Map<String, Object> updatePassword(
  //   @Valid UpdatePasswordForm passwordForm,
  //   BindingResult bindingResult
  // ) {
  //   User currentUser = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
  //   model.addAttribute("passwordForm", new UpdatePasswordForm(currentUser.getPassword()));
  //   Map<String, Object> responseJson = new LinkedHashMap<>();

  //   return "";
  // }

}
