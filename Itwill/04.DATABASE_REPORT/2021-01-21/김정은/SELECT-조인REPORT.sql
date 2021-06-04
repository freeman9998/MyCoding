/*
1.부서 테이블과 사원테이블에서 사번,사원명,부서코드,부서명을 검색하시오.
 (사원명 오름차순 정렬할 것)
 */
 --ORACLE 조인
select e.empno,e.ename,e.deptno,d.dname 
from emp e,dept d
where e.deptno=d.deptno
order by 2;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.empno,e.ename,e.deptno,d.dname  
from emp e inner join dept d
on e.deptno = d.deptno
order by 2;

/*
 2. 부서 테이블과 사원테이블에서 사번, 사원명, 급여, 부서명을 검색하시오.
   단, 급여가 2000이상인 상원에 대하여 급여기준으로 내림차순 정렬할 것.
*/  
--ORACLE 조인
select e.empno,e.ename,e.sal,d.dname 
from emp e,dept d
where e.deptno=d.deptno and e.sal>=2000
order by 3 desc;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.empno,e.ename,e.sal,d.dname  
from emp e inner join dept d
on e.deptno=d.deptno and e.sal>=2000
order by 3 desc;

/*
3. 부서 테이블과 사원 테이블에서 사번, 사원명, 업무, 급여, 부서명을 검색하시오.
   단, 업무가 MANAGER이며 급여가2500이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.
*/
--ORACLE 조인
select e.empno,e.ename,e.job,e.sal,d.dname 
from emp e,dept d
where e.deptno=d.deptno and job='MANAGER' and sal>=2500
order by 1;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.empno,e.ename,e.job,e.sal,d.dname
from emp e inner join dept d
on e.deptno=d.deptno and job='MANAGER' and sal>=2500
order by 1;

/*
4.사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 
  단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
*/
--ORACLE 조인
select e.empno,e.ename,e.sal,g.grade 
from emp e,salgrade g
where e.sal>=g.losal and e.sal<=g.hisal and g.grade =4
order by 3 desc;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.empno,e.ename,e.sal,g.grade 
from emp e inner join salgrade g
on  e.sal>=g.losal and e.sal<=g.hisal and g.grade =4
order by 3 desc;

/*
5.부서 테이블,사원 테이블,급여등급 테이블에서 사번, 사원명, 부서명, 급여, 등급을 검색하시오.
  단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 할 것.
*/
--ORACLE 조인
select e.empno,e.ename,d.dname,e.sal,g.grade 
from emp e,dept d,salgrade g
where e.sal>=g.losal and e.sal<=g.hisal and e.deptno=d.deptno
order by 5 desc;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.empno,e.ename,d.dname,e.sal,g.grade
from emp e 
join dept d on e.deptno=d.deptno
join salgrade g on  e.sal>=g.losal and e.sal<=g.hisal
order by 5 desc;

--6. 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.
--ORACLE 조인
select e.ename,m.ename 
from emp e,emp m
where e.mgr=m.empno;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.ename,m.ename
from emp e join emp m
on e.mgr = m.empno;

--7.사원테이블에서 사원명, 해당사원의 관리자명, 해당사원의 관리자의 관리자명을 검색하시오.
--ORACLE 조인
select e.ename, m.ename, p.ename 
from emp e,emp m,emp p
where e.mgr=m.empno and m.mgr=p.empno;

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.ename, m.ename, p.ename 
from emp e 
join emp m on e.mgr=m.empno
join emp p on m.mgr=p.empno;

--8. 7번결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오.
--ORACLE 조인
select e.ename, m.ename, p.ename
from emp e,emp m,emp p
where e.mgr=m.empno and m.mgr=p.empno(+);  

--SQL1999(SQL3) 조인[ANSI조인,표준조인]
select e.ename, m.ename, p.ename 
from emp e
join emp m on e.mgr=m.empno
left outer join emp p on m.mgr=p.empno;
 
 
 
 
 
 
 
 
 
 
 
 
 