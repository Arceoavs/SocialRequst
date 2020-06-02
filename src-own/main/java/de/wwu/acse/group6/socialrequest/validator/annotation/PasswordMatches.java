package de.wwu.acse.group6.socialrequest.validator.annotation;

import de.wwu.acse.group6.socialrequest.validator.PasswordMatchesValidator;
import de.wwu.acse.group6.socialrequest.lib.UniversalGetter;

import java.lang.annotation.*;
import javax.validation.*;

/**
 * Any class utilizing this validation annotation has to implement the
 * {@link UniversalGetter} interface. Its implemented
 * method {@link UniversalGetter#get(String)} has to
 * accept at least the values provided in {@link #passwordField()} and
 * {@link #passwordConfirmationField()} as an input and return the according
 * values for the password and the password confirmation.
 */
@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Repeatable(PasswordMatchers.class)
public @interface PasswordMatches {

  String message() default "Passwords do not match";

  String passwordField() default "password";

  String passwordConfirmationField() default "passwordConfirmation";

  /**
   * Specifies whether the value given by the {@link #passwordField()}
   * is encrypted with the default password encoder and, thus,
   * whether the value given by the {@link #passwordConfirmationField()}
   * has to be encrypted before it is matched to the original value
   * (from the value given by the {@link #passwordField()}).
   */
  boolean encrypted() default false;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
