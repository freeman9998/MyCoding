--1-orcle
select e.empno "사번",e.ename "사원명", d.deptno "부서코드", d.dname "부서명"
from emp e ,dept d
where e.deptno=d.deptno
order by 2;

--1-SQl1999 [ANSI JOIN]
select e.empno "사번" ,e.ename "사원명", d.deptno "부서코드", d.dname "부서명"
from emp e join dept d on e.deptno =d.deptno
order by 2;

--2-orcle
select e.deptno "사번", e.ename "사원명", e.sal "급여", d.dname "부서명"
from emp e, dept d
where e.deptno = d.deptno and e.sal>=2000
order by e.sal desc;

--2-SQl1999 [ANSI JOIN]
select e.deptno "사번", e.ename "사원명", e.sal "급여", d.dname "부서명"
from emp e join dept d 
on e.deptno = d.deptno and e.sal>=2000
order by e.sal desc;

--3-orcle
select e.empno "사번",e.ename "사원명", e.job "업무", e.sal "급여", d.dname "부서명"
from emp e, dept d
where e.deptno =d.deptno and e.sal>=2500 and e.job='MANAGER'
order by e.empno asc;

--3-SQl1999 [ANSI JOIN]
select e.empno "사번", e.ename "사원명", e.job "업무", e.sal "급여", d.dname "부서명"
from emp e join dept d on e.deptno =d.deptno and e.sal>=2500 and e.job='MANAGER'
order by e.empno asc;

--4-orcle
select e.empno "사번", e.ename "사원명", e.sal "급여", g.grade "등급"
from emp e, salgrade g
where e.sal >= g.losal and e.sal <= g.hisal and g.grade = 4
order by e.sal desc;

--4-SQl1999 [ANSI JOIN]
select e.empno "사번", e.ename "사원명", e.sal "급여", g.grade "등급"
from emp e join salgrade g
on e.sal >= g.losal and e.sal <= g.hisal and g.grade = 4
order by e.sal desc;

--5-orcle
select e.empno "사번", e.ename "사원명", d.dname "부서명", e.sal "급여", g.grade "등급"
from emp e, dept d, salgrade g
where e.deptno=d.deptno and e.sal>=g.losal and e.sal<=g.hisal
order by g.grade desc;

--5-SQl1999 [ANSI JOIN]
select e.empno "사번", e.ename "사원명", d.dname "부서명", e.sal "급여", g.grade "등급"
from emp e
join dept d on e.deptno=d.deptno
join salgrade g on e.sal>=g.losal and e.sal<=g.hisal
order by g.grade desc;

--6-orcle
select e.empno "사원번호", e.ename "사원이름",
       m.empno "매니저사번", m.ename "매니저이름"
from emp e, emp m
where e.mgr =m.empno;

--6-SQl1999 [ANSI JOIN]
select e.empno "사원번호", e.ename "사원이름",
       m.empno "매니저사번", m.ename "매니저이름"
from emp e
join emp m on e.mgr =m.empno;

--7-orcle
select e.empno "사원번호", e.ename "사원이름", 
       m1.empno "매니저사번", m1.ename "매니저이름",
       m2.empno "관리자사번", m2.ename "관리자이름"
from emp e, emp m1, emp m2
where e.mgr= m1.empno and m1.mgr=m2.empno;

--7-SQl1999 [ANSI JOIN]
select e.empno "사원번호", e.ename "사원이름",
       m1.empno "매니저사번", m1.ename "매니저이름",
       m2.empno "관리자사번", m2.ename "관리자이름"
from emp e
join emp m1 on e.mgr = m1.empno
join emp m2 on m1.mgr = m2.empno;

--8-orcle
select e.empno "사원번호", e.ename "사원이름", 
       m1.empno "매니저사번", m1.ename "매니저이름",
       m2.empno "관리자사번", m2.ename "관리자이름"
from emp e, emp m1, emp m2
where e.mgr= m1.empno(+) and m1.mgr=m2.empno(+);

--8-SQl1999 [ANSI JOIN]
select e.empno "사원번호" ,e.ename "사원이름",
       m1.empno "매니저사번",m1.ename "매니저이름",
       m2.empno "관리자사번",m2.ename "관리자이름"
from emp e
left outer join emp m1 on e.mgr = m1.empno
left outer join emp m2 on m1.mgr = m2.empno;



