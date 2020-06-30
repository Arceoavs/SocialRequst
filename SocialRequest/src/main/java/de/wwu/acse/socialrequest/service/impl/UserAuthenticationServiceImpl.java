package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.auth.CurrentUser;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.UserAuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;

@Service
@Transactional
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username);

    // handle unknown usernames
    if (user == null) {
      throw new UsernameNotFoundException("It seems as there is no user registered by this username (" + username
          + "). Try another username or create a new user account at /users/register.");
    }

    /*
     * Here we return a new userdetails. User object Otherwise we could let our User
     * Class extend the User Details Object and just return it i found However, I
     * think it is cleaner to split data persistence and functionality
     */
    return new CurrentUser(user.getUsername(), user.getPassword(), true, true, true, true, getAuthorities(), user);
  }

  @Override
  public void reloadUserAuthentication(String username, String encryptedPassword) {
    Authentication authentication = new UsernamePasswordAuthenticationToken(loadUserByUsername(username),
        encryptedPassword, getAuthorities());

    SecurityContextHolder.getContext().setAuthentication(authentication);
  }

  @Override
  public Collection<GrantedAuthority> getAuthorities() {
    return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
  }

}