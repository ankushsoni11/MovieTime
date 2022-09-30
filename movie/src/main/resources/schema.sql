DROP TABLE IF EXISTS `movie` CASCADE CONSTRAINTS;
CREATE TABLE `movie` (
  `movie_id` bigint NOT NULL,
  `movie_name` varchar(255) NOT NULL,
  `city_id` bigint(255) NOT NULL,
  `theater_id` bigint(255) NOT NULL,
  PRIMARY KEY (`movie_id`)
);