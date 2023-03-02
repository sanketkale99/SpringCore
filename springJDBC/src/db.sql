-- spring jdbc project table  

create database springjdbc;
show databases;
use springjdbc;
create table student(
id int primary key,
name varchar(100) not null,
city varchar(100) not null
);
desc student;
show tables;
insert into student(id,name,city) values(101,'Sanket Kale', 'Pune');
select * from student;
