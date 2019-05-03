USE `kids_creatives`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `address`;



CREATE TABLE `address` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `street_number` varchar(45) DEFAULT NULL,
  `suburb` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `area_code` int(45) DEFAULT NULL,
  
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

