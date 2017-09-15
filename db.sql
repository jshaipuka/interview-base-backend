CREATE DATABASE interview_base ENCODING 'UTF8' TEMPLATE template0;

CREATE TABLE interview (
  id   BIGSERIAL NOT NULL,
  name VARCHAR(400),
  CONSTRAINT pk_interview PRIMARY KEY (id)
);

CREATE TABLE question (
  id           BIGSERIAL NOT NULL,
  interview_id BIGINT    NOT NULL,
  text         VARCHAR(1000),
  CONSTRAINT pk_question PRIMARY KEY (id)
);

ALTER TABLE question
  ADD CONSTRAINT fk_question_interview_id FOREIGN KEY (interview_id) REFERENCES interview (id) ON DELETE RESTRICT ON UPDATE RESTRICT;