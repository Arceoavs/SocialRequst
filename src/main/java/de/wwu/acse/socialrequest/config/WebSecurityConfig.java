package de.wwu.acse.socialrequest.config;

import de.wwu.acse.socialrequest.service.UserAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private UserAuthenticationService userAuthenticationService;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authenticationProvider());
  }

  /*
   * Configure which sites can be accessed by which user roles
   * Info on how to create antMatcher Patterns: https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/util/AntPathMatcher.html
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      // prevent CSRF (Cross-Site Request Forgery) attacks
      .csrf().disable()
      // page access authorization
      .authorizeRequests()
        .antMatchers("/images/**", "/css/**", "/js/**").permitAll()
        // Pages that can be accessed by all visitors
        .antMatchers("/", "/search", "/users/register", "/h2console/**", "/leaderboard/**").permitAll()
        .antMatchers("/users/login").anonymous()
        .anyRequest().hasAuthority("ROLE_USER")
        .and()
      // login
      .formLogin()
        .loginPage("/users/login")
        .defaultSuccessUrl("/")
        .failureUrl("/users/login?error=true")
        .and()
      .logout()
        .logoutUrl("/users/logout")
        .logoutSuccessUrl("/")
        .permitAll()
        .and()
      // activate frames for h2 console
      .headers().frameOptions().sameOrigin();
  }

  @Bean
  public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
    authProvider.setUserDetailsService(userAuthenticationService);
    authProvider.setPasswordEncoder(passwordEncoder());
    return authProvider;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
