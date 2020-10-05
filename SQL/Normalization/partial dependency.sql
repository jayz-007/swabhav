create table partial_dependency(
	student_id int not null,
	course_no int not null,
	name varchar(256),
	course_name varchar(256),
	Primary Key(student_id)
);

insert into partial_dependency values (1,1,'pawan','CMPN'),(2,1,'karan','CMPN'),(3,2,'abhishek','ETRX');