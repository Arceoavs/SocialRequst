package com.group6.group6.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.group6.group6.model.User;
import com.group6.group6.validator.annotation.PasswordMatches;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

  private String message;

  @Override
  public void initialize(PasswordMatches constraintAnnotation) {
    this.message = constraintAnnotation.message();
  }

  @Override
  public boolean isValid(Object object, ConstraintValidatorContext context) {
    User user = (User) object;
    boolean isValid = user.getPassword().equals(user.getPasswordConfirmation());

    if (!isValid) {
      context
        .buildConstraintViolationWithTemplate(this.message)
        .addPropertyNode("passwordConfirmation")
        .addConstraintViolation()
        .disableDefaultConstraintViolation();
    }

    return isValid;
  }

}