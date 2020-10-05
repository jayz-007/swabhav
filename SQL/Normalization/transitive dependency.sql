create table transitive_dependency(
	auth_id int not null,
	book_name varchar(256),
	author_name varchar(256),
	nationality varchar(256),
	Primary Key(auth_id)
);

insert into transitive_dependency values (1,'harry potter 1','pawan','indian'),(2,'harray potter 2','karan','italian'),(3,'Harry potter 3','abhishek','French');