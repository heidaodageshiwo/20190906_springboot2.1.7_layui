/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.20-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `t_user` (
	`t_id` double ,
	`t_name` varchar (90),
	`t_age` double ,
	`t_address` varchar (300),
	`t_pwd` varchar (300)
); 
insert into `t_user` (`t_id`, `t_name`, `t_age`, `t_address`, `t_pwd`) values('5','1','22','1',NULL);
insert into `t_user` (`t_id`, `t_name`, `t_age`, `t_address`, `t_pwd`) values('6','admin','22','jinan','123');
insert into `t_user` (`t_id`, `t_name`, `t_age`, `t_address`, `t_pwd`) values('123','333','111',NULL,NULL);
