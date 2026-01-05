
CREATE TABLE users (
  id INT PRIMARY KEY,
  score INT DEFAULT 0
);

CREATE TABLE progress (
  user_id INT,
  quest_id INT,
  PRIMARY KEY(user_id, quest_id)
);
