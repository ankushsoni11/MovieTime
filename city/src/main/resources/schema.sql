DROP TABLE IF EXISTS `city` CASCADE CONSTRAINTS;
CREATE TABLE `city` (
  `city_id` bigint NOT NULL,
  `city_name` varchar(255) NOT NULL,
  `city_pincode` varchar(255) NOT NULL,
  `city_state` varchar(255) NOT NULL,
  PRIMARY KEY (`city_id`)
);