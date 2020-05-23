package de.wwu.acse.group6.socialrequest.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import de.wwu.acse.group6.socialrequest.lib.UniversalGetter;
import de.wwu.acse.group6.socialrequest.validator.annotation.PasswordMatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

  @Autowired
  private PasswordEncoder passwordEncoder;

  private PasswordMatches constraintAnnotation;

  @Override
  public void initialize(PasswordMatches constraintAnnotation) {
    this.constraintAnnotation = constraintAnnotation;
  }

  @Override
  public boolean isValid(Object object, ConstraintValidatorContext context) {
    UniversalGetter passwordObject = (UniversalGetter) object;
    boolean isValid = isValid(passwordObject);

    if (!isValid) {
      context
        .buildConstraintViolationWithTemplate(constraintAnnotation.message())
        .addPropertyNode(constraintAnnotation.passwordConfirmationField())
        .addConstraintViolation()
        .disableDefaultConstraintViolation();
    }

    return isValid;
  }

  private boolean isValid(UniversalGetter passwordObject) {
    if (constraintAnnotation.encrypted()) {
      return passwordEncoder.matches(
        (String) passwordObject.get(constraintAnnotation.passwordConfirmationField()),
        (String) passwordObject.get(constraintAnnotation.passwordField())
      );
    }
    return passwordObject.get(constraintAnnotation.passwordField()).equals(
      passwordObject.get(constraintAnnotation.passwordConfirmationField())
    );
  }

}
