SELECT * FROM EMP;

1. 
SELECT DEPTNO,COUNT(*)
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(*) >=6;

2.
 SELECT  DEPTNO, 
        SUM(DECODE(JOB,'CLERK',SAL,0)) "CLERK",
        SUM(DECODE(JOB,'MANAGER',SAL,0)) "MANAGER",
        SUM(DECODE(JOB,'PRESIDENT',SAL,0)) "PRESIDENT",
        SUM(DECODE(JOB,'ANALYST',SAL,0)) "ANALYST" ,
        SUM(DECODE(JOB,'SALESMAN',SAL,0)) "SALESMAN"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

3.
SELECT TO_CHAR(HIREDATE,'YYYY') "년", TO_CHAR(HIREDATE,'MM') "월",SUM(SAL)
FROM EMP
GROUP BY TO_CHAR(HIREDATE,'YYYY'), TO_CHAR(HIREDATE,'MM')
ORDER BY "년";

4.
COMM 포함 
SELECT DEPTNO, SUM(SAL*12) "연봉"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

COMM 포함 X
SELECT DEPTNO, SUM(NVL2(COMM,(SAL+COMM)*12,SAL*12)) "연봉"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

5.
SELECT JOB, SUM(SAL)
FROM EMP
GROUP BY JOB
HAVING JOB != 'SALESMAN';





