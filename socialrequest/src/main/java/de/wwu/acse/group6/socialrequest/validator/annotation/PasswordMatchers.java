package de.wwu.acse.group6.socialrequest.validator.annotation;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatchers {

  PasswordMatches[] value();

}
