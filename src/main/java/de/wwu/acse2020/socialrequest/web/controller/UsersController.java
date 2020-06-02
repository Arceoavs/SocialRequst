package de.wwu.acse2020.socialrequest.web.controller;

import static org.springframework.security.web.context.HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.service.FulfillmentService;
import de.wwu.acse2020.socialrequest.service.RequestService;
import de.wwu.acse2020.socialrequest.service.UserService;
import de.wwu.acse2020.socialrequest.service.exceptions.PasswordUnsetException;
import de.wwu.acse2020.socialrequest.service.exceptions.UsernameAlreadyExistsException;
import de.wwu.acse2020.socialrequest.web.controller.dto.UserDto;

@Controller
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UserService userService;

  @Autowired
  private RequestService requestService;

  @Autowired
  private FulfillmentService fulfillmentService;

  @GetMapping("/login")
  public String login() {
    return "users/login";
  }

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("user", new UserDto());
    return "users/new";
  }

  @PostMapping
  public String create(@ModelAttribute("user") @Valid UserDto userDto, BindingResult result, HttpSession session) {
    // check for JPA validation errors
    if (result.hasErrors())
      return "users/new";

    User user;
    try {
      // try to create user
      user = userService.create(userDto.toUser());
    } catch (UsernameAlreadyExistsException e) {
      // username already exists => add field error message
      result.rejectValue("username", "error.user", "Username already exists");
      return "users/new";
    } catch (PasswordUnsetException e) {
      // password not set => add field error message
      result.rejectValue("password", "error.user", "Password is required");
      return "users/new";
    } catch (Exception e) {
      // error occurred => add object error message
      result.addError(new ObjectError("user", "Registration failed"));
      return "users/new";
    }

    // automatically login new user
    userService.login(user);
    session.setAttribute(SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());

    return "redirect:/";
  }

  @GetMapping("/me")
  public String profile(@AuthenticationPrincipal User currentUser, Model model) {
    try {
      model.addAttribute("user", userService.get(currentUser.getId()));
      model.addAttribute("requests", requestService.getLatestByUser(currentUser));
      model.addAttribute("fulfillments", fulfillmentService.getLatestByUser(currentUser));
      return "users/details";
    } catch (NoSuchElementException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", e);
    }
  }

  @GetMapping("/me/edit")
  public String edit(@AuthenticationPrincipal User user, Model model) {
    try {
      user = userService.get(user.getId());
      model.addAttribute("user", new UserDto(user));
      return "users/edit";
    } catch (NoSuchElementException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", e);
    }
  }

  @PostMapping("/me/edit")
  public String update(@ModelAttribute("user") @Valid UserDto userDto, BindingResult result,
          @AuthenticationPrincipal User currentUser) {
    // check for JPA validation errors
    if (result.hasErrors())
      return "users/edit";

    try {
      // update user
      User user = userService.get(currentUser.getId());
      user = userDto.updateUser(user);
      user = userService.update(user);

      // update current user object
      userService.login(user);
    } catch (UsernameAlreadyExistsException e) {
      // username already exists => add field error message
      result.rejectValue("username", "error.user", "Username already exists");
      return "users/edit";
    } catch (Exception e) {
      // error occurred => add object error message
      result.addError(new ObjectError("user", "Update failed"));
      return "users/edit";
    }

    return "redirect:/users/me";
  }
}
