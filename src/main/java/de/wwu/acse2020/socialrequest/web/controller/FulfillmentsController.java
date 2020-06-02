package de.wwu.acse2020.socialrequest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.service.FulfillmentService;
import de.wwu.acse2020.socialrequest.service.RequestService;
import de.wwu.acse2020.socialrequest.service.exceptions.FulfillmentAlreadyExistsException;

@Controller
@RequestMapping("/fulfillments")
public class FulfillmentsController {
  @Autowired
  private FulfillmentService fulfillmentService;

  @Autowired
  private RequestService requestService;

  @PostMapping
  public String create(long requestId, @AuthenticationPrincipal User currentUser) {
    try {
      Request request = requestService.get(requestId);
      fulfillmentService.create(request, currentUser);
    } catch (NoSuchElementException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Request not found", e);
    } catch (FulfillmentAlreadyExistsException e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request already fulfilled", e);
    }

    return "redirect:/requests/" + requestId;
  }
}
