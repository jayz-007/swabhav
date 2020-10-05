create table professor(
id  int not null,
name varchar(100),
dpt_id int,
primary key(id),
foreign key(dpt_id) references department(id) 
);

insert into professor values(1,'sergio',1),(2,'Gresha',3),(3,'sergio',2),(4,'richard',4),(5,'Sunita',5),(6,'Rupali',6);