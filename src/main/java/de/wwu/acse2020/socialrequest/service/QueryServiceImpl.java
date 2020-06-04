package de.wwu.acse2020.socialrequest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import de.wwu.acse2020.socialrequest.data.repo.RequestRepository;

@Service
public class QueryServiceImpl extends AbstractService implements QueryService {
  private final Map<String, Query> queries = new LinkedHashMap<>();

  @Autowired
  private RequestRepository requestRepo;

  public QueryServiceImpl() {
    queries.put("near-by", new Query("near-by", "Near by", "Near by Requests", "Searches for near by requests",
            () -> requestRepo.nearByUser(getCurrentUser().getLatitude(), getCurrentUser().getLongitude())));

    queries.put("matching-specialties",
            new Query("matching-specialties", "Matching Specialties", "Requests Matching your Specialities",
                    "Searches for requests that match my specialities",
                    () -> requestRepo.matchingSpecialtiesOfUser(getCurrentUser())));
  }

  @Override
  public List<Query> getAll() {
    return new ArrayList<>(queries.values());
  }

  @Override
  public Query get(String queryId) {
    Query query = queries.get(queryId);
    if (query == null)
      throw new NoSuchElementException("Query not found");
    return query;
  }
}
