package de.wwu.acse.group6.socialrequest.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import de.wwu.acse.group6.socialrequest.validator.annotation.ValidEmail;

/**
 * Validates if a string is an email with a pattern
 */
public class EmailValidator implements ConstraintValidator<ValidEmail, String> {

  // see https://github.com/rubygarage/truemail/blob/v1.6.0/lib/truemail/core.rb#L32-L33
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
