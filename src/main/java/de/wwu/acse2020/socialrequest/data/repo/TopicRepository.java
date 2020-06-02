package de.wwu.acse2020.socialrequest.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.wwu.acse2020.socialrequest.data.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, String> {
}
