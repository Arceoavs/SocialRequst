package de.wwu.acse2020.socialrequest.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private UserDetailsService userDetailsService;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            // Allow public GET requests
            .antMatchers(HttpMethod.GET, "/", "/js/**", "/css/**", "/users/register", "/search").
            permitAll()

            // Allow to register
            .antMatchers(HttpMethod.POST, "/users").
            permitAll()

            // Allow to access the H2 console (only for debugging)
            .antMatchers("/h2-console/**").
            permitAll()

            // Disallow any other request
            .anyRequest().
            authenticated()

            // Configure login
            .and().formLogin().
            loginPage("/users/login").
            loginProcessingUrl("/users/login").
            defaultSuccessUrl("/").
            failureUrl("/users/login?error").
            permitAll()

            // Configure logout
            .and().logout().
            logoutUrl("/users/logout").
            deleteCookies("JSESSIONID").
            logoutSuccessUrl("/users/login?logout").
            permitAll()

            // Disable CSRF only for H2 console (only for debugging)
            .and().csrf().
            ignoringAntMatchers("/h2-console/**")

            // Set X-Frame-Options to sameorigin to allow the H2 console to function (only for debugging)
            .and().headers().frameOptions().sameOrigin();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authenticationProvider());
  }

  @Bean
  public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService);
    authProvider.setPasswordEncoder(passwordEncoder());
    return authProvider;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
