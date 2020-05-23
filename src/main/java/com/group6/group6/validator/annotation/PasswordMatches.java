package com.group6.group6.validator.annotation;

import com.group6.group6.validator.PasswordMatchesValidator;

import java.lang.annotation.*;
import javax.validation.*;

@Documented
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
public @interface PasswordMatches {

  String message() default "Passwords do not match";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
