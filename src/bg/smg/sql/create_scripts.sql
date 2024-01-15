create database restaurant_advisor;

create table users (
id int not null primary key auto_increment,
username varchar(32),
name varchar(100),
password varchar(32),
created timestamp default current_timestamp,
is_active boolean,
profile_pic varchar(255),
role ENUM('OWNER', 'USER') not null default 'USER'
);

create table restaurants (
id int not null primary key auto_increment,
owner_id int,
name varchar(100),
address varchar(100),
number_reviews int default 0,
rating decimal(2, 1) default 0,
price_point ENUM('LOW', 'MEDIUM', 'HIGH'),
image varchar(255),
foreign key (owner_id) REFERENCES users(id) on delete cascade
);

create table reviews (
id int not null primary key auto_increment,
user_id int,
restaurant_id int,
description varchar(1000),
stars int,
foreign key (user_id) references users(id) on delete cascade,
foreign key (restaurant_id) references restaurants(id) on delete cascade
);

