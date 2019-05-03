USE `kids_creatives`;

DROP TABLE IF EXISTS `parents`;

CREATE TABLE `parents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_name` varchar(45) DEFAULT NULL,
  `parent_surname` varchar(45) DEFAULT NULL,
  `parent_id_number` bigint(13) DEFAULT NULL,
  `parent_email` varchar(45) DEFAULT NULL,
  `parent_province` varchar(45) DEFAULT NULL,
  `parent_contact` bigint(10) DEFAULT NULL,
  `parent_gender` varchar(8) DEFAULT NULL,
  `is_verified` int(1) DEFAULT NULL,
  `parent_profile_pic` varchar(45) DEFAULT NULL,
  `parent_org_id` int(10) DEFAULT NULL,
  `address_details_id` int(11) DEFAULT NULL,
   
  PRIMARY KEY (`id`),
  KEY `FK_ADDRESS_idk` (`address_details_id`),
  
  CONSTRAINT `FK_ADDRESS` FOREIGN KEY (`address_details_id`) 
  REFERENCES `address` (`user_id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
  
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;

