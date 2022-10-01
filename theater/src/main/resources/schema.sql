DROP TABLE IF EXISTS `theater` CASCADE CONSTRAINTS;
CREATE TABLE `theater` (
  `theater_id` bigint NOT NULL,
  `theater_name` varchar(255) NOT NULL,
  `theater_area` varchar(255) NOT NULL,
  `city_id` varchar(255) NOT NULL,
  PRIMARY KEY (`theater_id`)
  );