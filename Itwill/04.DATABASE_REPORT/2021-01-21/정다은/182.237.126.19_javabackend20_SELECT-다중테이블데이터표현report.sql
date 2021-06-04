/*
1.부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오.(사원명 오름차순 정렬할 것 )
*/
--ORACLE JOIN
select empno "사번", ename "사원명", e.deptno "부서코드", dname "부서명" 
from dept d, emp e
where e.deptno = d.deptno
order by ename asc;

--ANSI JOIN
select empno "사번", ename "사원명", e.deptno "부서코드", dname "부서명"
from dept d join emp e
on e.deptno = d.deptno
order by ename asc;

/*
2.부서 테이블과 사원테이블에서 사번, 사원명 , 급여 , 부서명을 검색하시오. 
단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것.
*/
--ORACLE JOIN
select empno "사번", ename "사원명", sal "급여", dname "부서명" 
from dept d, emp e
where e.sal >= 2000 and e.deptno = d.deptno
order by e.sal desc;

--ANSI JOIN
select empno "사번", ename "사원명", sal "급여", dname "부서명" 
from dept d join emp e
on e.sal >= 2000 and e.deptno = d.deptno
order by e.sal desc;

/*
3.부서 테이블과 사원 테이블에서 사번, 사원명, 업무, 급여 , 부서명을 검색하시오. 
단, 업무가 Manager이며 급여가 2500 이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.
*/
--ORACLE JOIN
select e.empno "사번", e.ename "사원명", e.job "업무", e.sal "급여", d.dname "부서명" 
from emp e, dept d
where e.job = 'MANAGER' and e.sal >= 2500 and e.deptno = d.deptno
order by e.empno asc;

--ANSI JOIN
select e.empno "사번", e.ename "사원명", e.job "업무", e.sal "급여", d.dname "부서명" 
from emp e join dept d
on e.job = 'MANAGER' and e.sal >= 2500 and e.deptno = d.deptno
order by e.empno asc;

/*
4.사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 단, 등급은 급여가
하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
*/
--ORACLE JOIN
select e.empno "사번", e.ename "사원명", e.sal "급여", g.grade "등급" 
from emp e, salgrade g
where (e.sal >= g.losal and e.sal <= g.hisal) and g.grade = 4
order by 3 desc;

--ANSI JOIN
select e.empno "사번", e.ename "사원명", e.sal "급여", g.grade "등급" 
from emp e join salgrade g
on (e.sal >= g.losal and e.sal <= g.hisal) and g.grade = 4
order by 3 desc;

/*
5.부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오. 
단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
*/
--ORACLE JOIN
select e.empno "사번", e.ename "사원명",d.dname "부서명", e.sal "급여", g.grade "등급"
from emp e, dept d, salgrade g
where (e.sal >= g.losal and e.sal <= g.hisal) and e.deptno = d.deptno
order by g.grade desc;

--ANSI JOIN
select e.empno "사번", e.ename "사원명",d.dname "부서명", e.sal "급여", g.grade "등급"
from emp e join dept d
on e.deptno = d.deptno
join salgrade g
on e.sal >= g.losal and e.sal <= g.hisal
order by g.grade desc;

/*
6.사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.
*/
--ORACLE JOIN
select e.ename "사원명", m.ename "관리자명"
from emp e, emp m
where e.mgr = m.empno;

--ANSI JOIN
select e.ename "사원명", m.ename "관리자명"
from emp e join emp m
on e.mgr = m.empno;

/*
7.사원 테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색하시오
*/
--ORACLE JOIN
select e.ename "사원명", m.ename "관리자명", m1.ename "관리자의 관리자명"
from emp e, emp m, emp m1
where e.mgr = m.empno and m.mgr = m1.empno;

--ANSI JOIN
select e.ename "사원명", m.ename "관리자명", m1.ename "관리자의 관리자명"
from emp e join emp m
on e.mgr = m.empno 
join emp m1
on m.mgr = m1.empno;

/*
8.7번 결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오.
*/
--ORACLE JOIN
select e.ename "사원명", m.ename "관리자명", m1.ename "관리자의 관리자명"
from emp e, emp m, emp m1
where e.mgr = m.empno(+) and m.mgr = m1.empno(+);

--ANSI JOIN
select e.ename "사원명", m.ename "관리자명", m1.ename "관리자의 관리자명"
from emp e left outer join emp m 
on e.mgr = m.empno
left outer join emp m1
on m.mgr = m1.empno;