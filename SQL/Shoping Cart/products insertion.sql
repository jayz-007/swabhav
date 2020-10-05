create table Product(
	id int not null,
	name varchar(256),
	price double,
	discount_percentage float,
	Primary Key(id)
);

insert into product values(1,'pen',7,1),(2,'pencil',5,2),(3,'book',50,5),(4,'eraser',3,0),(5,'Bag',200,10);