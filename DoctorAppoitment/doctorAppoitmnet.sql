create database appoitment;

create table doctors_appoitment
(
	user_id bigint(20) NOT NULL AUTO_INCREMENT,
	patient_name varchar(255),
    patient_age int(255),
    date_of_birth  timestamp NULL DEFAULT NULL,
    blood_group varchar(3),
    address varchar(255),
    mobile_number varchar(14),
    email_id varchar(255),
    dare_of_appoitmnet timestamp NULL DEFAULT NULL,
	patient_report varchar(255),
	PRIMARY KEY (`user_id`),
   UNIQUE KEY `email_id_UNIQUE` (`email_id`),
   UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
)


CREATE TABLE `vendor_user_details` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email_id` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `is_enabled` bit(1) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `create_ts` timestamp NULL DEFAULT NULL,
  `update_ts` timestamp NULL DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_id_UNIQUE` (`email_id`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=249 DEFAULT CHARSET=utf8mb4;
