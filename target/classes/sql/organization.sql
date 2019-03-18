USE `kids_creatives`;



DROP TABLE IF EXISTS `organization`;

CREATE TABLE `organization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `org_name` varchar(45) DEFAULT NULL,
  `org_address` varchar(45) DEFAULT NULL,
  `org_city` varchar(45) DEFAULT NULL,
  `org_province` varchar(45) DEFAULT NULL,
  `org_email` varchar(45) DEFAULT NULL,
  `org_phone_no` bigint(10) DEFAULT NULL,
  `org_password` varchar(45) DEFAULT NULL,
  `admin_key` int(45) DEFAULT NULL,
  `org_reg_number` int(45) DEFAULT NULL,
  `org_postal_code` int(8) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

