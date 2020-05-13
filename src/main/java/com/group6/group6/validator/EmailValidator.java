package com.group6.group6.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.group6.group6.validator.annotation.ValidEmail;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {

  private static final String EMAIL_REGEX = "(?=\\A.{6,255}\\z)(\\A([\\p{L}0-9]+[\\w|\\-|\\.|\\+]*)@([\\p{L}0-9]+([\\-\\.]{1}[\\p{L}0-9]+)*\\.[\\p{L}]{2,63})\\z)";

  @Override
  public void initialize(ValidEmail constraintAnnotation) {}

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return validateEmail(value);
  }

  private boolean validateEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    Matcher matcher = pattern.matcher(email);

    return matcher.matches();
  }

}
