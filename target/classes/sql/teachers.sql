USE `kids_creatives`;



DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(45) DEFAULT NULL,
  `teacher_surname` varchar(45) DEFAULT NULL,
  `teacher_contact` bigint(10) DEFAULT NULL,
  `teacher_classroom` varchar(45) DEFAULT NULL,
  `teacher_id_number` bigint(13) DEFAULT NULL,
  `teacher_gender` varchar(8) DEFAULT NULL,
  `teacher_email` varchar(45) DEFAULT NULL,
  `teacher_password` varchar(8) DEFAULT NULL,
  `teacher_role` varchar(8) DEFAULT NULL,
  `is_verified` varchar(45) DEFAULT NULL,
  `org_Name` varchar(45) DEFAULT NULL,
  `teacher_address` varchar(45) DEFAULT NULL,
  `teacher_province` varchar(8) DEFAULT NULL,
  `teacher_city` varchar(45) DEFAULT NULL,
  `teacher_profile_pic` varchar(45) DEFAULT NULL,
  `teacher_org_id` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

