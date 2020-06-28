package de.wwu.acse.socialrequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SocialRequestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SocialRequestApplication.class, args);
  }

}
