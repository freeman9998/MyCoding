/* 1번 답 */
select deptno 
from emp
group by deptno
HAVING count(*) >= 6; 
/* 2번 답 */
select deptno,
        sum(decode(job,'CLERK',sal,0)) as"CLERK",
        sum(decode(job,'MANAGER',SAL,0)) as "MANAGER",
        sum(decode(job,'PRESIDENT',SAL,0)) as "PRESIDENT",
        sum(decode(job,'ANALYST',SAL,0)) as  "ANALYST",
        sum(decode(job,'SALESMAN',SAL,0)) as "SALESMAN" 
from emp
group by deptno
order by deptno;
/* 3번 답 */
select to_char(hiredate, 'YYYY') as "년", to_char(hiredate, 'MM') as "월", sum(SAL)
from emp
group by to_char(hiredate, 'YYYY'), to_char(hiredate, 'MM')
order by 1,2;
/* 4번 답 */
/*comm포함하지않는*/
select deptno, sum(sal*12) "연봉"
from emp
group by deptno
order by deptno;
/*comm포함하는*/
select deptno,sum(NVL2(COMM,(SAL+COMM)*12, SAL*12)) "연봉"
FROM emp
group by deptno
order by deptno;
/* 5번 답 */
select job, sum(sal)
from emp
group by job
having job != 'SALESMAN';
