package com.group6.group6.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import com.group6.group6.exception.RequestAlreadyFulfilledException;
import com.group6.group6.model.Fulfillment;
import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.repository.FulfillmentRepository;

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
    public FulfillmentService fulfillmentService() {
      return new FulfillmentService();
    }

  }

  @Autowired
  private TestEntityManager entityManager;

  @InjectMocks
  private FulfillmentService fulfillmentService;

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
    Request request = new Request(
      "Walk my dog",
      "Please take my cute dog for a walk",
      ((float) 51.975959),
      ((float) 7.60186),
      user
    );
    entityManager.persistAndFlush(request);

    // create fulfilling user
    User anotherUser = new User("jane.doe", "jane@doe.com", "test123");
    entityManager.persistAndFlush(anotherUser);

    Mockito
      .when(fulfillmentRepository.save(any(Fulfillment.class)))
      .thenReturn(entityManager.persistAndFlush(new Fulfillment(request, anotherUser)));

    assertFalse(request.isFulfilled());

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
      Request request = new Request(
        "Walk my dog",
        "Please take my cute dog for a walk",
        ((float) 51.975959),
        ((float) 7.60186),
        user
      );
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
