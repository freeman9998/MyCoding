--1. 사원테이블에서 부서별 인원수가 6명 이상인 부서코드 검색

select deptno, count(*)
from emp
group by deptno
having count(*) >= 6;

--2. 사원테이블로부터 부서번호, 업무별 급여합계를 계산하고자한다. 다음과 같은 결과를 출력할 수 있는 SQL문장 작성?

select deptno, 
    sum(decode(job, 'CLERK', sal,0)) "CLERK",
    sum(decode(job, 'MANAGER', sal,0)) "MANAGER",
    sum(decode(job, 'PRESIDENT', sal,0)) "PRESIDENT",
    sum(decode(job, 'ANALYST', sal,0)) "ANALYST",
    sum(decode(job, 'SALESMAN', sal,0)) "SALESMAN"
from emp
group by deptno
order by 1 ASC;


--3. 사원테이블로부터 년도별 , 월별 급여합계를 출력할 수 있는 SQL문장 작성?

select TO_CHAR(HIREDATE, 'YYYY') 년도, TO_CHAR(HIREDATE, 'MM') 월, sum(sal) 급여합계
from emp
group by TO_CHAR(HIREDATE, 'YYYY'), TO_CHAR(HIREDATE, 'MM')
order by 1 ASC;

--4. 사원테이블에서 부서별 comm(커미션) 을 포함하지 않은 연봉 의 합과 포함한 연봉의 합을 구하는 SQL을 작성하시오.

select deptno, sum(sal*12) 연봉
from emp
group by deptno
order by 1 ASC;

select deptno, sum(nvl2(comm, sal*12+comm, sal*12+0)) 연봉
from emp
group by deptno
order by 1 ASC;

--5. 사원테이블에서 SALESMAN을 제외한 JOB별 급여합계?

select job, sum(sal) 급여합계
from emp
group by job
having job != 'SALESMAN';