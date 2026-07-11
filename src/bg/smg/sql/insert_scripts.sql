INSERT INTO `users` (`username`, `name`, `password`, `is_active`, `profile_pic`, `role`)
VALUES ('john', 'John Smith', 'WzEsIDIsIDMsIDQsIDUsIDZd', 1, 'user1.jpg', 'OWNER');

INSERT INTO `users` (`username`, `name`, `password`, `is_active`, `profile_pic`, `role`)
VALUES ('maria', 'Maria Johnson', 'WzEsIDIsIDMsIDQsIDUsIDZd', 1, 'user2.jpg', 'OWNER');

INSERT INTO `users` (`username`, `name`, `password`, `is_active`, `profile_pic`, `role`)
VALUES ('julian', 'Julian Martin', 'WzEsIDIsIDMsIDQsIDUsIDZd', 1, 'no_photo.jpg', 'USER');

INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`)
VALUES (1, 'Made in Home', 'ulitsa "Angel Kunchev" 30', 'MEDIUM', 'Made in Home.jpg');

INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`)
VALUES (1, 'Francoss Pizza', 'ulitsa "han Asparuh" 27', 'MEDIUM', 'Francoss Pizza.jpg');

INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`)
VALUES (2, 'Made in Blue', 'ul. "Yuri Venelin" 6', 'HIGH', 'Made in Blue.jpg');

