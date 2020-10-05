create table  studentriggerdemo(id int not null,name varchar(20),address varchar(20),marks int);
insert into studentriggerdemo(id,name,address,marks) values (1,'abc','mumbai',200);
insert into studentriggerdemo(id,name,address,marks) values (2,'xyz','mumbai',200);
insert into studentriggerdemo(id,name,address,marks) values (3,'abc','mumbai',200);

create trigger sample_trigger
before insert
on studentriggerdemo
for each row set new.marks=new.marks+100;
insert into studentriggerdemo(id,name,address,marks) values (5,'abc','mumbai',200);
create table final_marks(total_marks int not null);

DROP TRIGGER  sample_trigger;
DROP TRIGGER  cal;

create trigger cal
after insert 
on studentriggerdemo
for each row 
insert into final_marks values(new.marks);

insert into  studentriggerdemo values (7,'cvd','mumbai',100);

select * from studentriggerdemo;
select * from final_marks;

