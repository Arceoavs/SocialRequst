package de.wwu.acse2020.socialrequest.service;

import java.util.List;

public interface QueryService {
  List<Query> getAll();

  Query get(String queryId);
}
