package com.group6.group6.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.validation.ConstraintViolationException;

import com.group6.group6.repository.TopicRepository;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * With this class the topic Jpa implementation can be tested
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class TopicTests {
  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private TopicRepository topicRepository;

  /**
   * The method tests if an entry is created successfully by trying to find it in the database
   */
  @Test
  public void testCreationOfTopic() {
    // create entry
    Topic shopping = new Topic("shopping");
    entityManager.persist(shopping);
    entityManager.flush();

    // look for entry
    Topic found = topicRepository.findByName("shopping");

    //assert the result
    assertEquals(shopping.getName(), found.getName());
  }

  @Test
  public void testPatternConstraint() {
    assertThrows(ConstraintViolationException.class, () -> { 
      Topic topic = new Topic("shopping fdafda");
      entityManager.persist(topic);
      entityManager.flush();
    });
  }
}
