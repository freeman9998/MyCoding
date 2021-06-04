-- 1. 사원 테이블에서 BLAKE보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
SELECT EMPNO,ENAME,SAL
FROM EMP
WHERE SAL>(SELECT SAL FROM EMP WHERE ENAME='BLAKE');

-- 2. 사원 테이블에서 MILLER보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오.
SELECT EMPNO,ENAME,HIREDATE
FROM EMP
WHERE HIREDATE>(SELECT HIREDATE FROM EMP WHERE ENAME='MILLER');

--3. 사원테이블에서 사원 전체 평균 급여보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP);

--4. 사원 테이블에서 CLARK와 같은 부서이며, 사번이 7689인 직원의 급여보다 많은 급여를 받는 사원들의 사번, 이름 , 급여를 검색하시오.

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME ='CLARK') AND SAL>(SELECT SAL FROM EMP WHERE EMPNO = 7698);

--5. 사원 테이블에서 부서별 최대 급여를 받는 사원들의 사번, 이름, 부서코드, 급여를 검색하시오.

SELECT EMPNO,ENAME,DEPTNO,SAL
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);
