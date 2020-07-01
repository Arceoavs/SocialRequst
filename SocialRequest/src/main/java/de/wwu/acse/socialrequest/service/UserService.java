package de.wwu.acse.socialrequest.service;

import de.wwu.acse.socialrequest.exception.DuplicateUserException;
import de.wwu.acse.socialrequest.form.RegisterUserForm;
import de.wwu.acse.socialrequest.form.UserProfileForm;
import de.wwu.acse.socialrequest.model.User;

import org.springframework.transaction.annotation.Transactional;


public interface UserService {

  /**
   * Registers a new user account.
   * Makes sure that the username and mail do not exist before
   * @param userForm data transfer object for the new user
   * @return the newly persisted user
   * @throws DuplicateUserException when a user with the same username or mail already exists
   */
  @Transactional
  public User registerNewUserAccount(RegisterUserForm userForm) throws DuplicateUserException;

  /**
   * Updates basic user data (except password)
   * Makes sure that the username and mail do not exist before
   * @param userForm data transfer object for the user
   * @return updated user
   * @throws DuplicateUserException when a user with the same username or mail already exists
   */
  public User updateUser(UserProfileForm userForm) throws DuplicateUserException;

  /**
   * Updates the user's password
   * @param username username of the user
   * @param rawPassword new password
   */
  public void updatePassword(String username, String rawPassword);


}
