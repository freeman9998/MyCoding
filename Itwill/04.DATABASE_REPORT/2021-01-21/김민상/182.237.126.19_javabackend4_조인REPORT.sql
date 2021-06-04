--1번문제
select e.empno "사번",e.ename "사원명", e.deptno "부서코드", d.dname"부서명"
from emp e, dept d
where e.deptno = d.deptno
order by ename asc;

--2번문제
select e.empno "사번",e.ename "사원명", e.deptno "부서코드", d.dname"부서명"
from emp e, dept d
where e.deptno = d.deptno 
and sal >=2000
order by e.sal desc;

--3번문제
select e.empno "사번",e.ename "사원명",e.job "업무", e.sal "급여", d.dname"부서명"
from emp e, dept d
where e.deptno = d.deptno 
and e.job  = 'MANAGER'
and e.sal >= 2500
order by sal asc;

--4번문제
select e.empno "사번",e.ename "사원명", e.sal"급여", s.grade"등급"
from emp e, salgrade s
where e.sal>=s.losal
and e.sal<=s.hisal
and s.grade=4
order by e.sal desc;

--5번문제
select e.empno "사번",e.ename "사원명",d.deptno"부서명", e.sal"급여", s.grade"등급"
from emp e, salgrade s , dept d
where e.deptno = d.deptno 
and e.sal>=s.losal
and e.sal<=s.hisal
order by s.grade desc;

--6번문제
select e.ename "사원명",m.ename"관리자명" 
from emp e,emp m
where e.mgr=m.empno;

--7번문제
select  e.ename "사원이름",m1.ename "관리자명",m2.ename "관리자의 관리자명"
from emp e join emp m1 
on e.mgr=m1.empno
join emp m2 
on m1.mgr=m2.empno; 

--8번문제
select e.ename "사원명",m1.ename"관리자명",m2.ename "관리자의관리자명"
from emp e, emp m1, emp m2
where e.mgr=m1.empno(+)
and m1.mgr=m2.empno(+);






