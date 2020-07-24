-- Seeds

-- USERS
INSERT IGNORE INTO `users` (`username`, `email`, `password`, `lat`, `lng`) VALUES
  -- password: test123
  ('john.doe', 'john.doe@example.com', '$2a$10$wJt6WXFgtntjb3Clg2eOHua5G8yd8KjrQEzgZj5AzleA6XauO/xfC', 51.961546, 7.620317),
  ('jane.doe', 'jane.doe@example.com', '$2a$10$wJt6WXFgtntjb3Clg2eOHua5G8yd8KjrQEzgZj5AzleA6XauO/xfC', 51.978957, 7.666092);

-- TOPICS
INSERT IGNORE INTO `topics` (`name`) VALUES ('shopping'), ('animal'), ('repair'), ('mask'), ('car');

-- TOPICS FOR USERES
INSERT IGNORE INTO `specialties` (`user_id`, `topic_id`) VALUES
  (1,2),
  (1,3);
