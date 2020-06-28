package de.wwu.acse.socialrequest.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import de.wwu.acse.socialrequest.repository.FulfillmentRepository;
import de.wwu.acse.socialrequest.repository.RequestRepository;
import de.wwu.acse.socialrequest.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * With this class the topic Jpa implementation can be tested
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class FulfillmentTests {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  @Autowired
  private RequestRepository requestRepository;

  @Test
  public void testARequestStaysFulfilledWhenUserIsDeleted() {
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

    User fulfillingUser = new User("jane.doe", "jane@doe.com", "test123");
    entityManager.persistAndFlush(fulfillingUser);

    entityManager.persistAndFlush(new Fulfillment(request, fulfillingUser));

    request = entityManager.refresh(request);
    assertTrue(request.isFulfilled());

    userRepository.delete(entityManager.refresh(fulfillingUser));
    userRepository.flush();

    request = requestRepository.findAll().get(0);
    assertTrue(request.isFulfilled());
    assertNotNull(request.getFulfillment());
    assertNull(request.getFulfillment().getUser());
    assertEquals(fulfillmentRepository.count(), 1L);
    assertEquals(userRepository.count(), 1L);
  }

}
