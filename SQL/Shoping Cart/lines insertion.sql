create table line(
	id int not null,
	quantity int,
	product_id int,
	order_id int,
	foreign key(order_id) references orders(id),
	foreign key(product_id) references product(id),
	Primary Key(id)
);
insert into line values(1,4,1,1),(2,24,2,1),(3,4,4,4),(4,44,1,4)(5,7,3,2),(6,15,5,3);