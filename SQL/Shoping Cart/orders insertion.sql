create table Orders(
	id int not null,
	order_date date,
	customer_id int,
	Foreign key(customer_id) references customer(id),
	Primary Key(id)
);

insert into orders values (1,'2020-09-20',1),(2,'2020-09-24',2),(3,'2020-08-20',3),(4,'2020-09-15',6);