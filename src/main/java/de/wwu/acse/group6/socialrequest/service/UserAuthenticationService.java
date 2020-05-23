package de.wwu.acse.group6.socialrequest.service;

import de.wwu.acse.group6.socialrequest.auth.CurrentUser;
import de.wwu.acse.group6.socialrequest.model.User;
import de.wwu.acse.group6.socialrequest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;

@Service
@Transactional
public class UserAuthenticationService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username);

    // handle unknown usernames
    if (user == null) {
      throw new UsernameNotFoundException(
        "It seems as there is no user registered by this username (" + username + "). Try another username or create a new user account at /users/register."
      );
    }

    /*
     * Here we return a new userdetails.User object
     * Otherwise we could let our User Class extend the User Details Object and just return it i found
     * However, I think it is cleaner to split data persistence and functionality
     */
    return new CurrentUser(
      user.getUsername(),
      user.getPassword(),
      true,
      true,
      true,
      true,
      getAuthorities(),
      user
    );
  }

  /**
   * Use this method to reload the authenticated principal when the corresponding
   * user entity was updated (this is especially necessary when the username was updated).
   * @param username new username of the updated user object
   * @param encryptedPassword current encrypted version of the updated user's password
   */
  public void reloadUserAuthentication(String username, String encryptedPassword) {
    Authentication authentication = new UsernamePasswordAuthenticationToken(
      loadUserByUsername(username),
      encryptedPassword,
      getAuthorities()
    );

    SecurityContextHolder.getContext().setAuthentication(authentication);
  }

  /**
   * Currently we only have the general Role of user
   * Later we can store different roles in the user Object and create the Authority Objects here,
   * which can then be added to the collection
   * More info on Roles and Priviliges: https://www.baeldung.com/role-and-privilege-for-spring-security-registration
   */
  public Collection<GrantedAuthority> getAuthorities() {
    return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
  }

}
