package com.group6.group6.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoRequestException extends RuntimeException {

  private static final long serialVersionUID = 5861310537366287163L;

  public NoRequestException() {
    super();
  }

  public NoRequestException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public NoRequestException(final String message) {
    super(message);
  }

  public NoRequestException(final Throwable cause) {
    super(cause);
  }

}
