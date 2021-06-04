--1. 부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오.( 사원명 오름차순 정렬할 것 )
select e.empno, e.ename, d.deptno, d.dname 
from emp e, dept d
where e.deptno = d.deptno
order by 2 asc;


select empno, ename, deptno, dname 
from emp
natural inner join dept 
order by 2 asc;

--2. 부서 테이블과 사원테이블에서 사번, 사원명 , 급여 , 부서명을 검색하시오. 
--단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것.
select e.empno, e.ename, e.sal, d.dname 
from emp e, dept d
where e.sal >= 2000 and e.deptno = d.deptno
order by 3 desc;

select e.empno, e.ename, e.sal, d.dname 
from emp e 
inner join dept d 
on e.sal >= 2000 and e.deptno = d.deptno
order by 3 desc;



--3. 부서 테이블과 사원 테이블에서 사번, 사원명, 업무, 급여 , 부서명을 검색하시오. 
--단, 엄무가 Manager이며 급여가 2500 이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.

select e.empno, e.ename, e.job, e.sal, d.dname 
from emp e, dept d
where e.sal >= 2500 and e.deptno = d.deptno and e.job = 'MANAGER'
order by 1 Asc;

select e.empno, e.ename, e.job, e.sal, d.dname 
from emp e 
inner join dept d 
on e.sal >= 2500 and e.deptno = d.deptno and e.job = 'MANAGER'
order by 3 desc;


--4. 사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 
--단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.

select e.empno, e.ename, e.sal, g.grade
from emp e
inner join salgrade g
on e.sal >= g.losal and e.sal <= g.hisal
order by 3 desc;


select e.empno, e.ename, e.sal, g.grade
from emp e, salgrade g
where e.sal >= g.losal and e.sal <= g.hisal
order by 3 desc;


--5. 부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오.
--단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.


select e.empno, e.ename, d.dname, e.sal, g.grade
from emp e, dept d, salgrade g
where e.sal >= g.losal and e.sal <= g.hisal and e.deptno = d.deptno
order by 5 desc;

select e.empno, e.ename, d.dname, e.sal, g.grade
from emp e
inner join salgrade g
on e.sal >= g.losal and e.sal <= g.hisal
inner join dept d
on e.deptno = d.deptno
order by 5 desc;


--6. 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.

select e.ename, m.ename
from emp e, emp m
where e.mgr = m.empno;


select e.ename, m.ename
from emp e
inner join emp m
on e.mgr = m.empno;


--7. 사원 테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색하시오

select e.ename 사원, m1.ename 매니저, m2.ename 매니저의매니저
from emp e, emp m1,emp m2
where e.mgr = m1.empno and m1.mgr = m2.empno;

select e.ename 사원, m1.ename 매니저, m2.ename "매니저의매니저"
from emp e 
inner join emp m1 
on e.mgr = m1.empno
join emp m2 on m1.mgr = m2.empno;


--8. 7번 결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오.

select e.ename 사원, m1.ename 매니저, m2.ename 매니저의매니저
from emp e, emp m1,emp m2
where e.mgr = m1.empno(+) and m1.mgr = m2.empno(+);

select e.ename 사원, m1.ename 매니저, m2.ename "매니저의매니저"
from emp e 
left outer join emp m1 
on e.mgr = m1.empno
left outer join emp m2 on m1.mgr = m2.empno;