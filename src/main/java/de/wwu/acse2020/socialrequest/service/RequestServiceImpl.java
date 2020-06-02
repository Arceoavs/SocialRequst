package de.wwu.acse2020.socialrequest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.data.repo.RequestRepository;

@Service
public class RequestServiceImpl extends AbstractService implements RequestService {
  @Autowired
  private RequestRepository requestRepo;

  @Autowired
  private TopicService topicService;

  @Override
  public Request create(Request request) {
    request.setUser(getCurrentUser());
    request.setCreatedAt(new Date());
    request.setTopics(topicService.createOrUpdateAll(request.getTopics()));

    return requestRepo.save(request);
  }

  @Override
  public Request get(long id) {
    return requestRepo.findById(id).get();
  }

  @Override
  public List<Request> getLatestByUser(User user) {
    return requestRepo.findAllByUserOrderByCreatedAtDesc(user);
  }

  @Override
  public List<Request> getLatestUnfulfilled() {
    return requestRepo.findAllByFulfillmentIsNullOrderByCreatedAtDesc();
  }

  @Override
  public List<Request> search(String query) {
    return requestRepo.fullTextSearchUnfulfilled(query);
  }
}
