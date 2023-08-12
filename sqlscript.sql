show databases;
create database mydb2;
create table studentinfor (rollno int NOT NULL AUTO_INCREMENT, name varchar(20) NOT NULL, email varchar(20) NOT NULL,
PRIMARY KEY(rollno));
show tables;
desc studentinfor;

insert into studentinfor values (11, "Shubham", "shubham@gmail.com");
insert into studentinfor values (12, "Marquees", "marquees@gmail.com");
insert into studentinfor values (13, "Rick", "rick@gmail.com");
insert into studentinfor values (14, "Tim", "tim@gmail.com");
commit;

select * from studentinfor;
use mydb2;