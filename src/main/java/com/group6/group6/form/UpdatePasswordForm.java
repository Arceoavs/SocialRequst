package com.group6.group6.form;

import javax.validation.constraints.NotBlank;

import com.group6.group6.lib.UniversalGetter;
import com.group6.group6.validator.annotation.PasswordMatches;

@PasswordMatches(
  message = "Old password does not match",
  passwordField = "oldPassword",
  passwordConfirmationField = "oldPasswordInput",
  encrypted = true
)
@PasswordMatches(
  message = "New passwords do not match",
  passwordField = "newPassword",
  passwordConfirmationField = "newPasswordConfirmation"
)
public class UpdatePasswordForm implements UniversalGetter {

  private String oldPassword;

  @NotBlank(message = "Old password required")
  private String oldPasswordInput;

  @NotBlank(message = "Password required")
  private String newPassword;

  private String newPasswordConfirmation;

  public UpdatePasswordForm() {}

  public UpdatePasswordForm(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  @Override
  public Object get(String field) {
    switch (field) {
      case "oldPassword":
        return this.oldPassword;

      case "oldPasswordInput":
        return this.oldPasswordInput;

      case "newPassword":
        return this.newPassword;

      case "newPasswordConfirmation":
        return this.newPasswordConfirmation;
    
      default:
        return null;
    }
  }

  /**
   * @return the newPassword
   */
  public String getNewPassword() {
    return newPassword;
  }

  /**
   * @param newPassword the newPassword to set
   */
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  /**
   * @return the oldPassword
   */
  public String getOldPassword() {
    return oldPassword;
  }

  /**
   * @param oldPassword the oldPassword to set
   */
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  /**
   * @return the oldPasswordInput
   */
  public String getOldPasswordInput() {
    return oldPasswordInput;
  }

  /**
   * @param oldPasswordInput the oldPasswordInput to set
   */
  public void setOldPasswordInput(String oldPasswordInput) {
    this.oldPasswordInput = oldPasswordInput;
  }

  /**
   * @return the newPasswordConfirmation
   */
  public String getNewPasswordConfirmation() {
    return newPasswordConfirmation;
  }

  /**
   * @param newPasswordConfirmation the newPasswordConfirmation to set
   */
  public void setNewPasswordConfirmation(String newPasswordConfirmation) {
    this.newPasswordConfirmation = newPasswordConfirmation;
  }

}
