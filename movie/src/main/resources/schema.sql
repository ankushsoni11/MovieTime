DROP TABLE IF EXISTS `movie` CASCADE CONSTRAINTS;
CREATE TABLE `movie` (
  `movie_id` bigint NOT NULL,
  `movie_name` varchar(255),
  `city_id` bigint,
  `theater_id` bigint,
  PRIMARY KEY (`movie_id`)
);