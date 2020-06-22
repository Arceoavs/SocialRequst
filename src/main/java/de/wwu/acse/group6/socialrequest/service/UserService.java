package de.wwu.acse.group6.socialrequest.service;

import de.wwu.acse.group6.socialrequest.exception.DuplicateUserException;
import de.wwu.acse.group6.socialrequest.form.RegisterUserForm;
import de.wwu.acse.group6.socialrequest.form.UserProfileForm;
import de.wwu.acse.group6.socialrequest.model.User;
import de.wwu.acse.group6.socialrequest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserAuthenticationService authenticationService;

  /**
   * Registers a new user account.
   * Makes sure that the username and mail do not exist before
   * @param userForm data transfer object for the new user
   * @return the newly persisted user
   * @throws DuplicateUserException when a user with the same username or mail already exists
   */
  @Transactional
  public User registerNewUserAccount(RegisterUserForm userForm) throws DuplicateUserException {
    if (emailExists(userForm.getEmail())) {
      throw new DuplicateUserException("An account with that email already exists: " + userForm.getEmail());
    }

    if (usernameExists(userForm.getUsername())) {
      throw new DuplicateUserException("An account with that username already exists: " + userForm.getUsername());
    }

    String encryptedPassword = passwordEncoder.encode(userForm.getPassword());
    User user = new User(
      userForm.getUsername(),
      userForm.getEmail(),
      encryptedPassword,
      userForm.getLat(),
      userForm.getLng()
    );

    return userRepository.save(user);
  }

  /**
   * Updates basic user data (except password)
   * Makes sure that the username and mail do not exist before
   * @param userForm data transfer object for the user
   * @return updated user
   * @throws DuplicateUserException when a user with the same username or mail already exists
   */
  public User updateUser(UserProfileForm userForm) throws DuplicateUserException {
    if (emailExists(userForm.getEmail(), userForm.getId())) {
      throw new DuplicateUserException("An account with that email already exists: " + userForm.getEmail());
    }

    if (usernameExists(userForm.getUsername(), userForm.getId())) {
      throw new DuplicateUserException("An account with that username already exists: " + userForm.getUsername());
    }
    return persistUser(userForm);
  }

  /**
   * Persists existing user
   * @param userForm data transfer object for the user
   * @return persisted user entity
   */
  @Transactional
  protected User persistUser(UserProfileForm userForm) {

    User user = userRepository.getOne(userForm.getId());
    user.setUsername(userForm.getUsername());
    user.setEmail(userForm.getEmail());
    user.setSpecialties(userForm.getSpecialties());
    user.setLat(userForm.getLat());
    user.setLng(userForm.getLng());

    userRepository.save(user);
    authenticationService.reloadUserAuthentication(user.getUsername(), user.getPassword());

    return user;
  }

  /**
   * Updates the user's password
   * @param username username of the user
   * @param rawPassword new password
   */
  public void updatePassword(String username, String rawPassword) {
    String encryptedPassword = passwordEncoder.encode(rawPassword);
    User user = userRepository.findByUsername(username);
    user.setPassword(encryptedPassword);
    userRepository.save(user);
    authenticationService.reloadUserAuthentication(username, encryptedPassword);
  }

  private boolean emailExists(String email) {
    return userRepository.findByEmail(email) != null;
  }

  private boolean usernameExists(String username) {
    return userRepository.findByUsername(username) != null;
  }

  private boolean emailExists(String email, Long id) {
    return userRepository.otherUserExistsWithEmail(email, id);
  }

  private boolean usernameExists(String username, Long id) {
    return userRepository.otherUserExistsWithUsername(username, id);
  }

}
