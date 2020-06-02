package de.wwu.acse2020.socialrequest.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.service.exceptions.PasswordUnsetException;
import de.wwu.acse2020.socialrequest.service.exceptions.UsernameAlreadyExistsException;

public interface UserService extends UserDetailsService {
  User get(long id);

  User create(User user) throws UsernameAlreadyExistsException, PasswordUnsetException;

  User update(User user) throws UsernameAlreadyExistsException;

  void login(User user);
}
