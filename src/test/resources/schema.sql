CREATE TABLE users (
  id BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  lat DECIMAL(9, 6) NOT NULL,
  lng DECIMAL(9, 6) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY users_username_unique (username),
  UNIQUE KEY users_email_unique (email)
);

CREATE TABLE topics (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY topics_name_unique (name)
);

CREATE TABLE requests (
  id BIGINT NOT NULL AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  lat DECIMAL(9, 6) NOT NULL,
  lng DECIMAL(9, 6) NOT NULL,
  user_id BIGINT NOT NULL,
  created_at TIMESTAMP NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE fulfillments (
  id BIGINT NOT NULL AUTO_INCREMENT,
  request_id BIGINT NOT NULL,
  user_id BIGINT,
  created_at TIMESTAMP NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY fulfillments_request_id_unique (request_id),
  FOREIGN KEY (request_id) REFERENCES requests (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE SET NULL
    ON UPDATE CASCADE
);

CREATE TABLE specialties (
  user_id BIGINT NOT NULL,
  topic_id BIGINT NOT NULL,
  PRIMARY KEY (user_id, topic_id),
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (topic_id) REFERENCES topics (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE requests_topics (
  request_id BIGINT NOT NULL,
  topic_id BIGINT NOT NULL,
  PRIMARY KEY (request_id, topic_id),
  FOREIGN KEY (request_id) REFERENCES requests (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (topic_id) REFERENCES topics (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
