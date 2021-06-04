--1)
select e.empno, e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
order by e.ename asc;

--2)
select e.empno, e.ename, sal, d.dname
from emp e, dept d
where e.deptno = d.deptno and sal > = 2000
order by sal desc;

--3)
select e.empno, e.ename, e.job, e.sal, d.dname
from emp e, dept d
where e.deptno = d.deptno and sal > = 2500 and e.job = 'MANAGER'
order by e.empno asc;

--4)
SELECT e.EMPNO, e.ENAME, SAL, GRADE
FROM EMP e, SALGRADE g
WHERE GRADE = 4 and (sal>=g.losal and sal<=g.hisal);

--5)
SELECT e.EMPNO, e.ENAME, d.DNAME, SAL, s.GRADE 
FROM EMP e, DEPT d, SALGRADE s
WHERE e.sal>=s.losal and e.sal<=s.hisal
ORDER BY GRADE DESC;

--6)
SELECT E.ENAME "사원", M1.ENAME "매니저"
FROM EMP E, EMP M1
WHERE E.MGR = M1.EMPNO;

--7)
SELECT e.ENAME "사원", m1.ENAME "매니저", m2.ENAME "매니저의 매니저"
FROM EMP e, EMP m1, EMP m2
WHERE e.MGR = m1.EMPNO AND m1.MGR = m2.EMPNO;

--8)
SELECT E.ENAME "사원", M1.ENAME "매니저", M2.ENAME "매니저의 매니저"
FROM EMP E LEFT OUTER JOIN EMP M1
ON E.MGR = M1.EMPNO
JOIN EMP M2 ON M1.MGR = M2.EMPNO;
