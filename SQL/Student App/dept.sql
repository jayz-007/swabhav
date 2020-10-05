create table department(
id int,
name varchar(100),
clg_id int,
primary key(id)
foreign key(clg_id) references college(id)
);


insert into department values(1,'CMPN',1),(2,'ETRX',2),(3,'CMPN',2),(4,'ETRX',2),(5,'CMPN',3),(6,'ETRX',3),(7,'ETRX',4),(8,'CMPN',5);