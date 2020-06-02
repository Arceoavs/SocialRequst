package de.wwu.acse2020.socialrequest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.data.repo.UserRepository;
import de.wwu.acse2020.socialrequest.service.exceptions.PasswordUnsetException;
import de.wwu.acse2020.socialrequest.service.exceptions.UsernameAlreadyExistsException;

@Service
public class UserServiceImpl extends AbstractService implements UserService {
  @Autowired
  private TopicService topicService;

  @Autowired
  private UserRepository userRepo;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepo.findByUsername(username);
    if (user == null)
      throw new UsernameNotFoundException("User '" + username + "' not found");
    return user;
  }

  @Override
  public User get(long id) {
    return userRepo.findById(id).get();
  }

  @Override
  public User create(User user) throws UsernameAlreadyExistsException, PasswordUnsetException {
    // Check if username already exists
    if (userRepo.existsByUsername(user.getUsername()))
      throw new UsernameAlreadyExistsException();

    // Check if password is set
    if (user.getRawPassword() == null || user.getRawPassword().length() < 1)
      throw new PasswordUnsetException();
    user.setPassword(passwordEncoder.encode(user.getRawPassword()));

    // Create topics
    if (user.getSpecialties() != null) {
      user.setSpecialties(topicService.createOrUpdateAll(user.getSpecialties()));
    }

    return userRepo.save(user);
  }

  @Override
  public User update(User user) throws UsernameAlreadyExistsException {
    // Check if username already exists
    User sameUsername = userRepo.findByUsername(user.getUsername());
    if (sameUsername != null && sameUsername.getId() != user.getId())
      throw new UsernameAlreadyExistsException();

    // Check if new password should be set
    if (user.getRawPassword() != null && user.getRawPassword().length() > 0) {
      user.setPassword(passwordEncoder.encode(user.getRawPassword()));
    } else {
      // Copy old password
      Optional<User> oldUser = userRepo.findById(user.getId());
      user.setPassword(oldUser.get().getPassword());
    }

    // Create topics
    if (user.getSpecialties() != null) {
      user.setSpecialties(topicService.createOrUpdateAll(user.getSpecialties()));
    }

    return userRepo.save(user);
  }

  @Override
  public void login(User user) {
    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user, null,
            user.getAuthorities());
    SecurityContextHolder.getContext().setAuthentication(auth);
  }
}
