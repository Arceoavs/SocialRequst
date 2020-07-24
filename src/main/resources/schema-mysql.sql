CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `lat` decimal(9, 6) NOT NULL,
  `lng` decimal(9, 6) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_users_username` (`username`),
  UNIQUE KEY `unique_users_email` (`email`)
);

CREATE TABLE IF NOT EXISTS `topics` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_topics_name` (`name`)
);

CREATE TABLE IF NOT EXISTS `requests` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `description` TEXT,
  `lat` decimal(9, 6) NOT NULL,
  `lng` decimal(9, 6) NOT NULL,
  `user_id` bigint NOT NULL,
  `created_at` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_requests_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `fulfillments` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `request_id` bigint NOT NULL,
  `user_id` bigint,
  `created_at` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_fulfillments_request_id` (`request_id`),
  CONSTRAINT `fk_fulfillments_request_id` FOREIGN KEY (`request_id`) REFERENCES `requests` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_fulfillments_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `specialties` (
  `user_id` bigint NOT NULL,
  `topic_id` bigint NOT NULL,
  PRIMARY KEY (`user_id`, `topic_id`),
  CONSTRAINT `fk_specialties_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_specialties_topic_id` FOREIGN KEY (`topic_id`) REFERENCES `topics` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS `requests_topics` (
  `request_id` bigint NOT NULL,
  `topic_id` bigint NOT NULL,
  PRIMARY KEY (`request_id`, `topic_id`),
  CONSTRAINT `fk_requests_topics_request_id` FOREIGN KEY (`request_id`) REFERENCES `requests` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_requests_topics_topic_id` FOREIGN KEY (`topic_id`) REFERENCES `topics` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
