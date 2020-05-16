package com.group6.group6;

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
