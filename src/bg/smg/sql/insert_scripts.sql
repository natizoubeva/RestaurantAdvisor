INSERT INTO `users` (`username`, `name`, `password`, `is_active`, `profile_pic`, `role`)
VALUES ('admin', 'John Smith', 'WzEsIDIsIDMsIDQsIDUsIDZd', 1, 'no_photo.jpg', 'OWNER');

INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`)
VALUES (1, 'Made in Home', 'ulitsa "Angel Kunchev" 30', 'MEDIUM', 'Made in Home.jpg');

INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`)
VALUES (1, 'Francoss Pizza', 'ulitsa "han Asparuh" 27', 'MEDIUM', 'Francoss Pizza.jpg');