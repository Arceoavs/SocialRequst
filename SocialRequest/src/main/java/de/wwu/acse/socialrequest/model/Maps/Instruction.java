package de.wwu.acse.socialrequest.model.Maps;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Instruction implements Serializable {

  @NotNull
  String message;

  public Instruction(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
