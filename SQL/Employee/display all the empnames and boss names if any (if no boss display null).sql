SELECT TABLE_ONE.ENAME ,TABLE_TWO.ENAME AS "BOSS NAME" 
FROM EMP TABLE_TWO,EMP TABLE_ONE
WHERE TABLE_TWO.EMPNO = TABLE_ONE.MGR