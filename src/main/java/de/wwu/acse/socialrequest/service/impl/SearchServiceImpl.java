package de.wwu.acse.socialrequest.service.impl;

import de.wwu.acse.socialrequest.model.Request;
import de.wwu.acse.socialrequest.repository.RequestRepository;
import de.wwu.acse.socialrequest.repository.UserRepository;
import de.wwu.acse.socialrequest.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

  @Autowired
  private RequestRepository requestRepository;

  @Autowired
  UserRepository userRepository;

  @Override
  public List<Request> getRequests(String query) {
    if (query == null || query.length() <= 0) {
      return Collections.emptyList();
    }

    return requestRepository.search(query);
  }

}
