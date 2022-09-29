DROP TABLE IF EXISTS `seat` CASCADE CONSTRAINTS;
CREATE TABLE `seat` (
  `seat_id` bigint NOT NULL,
  `seat_x` varchar(255) NOT NULL,
  `seat_y` varchar(255) NOT NULL,
  `show_id` bigint NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`seat_id`)
);