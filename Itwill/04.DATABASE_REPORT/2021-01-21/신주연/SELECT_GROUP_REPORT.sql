--1 
select deptno "부서코드" 
from emp
group by deptno
having count(*)>=6;

--2
select deptno,
       sum(decode(job,'CLERK',sal,0)) "CLERK",
       sum(decode(job,'MANAGER',sal,0)) "MANAGER",
       sum(decode(job,'PRESIDENT',sal,0)) "PRESIDENT",
       sum(decode(job,'ANALYST',sal,0)) "ANALYST",
       sum(decode(job,'SALESMAN',sal,0)) "SALESMAN"       
from emp
group by deptno
order by deptno;

--3
select to_char(hiredate,'yyyy') "년", to_char(hiredate,'mm') "월" ,sum(sal) 
from emp
group by to_char(hiredate,'yyyy'), to_char(hiredate,'mm')
order by 1,2;

--4-1 커미션을 포함하지 않은 연봉
select deptno, sum(sal*12) "연봉"
from emp
group by deptno
order by deptno;

--4-2 커미션을 포함한 연봉
select deptno, sum(nvl2(comm,sal*12+comm,sal*12+0)) "연봉"
from emp
group by deptno
order by deptno;

--5
select job,sum(sal)
from emp
group by job
having job != 'SALESMAN';
