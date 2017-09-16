CREATE DATABASE interview_base ENCODING 'UTF8' TEMPLATE template0;

-- ups

CREATE TABLE interview (
  id   BIGSERIAL NOT NULL,
  name VARCHAR(400),
  CONSTRAINT pk_interview PRIMARY KEY (id)
);

CREATE TABLE question (
  id           BIGSERIAL NOT NULL,
  interview_id BIGINT    NOT NULL,
  title        VARCHAR(4000),
  text         VARCHAR(4000),
  answer       VARCHAR(40000),
  CONSTRAINT pk_question PRIMARY KEY (id)
);

ALTER TABLE question
  ADD CONSTRAINT fk_question_interview_id FOREIGN KEY (interview_id) REFERENCES interview (id) ON DELETE RESTRICT ON UPDATE RESTRICT;

INSERT INTO public.interview (id, name) VALUES (1, 'Рога и Копыта, весенний набор');
INSERT INTO public.interview (id, name) VALUES (2, 'Корпорация Монстров, HR интервью');

INSERT INTO public.question (id, interview_id, title, text, answer) VALUES
  (1, 1, 'Кто такая Свинка Пеппа?', '', '«Свинка Пеппа» — британский мультсериал из коротких мультфильмов по 5 минут.');
INSERT INTO public.question (id, interview_id, title, text, answer)
VALUES (2, 1, 'Сколько раз в день вы смотрите Пеппу?', '', 'Минимум дважды: утром и вечером.');
INSERT INTO public.question (id, interview_id, title, text, answer)
VALUES (3, 2, 'Назовите методы класса Object.', 'Можно только основные.', 'Основные: hashCode, equals, toString, wait, notify, notifyAll');

-- downs

DROP TABLE question;
DROP TABLE interview;