--1번 문제 부서 테이블과 사원 테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오.
--(사원명 오름차순 정렬할 것)
--orcle
SELECT e.empno,e.ename,d.deptno,d.dname from emp e,dept d where e.deptno=d.deptno ORDER BY e.ename;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.empno,e.ename,d.deptno,d.dname from emp e join dept d on e.deptno=d.deptno ORDER BY e.ename;

--2번 문제 부서 테이블과 사원 테이블에서 사번,사원명,급여,부서명을 검색하시오. 
--단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것.
--orcle
SELECT e.empno,e.ename,e.sal,d.dname from emp e,dept d 
where e.deptno=d.deptno AND SAL >=2000 ORDER BY e.sal desc;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.empno,e.ename,e.sal,d.dname from emp e join dept d 
on e.deptno=d.deptno AND SAL >=2000 ORDER BY e.sal desc;

--3번 문제 부서 테이블과 사원 테이블에서 사번,사원명,업무,급여,부서명을 검색하시오.
--단 업무가 MANAGER이며 급여가 2500 이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.
--orcle
SELECT e.empno,e.ename,e.job,e.sal,d.dname from emp e,dept d 
where e.deptno=d.deptno AND e.JOB='MANAGER' AND e.SAL>=2500 ORDER BY e.sal;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.empno,e.ename,e.job,e.sal,d.dname from emp e join dept d 
on e.deptno=d.deptno AND e.JOB='MANAGER' AND e.SAL>=2500 ORDER BY e.sal;

--4번 문제 사원 테이블과 등급 테이블에서 사번,사원명,급여,등급을 검색하시오.
--단 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순 정렬할 것
--orcle
SELECT e.empno,e.ename,e.sal,s.grade FROM EMP e,salgrade s
WHERE e.sal>=s.losal AND e.sal <= s.hisal AND s.grade=4 
ORDER BY e.sal desc;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.empno,e.ename,e.sal,s.grade FROM EMP e join salgrade s
on e.sal>=s.losal AND e.sal <= s.hisal AND s.grade=4 
ORDER BY e.sal desc;

--5번 문제 부서 테이블과 사원 테이블,급여등급 테이블에서 사번,사원명,부서명,급여,등급을 검색하시오.
--단 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것
--orcle
SELECT e.empno,e.ename,d.dname,e.sal,s.grade FROM EMP e,dept d,salgrade s
WHERE e.sal>=s.losal AND e.sal <= s.hisal AND e.deptno=d.deptno
ORDER BY s.grade desc;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.empno,e.ename,d.dname,e.sal,s.grade FROM EMP e 
join dept d on e.deptno=d.deptno
join salgrade s on e.sal>=s.losal AND e.sal <= s.hisal
ORDER BY s.grade desc;

--6번 문제 사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.
--orcle
SELECT e.ename 사원명,m.ename 관리자명 FROM EMP e,EMP m WHERE e.mgr=m.empno;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.ename 사원명,m.ename 관리자명 FROM EMP e join EMP m on e.mgr=m.empno;

--7번 문제 사원 테이블에서 사원명과 해당 사원의 관리자명,사원의 관리자의 관리자의 명을을 검색하시오.
--orcle
SELECT e.ename 사원명,m.ename 관리자명,k.ename 관리자의관리자 FROM EMP e,EMP m,EMP k WHERE e.mgr=m.empno AND m.mgr=k.empno;
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.ename 사원명,m.ename 관리자명,k.ename 관리자의관리자 
FROM EMP e
join EMP m on e.mgr=m.empno
join EMP k on m.mgr=k.empno;

--8번 문제 7번 결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오
--orcle
SELECT e.ename 사원명,m.ename 관리자명,k.ename 관리자의관리자 FROM EMP e,EMP m,EMP k WHERE e.mgr=m.empno(+) AND m.mgr=k.empno(+);
--SQL1999(SQL3) 조인[ANSI조인,표준조인]
SELECT e.ename 사원명,m.ename 관리자명,k.ename 관리자의관리자 
FROM EMP e
left outer join EMP m on e.mgr=m.empno
left outer join EMP k on m.mgr=k.empno;