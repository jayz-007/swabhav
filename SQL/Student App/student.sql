create table student_clg(
	id int,
	name varchar(100),
	prof_id int,
	primary key(id),
	foreign key(prof_id) references professor(id)
);

insert into student_clg values(1,'pawan',1),(2,'amit',1),(4,'karan',2),(3,'tanishq',3),(5,'anirudh',4),(6,'vidya',5),(7,'richa',6),(8,'vinita',6);