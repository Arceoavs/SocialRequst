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
   * @param query
   * @return
   */
  public List<Request> getRequests(String query) {
    if (query == null || query.length() <= 0) {
      return Collections.emptyList();
    }

    Set<Topic> topics = new HashSet<>();

    topics.add(new Topic("Sports"));
    topics.add(new Topic("Test"));

    List<Request> resultList = new ArrayList<>();
    resultList.add(new Request("R1", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed", 5.23423F, 4.23534F, topics));
    resultList.add(new Request("R2", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren,", 5.212323F, 4.2312334F));

    return resultList;
  }
}
