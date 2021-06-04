--1.사원테이블에서 부서별 인원수가 6명 이상인 부서코드 검색
select deptno,count(*) from emp GROUP by deptno Having count(*) >=6;

--2.사원테이블로부터 부서번호,업무별 급여합계를 계산하고자 한다. 다음과 같은 결과를 출력할 수 있는 SQL문장은?
select deptno,
sum(decode(job,'CLERK',sal)) CLERK, 
sum(decode(job,'MANAGER',sal)) MANAGER,
sum(decode(job,'PRESIDENT',sal)) PRESIDENT,
sum(decode(job,'ANALYST',sal)) ANALYST,
sum(decode(job,'SALESMAN',sal)) SALSEMAN
from emp group by deptno order by deptno;

--3.사원테이블로부터 년도별, 월별 ,급여합계를 출력할 수 있는 sql문장 작성
select TO_CHAR(hiredate,'YYYY') "년",
       TO_CHAR(hiredate,'MM') "월", 
       SUM(SAL) from emp GROUP BY TO_CHAR(hiredate,'YYYY'), hiredate, 'YYYY', TO_CHAR(hiredate,'MM') 
       ORDER by 년,월;
       
--4.사원테이블에서 부서별 comm을 포함하지 않은 연봉의 합과 포함한 연봉의 합을 구하시오.
select deptno,sum(sal*12) "연봉(미포함)",sum((sal+nvl(comm,0))*12) "연봉(포함)" from emp group by deptno;

--5.사원테이블에서 salseman을 제외한 job별 급여합은?
select job,sum(sal) from emp where job != 'SALESMAN' group by job;
