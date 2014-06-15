
# --- !Ups
 
CREATE TABLE User (userid bigint(20) NOT NULL AUTO_INCREMENT, email varchar(255) NOT NULL, password varchar(255) NOT NULL, firstname varchar(255) NOT NULL, lastname varchar(255) NOT NULL, PRIMARY KEY (userid));
 
# --- !Downs
DROP TABLE User;