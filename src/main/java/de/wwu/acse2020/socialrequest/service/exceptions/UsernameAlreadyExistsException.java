package de.wwu.acse2020.socialrequest.service.exceptions;

public class UsernameAlreadyExistsException extends Exception {
  private static final long serialVersionUID = -9052475238926551801L;

  public UsernameAlreadyExistsException() {
  }

  public UsernameAlreadyExistsException(String message) {
    super(message);
  }

  public UsernameAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public UsernameAlreadyExistsException(Throwable cause) {
    super(cause);
  }
}
