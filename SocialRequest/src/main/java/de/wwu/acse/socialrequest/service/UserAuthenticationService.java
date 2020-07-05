package de.wwu.acse.socialrequest.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserAuthenticationService extends UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

  /**
   * Use this method to reload the authenticated principal when the corresponding
   * user entity was updated (this is especially necessary when the username was
   * updated).
   *
   * @param username          new username of the updated user object
   * @param encryptedPassword current encrypted version of the updated user's
   *                          password
   */
  public void reloadUserAuthentication(String username, String encryptedPassword);

  /**
   * Currently we only have the general Role of user Later we can store different
   * roles in the user Object and create the Authority Objects here, which can
   * then be added to the collection More info on Roles and Priviliges:
   * https://www.baeldung.com/role-and-privilege-for-spring-security-registration
   */
  public Collection<GrantedAuthority> getAuthorities();

}
