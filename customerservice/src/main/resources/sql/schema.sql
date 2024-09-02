drop table if exists customer;

CREATE TABLE customer(
   id       INTEGER  NOT NULL PRIMARY KEY,
   email    VARCHAR(200) NOT NULL,
   mobile   Number(10,0)  NOT NULL,
   password VARCHAR(32) NOT NULL,
   username VARCHAR(32) NOT NULL
);