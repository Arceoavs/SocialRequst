package de.wwu.acse.group6.socialrequest.auth;

import java.util.Collection;

import de.wwu.acse.group6.socialrequest.model.User;

import org.springframework.security.core.GrantedAuthority;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

  private static final long serialVersionUID = 1234598716235871L;

  private User user;

  /**
   * Calls the more complex constructor with all boolean arguments set to {@code true}.
   */
  public CurrentUser(String username, String password, Collection<? extends GrantedAuthority> authorities, User user) {
    super(username, password, true, true, true, true, authorities);
    this.user = user;
  }

  /**
   * Construct the <code>User</code> with the details required by
   * {@link org.springframework.security.authentication.dao.DaoAuthenticationProvider}.
   *
   * @param username the username presented to the
   * <code>DaoAuthenticationProvider</code>
   * @param password the password that should be presented to the
   * <code>DaoAuthenticationProvider</code>
   * @param enabled set to <code>true</code> if the user is enabled
   * @param accountNonExpired set to <code>true</code> if the account has not expired
   * @param credentialsNonExpired set to <code>true</code> if the credentials have not
   * expired
   * @param accountNonLocked set to <code>true</code> if the account is not locked
   * @param authorities the authorities that should be granted to the caller if they
   * presented the correct username and password and the user is enabled. Not null.
   *
   * @throws IllegalArgumentException if a <code>null</code> value was passed either as
   * a parameter or as an element in the <code>GrantedAuthority</code> collection
   */
  public CurrentUser(
    String username,
    String password,
    boolean enabled,
    boolean accountNonExpired,
    boolean credentialsNonExpired,
    boolean accountNonLocked,
    Collection<? extends GrantedAuthority> authorities,
    User user
  ) {
    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    this.user = user;
  }

  /**
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }

}
