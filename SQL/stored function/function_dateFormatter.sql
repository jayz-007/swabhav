DELIMITER //
CREATE PROCEDURE increment_salary()
BEGIN
update emp as emp01,  (select DEPTNO from emp  where ENAME= "Smith" ) as emp02 
set emp01.SAL = SAL * 110/100 where emp01.DEPTNO = emp02.DEPTNO;
END //

DELIMITER ;