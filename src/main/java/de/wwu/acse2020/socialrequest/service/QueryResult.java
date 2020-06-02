package de.wwu.acse2020.socialrequest.service;

import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Request;

public class QueryResult {
  private final Query query;

  private final List<Request> requests;

  public QueryResult(Query query, List<Request> requests) {
    this.query = query;
    this.requests = requests;
  }

  public Query getQuery() {
    return query;
  }

  public List<Request> getRequests() {
    return requests;
  }
}
