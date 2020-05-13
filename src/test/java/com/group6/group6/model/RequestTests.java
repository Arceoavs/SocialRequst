package com.group6.group6.model;

import static org.junit.Assert.assertEquals;

import com.group6.group6.repository.RequestRepository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RequestTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RequestRepository requestRepo;

    /*
    * Tests if a request entry is created successfully
    */
    public void testRequestCreation() {  
        //entity creation   
        Request walkDog = new Request("Walk my dog", "Please take my cute dog for a walk", ((float) 51.975959), ((float) 7.60186));
        entityManager.persist(walkDog);
        entityManager.flush();

        //search entry
        Request found = requestRepo.findByTitle("Walk my dog");

        //assert result
        assertEquals(walkDog.getTitle(), found.getTitle());
    }
}