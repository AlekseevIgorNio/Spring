insert into authors (firstName, lastName, patronymic, photo) values ('Емельянова', 'Софья', 'Артемьевна','http://placekitten.com/g/620/820');
insert into authors (firstName, lastName, patronymic, photo) values ('Исаева', 'Вероника', 'Глебовна','http://placekitten.com/g/610/810');
insert into authors (firstName, lastName, patronymic, photo) values ('Лосев', 'Фёдор', 'Алексеевич','http://placekitten.com/g/605/805');
insert into authors (firstName, lastName, patronymic, photo) values ('Высоцкая', 'Полина', 'Артуровна','http://placekitten.com/g/615/815');
insert into authors (firstName, lastName, patronymic, photo) values ('Матвеев', 'Александр', 'Эмильевич','http://placekitten.com/g/630/830');

insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (1, '₽866', '₽606', 'Друзья из прошлого', '2011-02-04', 1, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (2, '₽729', '₽510', 'Время гнева',  '2008-08-15', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (3, '₽1107', '₽775', 'Космический сон',  '2021-06-08', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (4, '₽863', '₽604', 'Идеальная пара',  '2019-09-25', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (5, '₽1104', '₽773', 'Клятва смерти', '2004-01-08', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (6, '₽204', '₽143', 'Космический парк',  '2019-11-07', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (7, '₽1179', '₽825', 'Небо в ладонях',  '2007-08-24', 1, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (8, '₽368', '₽258', 'Сообщество переводчиков',  '2008-12-04', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (9, '₽580', '₽406', 'Любопытство бога мудрости',  '2008-03-23', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (10, '₽497', '₽348', 'Потерянный',  '2011-08-06', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (11, '₽876', '₽613', 'Мы ещё встретимся',  '2017-12-16', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (12, '₽1083', '₽758', 'Путь к славе',  '2015-07-07', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (13, '₽295', '₽207', 'По ту сторону',  '2021-03-10', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (14, '₽420', '₽294', 'Звенья одной цепи',  '2017-10-29', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (15, '₽443', '₽310', 'Хамелеон', '2005-08-27', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (16, '₽283', '₽198', 'Мой сосед',  '2013-06-13', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (17, '₽1053', '₽737', 'Смешанные чувства',  '2001-08-09', 0, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (18, '₽120', '₽84', 'Глубокий вздох',  '2019-01-30', 1, 'https://source.unsplash.com/random/400x400/?img=1');
insert into books (id, price, price_old, title, pub_date, is_bestseller, image) values (19, '₽723', '₽506', 'Войнушка в коридоре',  '2008-08-30', 0, 'https://source.unsplash.com/random/400x400/?img=1');


insert into book2author (book_id, author_id, sort_index) values (1,1,0);
insert into book2author (book_id, author_id, sort_index) values (1,3,1);
insert into book2author (book_id, author_id, sort_index) values (1,5,2);
insert into book2author (book_id, author_id, sort_index) values (2,2,0);
insert into book2author (book_id, author_id, sort_index) values (3,4,0);
insert into book2author (book_id, author_id, sort_index) values (3,1,1);
insert into book2author (book_id, author_id, sort_index) values (4,1,0);
insert into book2author (book_id, author_id, sort_index) values (4,2,1);
insert into book2author (book_id, author_id, sort_index) values (4,3,2);
insert into book2author (book_id, author_id, sort_index) values (4,4,3);
insert into book2author (book_id, author_id, sort_index) values (4,5,4);
insert into book2author (book_id, author_id, sort_index) values (5,3,0);
insert into book2author (book_id, author_id, sort_index) values (6,4,0);
insert into book2author (book_id, author_id, sort_index) values (6,1,0);
insert into book2author (book_id, author_id, sort_index) values (7,5,0);
insert into book2author (book_id, author_id, sort_index) values (8,1,0);
insert into book2author (book_id, author_id, sort_index) values (9,2,0);
insert into book2author (book_id, author_id, sort_index) values (10,3,0);
insert into book2author (book_id, author_id, sort_index) values (11,3,0);
insert into book2author (book_id, author_id, sort_index) values (12,2,0);
insert into book2author (book_id, author_id, sort_index) values (12,1,1);
insert into book2author (book_id, author_id, sort_index) values (12,3,2);
insert into book2author (book_id, author_id, sort_index) values (13,4,0);
insert into book2author (book_id, author_id, sort_index) values (14,4,0);
insert into book2author (book_id, author_id, sort_index) values (14,5,1);
insert into book2author (book_id, author_id, sort_index) values (15,3,0);
insert into book2author (book_id, author_id, sort_index) values (16,2,0);
insert into book2author (book_id, author_id, sort_index) values (16,3,1);
insert into book2author (book_id, author_id, sort_index) values (17,1,0);
insert into book2author (book_id, author_id, sort_index) values (17,4,1);
insert into book2author (book_id, author_id, sort_index) values (18,5,0);
insert into book2author (book_id, author_id, sort_index) values (18,1,1);
insert into book2author (book_id, author_id, sort_index) values (18,3,2);
insert into book2author (book_id, author_id, sort_index) values (19,3,0);


insert into genre (parent_id, lvl,  slug, name) values (null,0,'Лёгкое чтение','Лёгкое чтение');
insert into genre (parent_id, lvl,  slug, name) values (null,0,'Серьёзное чтение','Серьёзное чтение');
insert into genre (parent_id, lvl,  slug, name) values (null,0,'Деловая литература','Деловая литература');
insert into genre (parent_id, lvl,  slug, name) values (null,0,'Драматургия','Драматургия');
insert into genre (parent_id, lvl,  slug, name) values (1,1,'Фантастика','Фантастика');
insert into genre (parent_id, lvl,  slug, name) values (1,1,'Детективы','Детективы');
insert into genre (parent_id, lvl,  slug, name) values (6,2,'Триллер','Триллер');
insert into genre (parent_id, lvl,  slug, name) values (2,1,'Биографии','Биографии');
insert into genre (parent_id, lvl,  slug, name) values (3,1,'Управление экономикой','Управление экономикой');
insert into genre (parent_id, lvl,  slug, name) values (4,1,'Античная драма','Античная драма');
insert into genre (parent_id, lvl,  slug, name) values (7,3,'Терминатор','Терминатор');
