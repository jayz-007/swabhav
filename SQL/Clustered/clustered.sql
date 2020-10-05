CREATE TABLE clustered_student_info (  
  student_id int NOT NULL AUTO_INCREMENT,  
  name varchar(45) DEFAULT NULL,  
  age varchar(3) DEFAULT NULL, 
  PRIMARY KEY (student_id)  
  ) ;
  
  Insert into clustered_student_info values(1,'Pawan',22),(2,'Amit',20),(3,'Karan',23);