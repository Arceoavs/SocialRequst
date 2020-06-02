package de.wwu.acse.group6.socialrequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Group6Application {

  public static void main(String[] args) {
    SpringApplication.run(Group6Application.class, args);
  }

}
