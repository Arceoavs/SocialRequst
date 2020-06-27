package de.wwu.acse.group6.socialrequest.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import de.wwu.acse.group6.socialrequest.repository.RequestRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RequestTests {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private RequestRepository requestRepo;

  /**
  * Tests if a request entry is created successfully
  */
  @Test
  public void testRequestCreation() {
    //entity creation
    User user = new User("john.doe", "john@doe.com", "test123");
    entityManager.persistAndFlush(user);
    Request request = new Request(
      "Walk my dog",
      "Please take my cute dog for a walk",
      ((float) 51.975959),
      ((float) 7.60186),
      user
    );
    entityManager.persistAndFlush(request);

    //search entry
    Request found = requestRepo.findByTitle("Walk my dog");
    user = entityManager.refresh(user);

    //assert result
    assertEquals(request.getTitle(), found.getTitle());
    assertTrue(user.getSubmittedRequests().contains(request));
  }

  /**
   * Test if topic assignment works correctly
   */
  @Test
  public void testRequestCreationWithTopics() {
    User user = new User("john.doe", "john@doe.com", "test123");
    entityManager.persistAndFlush(user);
    Topic[] topicsData = {new Topic("Dog"), new Topic("Walking")};
    Set<Topic> topics = new HashSet<>();

    for(Topic topic : topicsData) {
      topics.add(topic);
    }

    Request walkDog = new Request(
      "Walk my dog",
      "Please take my cute dog for a walk",
      ((float) 51.975959),
      ((float) 7.60186),
      user,
      topics
    );
    entityManager.persist(walkDog);
    entityManager.flush();

    //search entry
    Request found = requestRepo.findByTitle("Walk my dog");


    //assert result
    assertEquals(topics, found.getTopics());
  }
}
