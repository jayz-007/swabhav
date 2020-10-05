DELIMITER //
CREATE PROCEDURE salaryIncrement() 
BEGIN
UPDATE emp SET sal= sal + (sal * 10 / 100) WHERE emp.DEPTNO=10;
END //
DELIMITERswabhav;

CALL salaryIncrement()

SELECT * FROM emp