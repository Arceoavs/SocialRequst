package com.group6.group6.exception;

public class RequestAlreadyFulfilledException extends RuntimeException {

  private static final long serialVersionUID = 5861310537366287163L;

  public RequestAlreadyFulfilledException() {
    super();
  }

  public RequestAlreadyFulfilledException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public RequestAlreadyFulfilledException(final String message) {
    super(message);
  }

  public RequestAlreadyFulfilledException(final Throwable cause) {
    super(cause);
  }

}
