--1번문제
select deptno ,count(*) "부서별인원수"
from emp
group by deptno
having count(*)>=6;

--2번문제
select  deptno, 
        sum(decode(JOB,'CLERK',sal)) "CLERK",
        sum(decode(JOB,'MANAGER',sal)) "MANAGER",
        sum(decode(JOB,'PRESIDENT',sal)) "PRESIDENT",
        sum(decode(JOB,'ANALYST',sal)) "ANALYST" ,
        sum(decode(JOB,'SALESMAN',sal)) "SALESMAN";
from emp group by deptno
order by detpno;

--3번문제
select to_char(hiredate,'YYYY')"년",to_char(hiredate,'MM')"월",sum(sal)
from emp
group by to_char(hiredate,'YYYY'),to_char(hiredate,'MM')
order by 1,2;

--4번문제
--comm포함
select deptno,sum((sal+nvl(comm,0))*12)"연봉"
from emp
group by deptno
order by 1;
--comm포함x
select deptno,sum(sal*12)"연봉"
from emp
group by deptno
order by 1;

--5번문제
select  job,
        sum(sal) 
from emp
group by job
having job != 'SALESMAN'
order by job;





