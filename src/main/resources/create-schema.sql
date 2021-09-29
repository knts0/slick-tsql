create table users (
  `id`   int unsigned not null AUTO_INCREMENT,
  `name` varchar(255) not null,
  `age`  int unsigned not null,
  primary key (`id`)
);

insert into users values(1, '山田太郎', 25);
insert into users values(2, '田中花子', 31);
