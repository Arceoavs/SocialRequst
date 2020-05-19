package com.group6.group6.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.HashSet;

import javax.validation.ConstraintViolationException;

import com.group6.group6.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * With this class the topic Jpa implementation can be tested
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserTests {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private UserRepository userRepository;

  /**
   * The method tests if an entry is created successfully by trying to find it in
   * the database
   */
  @Test
  public void testCreationOfTopic() {
    // create entry
    User user = new User("john.doe", "john@doe.com", "test123", "test123");
    entityManager.persist(user);
    entityManager.flush();

    // look for entry
    User found = userRepository.findByEmail(user.getEmail());

    // assert the result
    assertEquals(user.getId(), found.getId());
  }

  @Test
  public void testValidations() {
    assertThrows(ConstraintViolationException.class, () -> {
      User user = new User("john.doe", "john@doe", "test123", "test123");
      entityManager.persist(user);
      entityManager.flush();
    });

    assertThrows(ConstraintViolationException.class, () -> {
      User user = new User("john.doe", "john@doe", "test123", "test");
      entityManager.persist(user);
      entityManager.flush();
    });
  }

  @Test
  public void testSpecialties() {
    User user = new User("john.doe", "john@doe.com", "test123", "test123");
    entityManager.persist(user);
    entityManager.flush();

    Topic topic = new Topic("shopping");
    entityManager.persistAndFlush(topic);

    Topic[] specialites = new Topic[]{topic};

    user.setSpecialties(new HashSet<>(Arrays.asList(specialites)));
    entityManager.persistAndFlush(user);

    User found = userRepository.findByEmail(user.getEmail());

    assertEquals(user.getId(), found.getId());
    assertTrue(found.getSpecialties().contains(topic));
    assertEquals(found.getSpecialties().size(), 1);

    user.setSpecialties(new HashSet<>());
    entityManager.persistAndFlush(user);

    found = userRepository.findByEmail(user.getEmail());

    assertEquals(user.getId(), found.getId());
    assertFalse(found.getSpecialties().contains(topic));
    assertEquals(found.getSpecialties().size(), 0);
  }
}
