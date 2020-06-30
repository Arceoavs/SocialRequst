package de.wwu.acse.socialrequest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import de.wwu.acse.socialrequest.model.Request;

@Service
public interface QueryService {

  /**
   * Method Method to get a list of requests, based on the logged in users topics
   * 
   * @return list of requests
   */
  public List<Request> getRequestMatchingTopics();

  /**
   * Method to get a list of requests, based on the logged in user coordinates
   * 
   * @return list of requests
   */
  public List<Request> getNearByUser();

}
