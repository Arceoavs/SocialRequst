package com.group6.group6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ThymeleafConfig {

  @Bean
  public LayoutDialect layoutDialect() {
    return new LayoutDialect();
  }

}
