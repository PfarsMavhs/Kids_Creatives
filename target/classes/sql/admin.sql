USE `kids_creatives`;



DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(45) DEFAULT NULL,
  `admin_surname` varchar(45) DEFAULT NULL,
  `admin_id_no` bigint(13) DEFAULT NULL,
  `admin_gender` varchar(45) DEFAULT NULL,
  `admin_contact` bigint(10) DEFAULT NULL,
  `admin_role` varchar(15) DEFAULT NULL,
  `admin_email` varchar(45) DEFAULT NULL,
  `admin_org_name` varchar(45) DEFAULT NULL,
  `admin_city` varchar(45) DEFAULT NULL,
  `admin_org_id` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

