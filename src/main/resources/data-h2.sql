-- Seeds for Development

-- USERS
INSERT INTO users (username, email, password, lat, lng) VALUES
  -- password: test123
  ('john.doe', 'john.doe@example.com', '$2a$10$wJt6WXFgtntjb3Clg2eOHua5G8yd8KjrQEzgZj5AzleA6XauO/xfC', 51.961546, 7.620317),
  ('jane.doe', 'jane.doe@example.com', '$2a$10$wJt6WXFgtntjb3Clg2eOHua5G8yd8KjrQEzgZj5AzleA6XauO/xfC', 51.978957, 7.666092);

-- TOPICS
INSERT INTO topics (name) VALUES ('shopping'), ('animal'), ('repair'), ('mask'), ('car');

-- REQUESTS
INSERT INTO requests (user_id, title, description, lat, lng, created_at) VALUES
  (1, 'Walk my dog', 'Can you please walk my dog a kilometer?', 51.961546, 7.620317, LOCALTIMESTAMP),
  (1, 'Go shopping for me', 'Can you please shop groceries for me?', 52.961546, 8.620317, LOCALTIMESTAMP),
  (1, 'Repair Bicycle', 'Can someone please repair my flat tire on my bicycle?', 53.961546, 9.620317, LOCALTIMESTAMP),
  (1, 'Walk my other dog', 'Can you please walk my other dog two kilometers?', 54.961546, 9.620317, LOCALTIMESTAMP),
  (2, 'Craft a mask', 'I need a mask to go shopping and travel to work. Can someone make me one?', 51.978957, 7.666092, LOCALTIMESTAMP),
  (2, 'I need a cook', 'Can someone be a cook for me? I cannot cook.', 52.978957, 7.666092, LOCALTIMESTAMP),
  (2, 'I need a ride', 'My car broke down. Can someone offer me a daily commute?', 53.978957, 9.666092, LOCALTIMESTAMP),
  (2, 'Brush my cat', 'I am bad with cats. Can someone brush my cat? She has been losing a lot of hair and it is a mess to clean up.', 54.978957, 5.666092, LOCALTIMESTAMP),
  (2, 'Walk my Cat', 'I am bad with cats. Can someone (except john) walk my cat?', 51.978957, 7.796092, LOCALTIMESTAMP);

-- TOPICS FOR REQUESTS
INSERT INTO requests_topics (request_id, topic_id) VALUES
  (1, 2),
  (2, 1),
  (3, 3),
  (4, 2),
  (5, 4),
  (6, 1),
  (7, 5),
  (8, 2);

-- TOPICS FOR USERES
INSERT INTO specialties (user_id, topic_id) VALUES
  (1,2),
  (1,3);