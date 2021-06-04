--1. 사원 테이블에서 BLAKE보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>(SELECT SAL FROM EMP WHERE ENAME='BLAKE') ORDER BY SAL DESC; 

-- 2. 사원 테이블에서 MILLER보다 늦게 입사한 사원의 사번, 이름, 입사일을 검색하시오.
SELECT EMPNO, ENAME, HIREDATE FROM EMP WHERE HIREDATE>(SELECT HIREDATE FROM EMP WHERE ENAME='MILLER'); 

-- 3. 사원 테이블에서 사원 전체 평균 급여보다 급여가 많은 사원들의 사번, 이름, 급여를 검색하시오.
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>(SELECT AVG(SAL) FROM EMP) ORDER BY SAL DESC; 

-- 4. 사원 테이블에서 CLARK와 같은 부서이며, 사번이 7698인 직원의 급여보다 많은 급여를 받는 
--사원들의 사번, 이름, 급여를 검색하시오.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='CLARK') 
AND SAL>(SELECT SAL FROM EMP WHERE EMPNO=7698); 

--5. 사원 테이블에서 각 부서별 최대급여를 받는 사번, 이름, 부서코드, 급여를 출력하세요.
 SELECT EMPNO,ENAME,DEPTNO,SAL FROM EMP WHERE SAL IN (select MAX(sal)from EMP GROUP BY DEPTNO);