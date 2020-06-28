package de.wwu.acse.socialrequest.controller;

import de.wwu.acse.socialrequest.auth.CurrentUser;
import de.wwu.acse.socialrequest.exception.DuplicateUserException;
import de.wwu.acse.socialrequest.form.RegisterUserForm;
import de.wwu.acse.socialrequest.form.UpdatePasswordForm;
import de.wwu.acse.socialrequest.form.UserProfileForm;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.TopicService;
import de.wwu.acse.socialrequest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
  private PasswordEncoder passwordEncoder;

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

    redirectAttributes.addFlashAttribute("message", "You have successfully updated your account!");
    redirectAttributes.addFlashAttribute("messageType", "success");

    return "redirect:/users/me";
  }

  @GetMapping("/update-password")
  public String showUpdatePasswordForm(Model model) {
    model.addAttribute("passwordForm", new UpdatePasswordForm());

    return "user/update_password";
  }

  @PostMapping("/update-password")
  public String updatePassword(
    @ModelAttribute("passwordForm") @Valid UpdatePasswordForm passwordForm,
    BindingResult bindingResult,
    Model model,
    RedirectAttributes redirectAttributes
  ) {
    String oldPassword = ((CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getPassword();
    if (!passwordEncoder.matches(passwordForm.getOldPassword(), oldPassword)) {
      bindingResult.rejectValue("oldPassword", "", "Old password is not correct");
    }

    if (bindingResult.hasErrors()) {
      return "user/update_password";
    }

    String username = SecurityContextHolder.getContext().getAuthentication().getName();
    userService.updatePassword(username, passwordForm.getNewPassword());

    redirectAttributes.addFlashAttribute("message", "You have successfully updated your password!");
    redirectAttributes.addFlashAttribute("messageType", "success");

    return "redirect:/users/me";
  }

}
