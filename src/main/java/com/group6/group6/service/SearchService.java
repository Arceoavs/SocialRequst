package com.group6.group6.service;

import com.group6.group6.model.Request;
import com.group6.group6.model.Topic;
import com.group6.group6.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SearchService {

  @Autowired
  private RequestRepository requestRepository;

  /**
   * Method to get a list of requests, based on a search query
   * @param query the search query to search for
   * @return a list of requests
   */
  public List<Request> getRequests(String query) {
    if (query == null || query.length() <= 0) {
      return Collections.emptyList();
    }


    if (requestRepository.findByTitleIsContainingIgnoreCase("R").size() <= 0) {
      // create some test data
      Set<Topic> topics = new HashSet<>();

      topics.add(new Topic("Sports"));
      topics.add(new Topic("Test"));

      List<Request> testList = new ArrayList<>();
      testList.add(new Request("R1", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed", 5.23423F, 4.23534F, topics));
      testList.add(new Request("R2", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, st ea rebum. Stet clita kasd gubergren,", 5.212323F, 4.2312334F));

      requestRepository.saveAll(testList);
    }

    List<Request> resultsByTitle = requestRepository.findByTitleIsContainingIgnoreCase(query);
    List<Request> resultsByDescription = requestRepository.findByDescriptionIsContainingIgnoreCase(query);

    List<Request> resultList = new ArrayList<>(resultsByTitle);
    resultList.addAll(resultsByDescription);

    return resultList;
  }
}
