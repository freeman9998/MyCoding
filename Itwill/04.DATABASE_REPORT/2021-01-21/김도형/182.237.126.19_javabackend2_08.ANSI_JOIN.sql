--8.15 ANSI JOIN
--oracle join
--ansi join
/*
1.부서테이블과 사원테이블에서 사번,사원명,부서코드,부서명을 검색하시오.
    (사원명 오름차순 정렬할 것)
*/
select empno, ename, emp.deptno, dname
from emp, dept
where emp.deptno = dept.deptno
order by ename;

select empno, ename, deptno, dname
from emp
natural join dept;
/*
2.부서테이블과 사원테이블에서 사번,사원명,급여,부서명을 검색하시오. 
    단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것.
*/
select empno, ename, sal, dname
from emp,dept
where emp.deptno=dept.deptno and sal>=2000
order by sal desc;

select empno, ename, sal, dname
from emp join dept on emp.deptno=dept.deptno and sal>=2000
order by sal desc;
/*
3.부서테이블과 사원테이블에서 사번,사원명,업무,급여,부서명을 검색하시오.
    단,업무가 MANAGER이며 급여가 2500이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.
*/
select empno, ename, job, sal, dname
from emp,dept
where emp.deptno=dept.deptno and job='MANAGER' and sal>=2500
order by empno;

select empno, ename, job, sal, dname
from emp join dept on dmp.deptno=dept.deptno and job='MANAGER' and sal>=2500
order by empno;
/*
4.사원테이블과 급여테이블에서 사번,사원명,급여,등급을 검색하시오.
    단,등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
*/
select empno,ename,sal,grade
from emp e, salgrade g
where (e.sal>=g.losal and e.sal<=g.hisal) and grade='4'
order by sal desc;

select empno, ename, sal, grade
from emp e join salgrade g on (e.sal>=g.losal and e.sal<=g.hisal) and grade='4'
order by sal desc;
/*
5.부서테이블,사원테이블,급여등급테이블에서 사번,사원명,부서명,급여,등급을 검색하시오.
    단,등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
*/
select empno, ename, dname, sal, grade
from emp e,dept d,salgrade g
where e.deptno=d.deptno and (e.sal>=g.losal and e.sal<=g.hisal)
order by grade desc;

select empno, ename, dname, sal,grade
from emp e join dept d on e.deptno=d.deptno
join salgrade g on e.sal >=g.losal and e.sal <=g.hisal
order by grade desc;
/*
6.사원테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.
*/
select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno;

select e.ename, m.ename
from emp e join emp m on e.mgr=m.empno;
/*
7.사원테이블에서 사원명,해당 사원의 관라자명,해당 사원의 관리자의 관리자명을 검색하시오.
*/
select e.ename, m.ename, d.ename
from emp e, emp m, emp d
where e.mgr=m.empno and m.mgr=d.empno;

select e.ename, m.ename, d.ename
from emp e join emp m on e.mgr=m.empno
join emp d on m.mgr=d.empno;

/*
8.7번 결과에서 사원이 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오.
*/
select e.ename, m.ename, d.ename
from emp e, emp m, emp d
where e.mgr=m.empno(+) and m.mgr=d.empno(+);

select e.ename, m.ename, d.ename
from emp e left outer join emp m on e.mgr=m.empno
left outer join emp d on m.mgr=d.empno;
