package de.wwu.acse.socialrequest.controller;

import java.util.Optional;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.WebRequest;


public class ApplicationController {
  /**
   * Returns the viewName to return for coming back to the sender url
   *
   * @param request Instance of {@link WebRequest} or use an injected instance
   * @return Optional with the view name. Recomended to use an alternativa url with {@link Optional#orElse(java.lang.Object)}
   */
  protected Optional<String> redirectToBack(WebRequest request) {
    return Optional
      .ofNullable(request.getHeader("Referer"))
      .map(requestUrl -> String.format("redirect:%s", requestUrl));
  }

  /**
   * Checks if user is logged in. Also pays attention to anonymous authentication.
   * @return whether a user is logged in
   */
  protected boolean userIsLoggedIn() {
    return (
      SecurityContextHolder.getContext().getAuthentication() != null &&
      SecurityContextHolder.getContext().getAuthentication().isAuthenticated() &&
      // when Anonymous Authentication is enabled
      !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken)
    );
  }
}
