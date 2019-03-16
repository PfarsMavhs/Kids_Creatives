USE `kids_creatives`;

DROP TABLE IF EXISTS `parents`;

CREATE TABLE `parents` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_name` varchar(45) DEFAULT NULL,
  `parent_surname` varchar(45) DEFAULT NULL,
  `parent_id_number` bigint(13) DEFAULT NULL,
  `parent_address` varchar(45) DEFAULT NULL,
  `parent_province` varchar(45) DEFAULT NULL,
  `parent_city` varchar(45) DEFAULT NULL,
  `parent_contact` bigint(10) DEFAULT NULL,
  `parent_gender` varchar(8) DEFAULT NULL,
  `is_verified` varchar(8) DEFAULT NULL,
  `parent_profile_pic` varchar(45) DEFAULT NULL,
  `parent_org_id` int(10) DEFAULT NULL,
   
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

