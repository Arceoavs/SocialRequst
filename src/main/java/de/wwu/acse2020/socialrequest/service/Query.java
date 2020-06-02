package de.wwu.acse2020.socialrequest.service;

import java.util.List;
import java.util.function.Supplier;

import de.wwu.acse2020.socialrequest.data.model.Request;

public class Query {
  private final String id;

  private final String titleShort;

  private final String titleLong;

  private final String description;

  private final Supplier<List<Request>> query;

  public Query(String id, String titleShort, String titleLong, String description, Supplier<List<Request>> query) {
    this.id = id;
    this.titleShort = titleShort;
    this.titleLong = titleLong;
    this.description = description;
    this.query = query;
  }

  public String getId() {
    return id;
  }

  public String getTitleShort() {
    return titleShort;
  }

  public String getTitleLong() {
    return titleLong;
  }

  public String getDescription() {
    return description;
  }

  public QueryResult execute() {
    return new QueryResult(this, query.get());
  }
}
