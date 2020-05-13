package com.group6.group6.validator.annotation;

import com.group6.group6.validator.EmailValidator;

import java.lang.annotation.*;
import javax.validation.*;

@Documented
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidEmail {

  String message() default "Invalid email";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
