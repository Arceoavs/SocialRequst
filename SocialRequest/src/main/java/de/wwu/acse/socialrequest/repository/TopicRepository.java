package de.wwu.acse.socialrequest.repository;

import de.wwu.acse.socialrequest.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

  public Topic findByName(String name);

}
