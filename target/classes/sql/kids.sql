USE `kids_creatives`;


DROP TABLE IF EXISTS `kids`;

CREATE TABLE `kids` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teachers_id` bigint(13) DEFAULT NULL,
  `kid_name` varchar(45) DEFAULT NULL,
  `kid_surname` varchar(45) DEFAULT NULL,
  `kid_address` varchar(45) DEFAULT NULL,
  `kid_id_number` bigint(13) DEFAULT NULL,
  `kid_parent_id` bigint(13) DEFAULT NULL,
  `kid_gender` varchar(8) DEFAULT NULL,
  `kid_org_name` varchar(45) DEFAULT NULL,
  `kid_grade` varchar(45) DEFAULT NULL,
  `kid_registered` varchar(45) DEFAULT NULL,
  `kid_profile_pic` varchar(45) DEFAULT NULL,
  `allergies` varchar(45) DEFAULT NULL,
  `diet_requirements` varchar(45) DEFAULT NULL,
  `doctors_recomendations` varchar(45) DEFAULT NULL,
  `kid_height` int(4) DEFAULT NULL,
  `kid_weight` int(4) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

