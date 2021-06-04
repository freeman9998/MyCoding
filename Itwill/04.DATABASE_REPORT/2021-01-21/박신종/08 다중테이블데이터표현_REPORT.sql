--1. 부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오. (사원명 오름차순)
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
ORDER BY E.ENAME ASC;

--2. 부서테이블과 사원테이블에서 사번, 사원명, 급여, 부셔명을 검색. 단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬
SELECT E.EMPNO, E.ENAME, E.SAL, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND SAL >= 2000
ORDER BY E.SAL DESC;

--3. 부서테이블과 사원테이블에서 사번, 사원명, 업무, 급여, 부서명을 검색. 단, 업무가 MANAGER이며 급여가 2500 이상인 사원에 대하여
-- 사번을 기준으로 오름차순 정렬
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND JOB = 'MANAGER' AND SAL >= 2500
ORDER BY E.EMPNO ASC;

--4. 사원테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색. 단, 등급은 급여가 하한값과 상한값 범위에 포함되고 등급이 4이며
-- 급여를 기준으로 내림차순 정렬
SELECT D.DEPTNO, D.DNAME, E.SAL, G.GRADE 
FROM DEPT D, EMP E, SALGRADE G
WHERE E.DEPTNO = D.DEPTNO AND (E.SAL >= G.LOSAL AND E.SAL <= G.HISAL) AND G.GRADE = 4
ORDER BY E.SAL DESC;

--5. 부서테이블, 사원테이블 급여등급 테이블에서 사번, 사원명, 부서명, 급여, 등급을 검색. 단, 등급은 급여가 하한값과 상한값 범위에
--포함되며 등급을 기준으로 내림차순 정렬
SELECT D.DEPTNO, D.DNAME, E.ENAME, E.SAL, G.GRADE 
FROM DEPT D, EMP E, SALGRADE G
WHERE E.DEPTNO = D.DEPTNO AND (E.SAL >= G.LOSAL AND E.SAL <= G.HISAL)
ORDER BY G.GRADE DESC;


