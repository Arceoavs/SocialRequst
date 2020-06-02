package de.wwu.acse2020.socialrequest.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import de.wwu.acse2020.socialrequest.data.model.User;

public abstract class AbstractService {
  protected User getCurrentUser() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    return (User) auth.getPrincipal();
  }
}
