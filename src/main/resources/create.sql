create table if not exists book_category (
   id          int          not null auto_increment,
   name        varchar(50)  not null
   primary key (id)
);

create table if not exists book (
   id          int          not null auto_increment,
   name        varchar(50)  not null,
   book_category_id   int   not null
   primary key (id),
   FOREIGN KEY (book_category_id) REFERENCES book_category(id)
);