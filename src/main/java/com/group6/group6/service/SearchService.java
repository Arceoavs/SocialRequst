package com.group6.group6.service;

import com.group6.group6.model.Request;
import com.group6.group6.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    List<Request> resultList = new ArrayList<>();
    resultList.add(new Request("R1", "Desc 1", 5.23423F, 4.23534F));
    resultList.add(new Request("R2", "Desc 124", 5.212323F, 4.2312334F));

    return resultList;
  }
}
