package de.wwu.acse.socialrequest.validator.annotation;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatchers {

  PasswordMatches[] value();

}
