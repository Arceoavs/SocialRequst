package de.wwu.acse.socialrequest.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import de.wwu.acse.socialrequest.exception.RequestAlreadyFulfilledException;
import de.wwu.acse.socialrequest.model.Fulfillment;
import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.model.User;
import de.wwu.acse.socialrequest.repository.FulfillmentRepository;
import de.wwu.acse.socialrequest.service.impl.FulfillmentServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FulfillmentServiceTests {

  @TestConfiguration
  static class FulfillmentServiceTestsConfiguration {

    @Bean
    public FulfillmentServiceImpl fulfillmentService() {
      return new FulfillmentServiceImpl();
    }

  }

  @Autowired
  private TestEntityManager entityManager;

  @InjectMocks
  private FulfillmentServiceImpl fulfillmentService;

  @Mock
  private FulfillmentRepository fulfillmentRepository;

  /**
   * Tests if a request can be fulfilled successfully
   */
  @Test
  public void testFulfillingARequest() {
    // create request
    User user = new User("john.doe", "john@doe.com", "test123");
    entityManager.persistAndFlush(user);
    Request request = new Request("Walk my dog", "Please take my cute dog for a walk", ((float) 51.975959),
        ((float) 7.60186), user);
    entityManager.persistAndFlush(request);

    // create fulfilling user
    User anotherUser = new User("jane.doe", "jane@doe.com", "test123");
    entityManager.persistAndFlush(anotherUser);

    assertFalse(request.isFulfilled());

    Mockito
      .when(fulfillmentRepository.save(any()))
      .thenReturn(entityManager.persistAndFlush(new Fulfillment(request, anotherUser)));

    fulfillmentService.fulfillRequest(request, anotherUser);
    request = entityManager.refresh(request);
    anotherUser = entityManager.refresh(anotherUser);

    assertTrue(request.isFulfilled());
    assertTrue(anotherUser.getFulfilledRequests().contains(request));
  }

  @Test
  public void testThrowingAnExceptionWhenFulfillingAFulfilledRequest() {
    assertThrows(RequestAlreadyFulfilledException.class, () -> {
      // create request
      User user = new User("john.doe", "john@doe.com", "test123");
      entityManager.persistAndFlush(user);
      Request request = new Request("Walk my dog", "Please take my cute dog for a walk", ((float) 51.975959),
          ((float) 7.60186), user);
      entityManager.persistAndFlush(request);

      // create fulfilling user
      User anotherUser = new User("jane.doe", "jane@doe.com", "test123");
      entityManager.persistAndFlush(anotherUser);

      entityManager.persistAndFlush(new Fulfillment(request, anotherUser));
      request = entityManager.refresh(request);
      anotherUser = entityManager.refresh(anotherUser);

      assertTrue(request.isFulfilled());
      assertTrue(anotherUser.getFulfilledRequests().contains(request));

      fulfillmentService.fulfillRequest(request, anotherUser);
    });
  }

}
