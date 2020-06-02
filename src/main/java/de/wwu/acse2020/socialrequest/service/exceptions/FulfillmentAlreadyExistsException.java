package de.wwu.acse2020.socialrequest.service.exceptions;

public class FulfillmentAlreadyExistsException extends Exception {
  private static final long serialVersionUID = 969750359326096943L;

  public FulfillmentAlreadyExistsException() {
  }

  public FulfillmentAlreadyExistsException(String message) {
    super(message);
  }

  public FulfillmentAlreadyExistsException(String message, Throwable cause) {
    super(message, cause);
  }

  public FulfillmentAlreadyExistsException(Throwable cause) {
    super(cause);
  }
}
