package com.group6.group6.exception;

public class DuplicateUserException  extends RuntimeException {

  private static final long serialVersionUID = 5861310537366287163L;

  public DuplicateUserException() {
    super();
  }

  public DuplicateUserException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public DuplicateUserException(final String message) {
    super(message);
  }

  public DuplicateUserException(final Throwable cause) {
    super(cause);
  }

}
