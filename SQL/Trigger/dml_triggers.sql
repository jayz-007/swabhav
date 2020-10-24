
insert into log_update values("UPDATE",0);
insert into log_update values("INSERT",0);
insert into log_update values("DELETE",0);

create trigger after_insert
after insert
on studenttriggdemo
for each row 
update log_update set counter = counter+1 where operation = 'UPDATE'

create trigger after_update
after update
on studenttriggdemo
for each row 
update log_update set counter = counter+1 where operation = 'INSERT'

create trigger after_delete
after delete
on studenttriggdemo
for each row 
update log_update set counter = counter+1 where operation = 'DELETE'

insert into studenttriggdemo (name,marks) values ('inser'100) 
insert into studenttriggdemo (name,marks) values ('insert01',100) 
update studenttriggdemo set name = 'abc' where name = 'inser' 
delete from studenttriggdemo where name ='jay'

select * from log_update


