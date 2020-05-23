package com.group6.group6.validator.annotation;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatchers {

  PasswordMatches[] value();

}
