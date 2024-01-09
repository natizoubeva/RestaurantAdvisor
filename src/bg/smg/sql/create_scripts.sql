create database restaurant_advisor;

create table users (
id int not null primary key auto_increment,
username varchar(32),
name varchar(100),
password varchar(32),
created timestamp,
is_active boolean
);

