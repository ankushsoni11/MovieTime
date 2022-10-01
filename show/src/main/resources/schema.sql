DROP TABLE IF EXISTS `show` CASCADE CONSTRAINTS;
CREATE TABLE `show` (
  `show_id` bigint NOT NULL,
  `show_time` varchar(255) NOT NULL,
  `show_date` date NOT NULL,
  `movie_id` bigint NOT NULL,
   PRIMARY KEY (`show_id`)
);