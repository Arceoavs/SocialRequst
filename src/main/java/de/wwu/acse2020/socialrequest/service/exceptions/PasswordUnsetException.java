package de.wwu.acse2020.socialrequest.service.exceptions;

public class PasswordUnsetException extends Exception {
  private static final long serialVersionUID = -45500036635435055L;

  public PasswordUnsetException() {
  }

  public PasswordUnsetException(String message) {
    super(message);
  }

  public PasswordUnsetException(String message, Throwable cause) {
    super(message, cause);
  }

  public PasswordUnsetException(Throwable cause) {
    super(cause);
  }
}
