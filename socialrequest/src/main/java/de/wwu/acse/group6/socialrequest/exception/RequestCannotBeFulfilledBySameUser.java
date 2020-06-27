package de.wwu.acse.group6.socialrequest.exception;

public class RequestCannotBeFulfilledBySameUser extends RuntimeException {

  private static final long serialVersionUID = 5121310537366287161L;

  public RequestCannotBeFulfilledBySameUser() {
    super();
  }

  public RequestCannotBeFulfilledBySameUser(final String message, final Throwable cause) {
    super(message, cause);
  }

  public RequestCannotBeFulfilledBySameUser(final String message) {
    super(message);
  }

  public RequestCannotBeFulfilledBySameUser(final Throwable cause) {
    super(cause);
  }

}
