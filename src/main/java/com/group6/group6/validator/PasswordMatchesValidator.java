package com.group6.group6.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.group6.group6.model.User;
import com.group6.group6.validator.annotation.PasswordMatches;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

  @Override
  public void initialize(PasswordMatches constraintAnnotation) {}

  @Override
  public boolean isValid(Object object, ConstraintValidatorContext context) {
    User user = (User) object;

    return user.getPassword().equals(user.getPasswordConfirmation());
  }

}
