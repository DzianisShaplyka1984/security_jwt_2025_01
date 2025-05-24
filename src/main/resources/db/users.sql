CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
  account_non_expired bit(1) NOT NULL,
  account_non_locked bit(1) NOT NULL,
  credentials_non_expired bit(1) NOT NULL,
  enabled bit(1) NOT NULL,
  password varchar(255) DEFAULT NULL,
  username varchar(255) DEFAULT NULL
);

CREATE TABLE user_roles(
  user_id bigint NOT NULL PRIMARY KEY,
  roles varchar(255) DEFAULT NULL,
  FOREIGN KEY (user_id) REFERENCES user (id)
)