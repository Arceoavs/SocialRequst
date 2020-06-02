package de.wwu.acse2020.socialrequest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import de.wwu.acse2020.socialrequest.data.model.Fulfillment;
import de.wwu.acse2020.socialrequest.data.model.Request;
import de.wwu.acse2020.socialrequest.data.model.User;
import de.wwu.acse2020.socialrequest.data.repo.FulfillmentRepository;
import de.wwu.acse2020.socialrequest.service.exceptions.FulfillmentAlreadyExistsException;

@Service
public class FulfillmentServiceImpl extends AbstractService implements FulfillmentService {
  @Autowired
  private FulfillmentRepository fulfillmentRepo;

  @Override
  public List<Fulfillment> getLatestByUser(User user) {
    return fulfillmentRepo.findAllByUserOrderByCreatedAtDesc(user);
  }

  @Override
  public Fulfillment create(Request request, User user) throws FulfillmentAlreadyExistsException {
    if (fulfillmentRepo.existsByRequest(request))
      throw new FulfillmentAlreadyExistsException();

    Fulfillment fulfillment = new Fulfillment();
    fulfillment.setRequest(request);
    fulfillment.setUser(user);
    fulfillment.setCreatedAt(new Date());

    return fulfillmentRepo.save(fulfillment);
  }
}
