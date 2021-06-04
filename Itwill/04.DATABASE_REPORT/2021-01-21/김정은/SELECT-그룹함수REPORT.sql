/*
1. 사원테이블에서 부서별 인원수가 6명 이상인 부서코드 검색?
*/
SELECT DEPTNO,COUNT(*) 
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(*) >= 6;
/*
2. 사원테이블로부터 부서번호, 업무별 급여합계를 계산하고자한다. 다음과 같은 결과를 
    출력할 수 있는 SQL문장 작성.
*/
SELECT DEPTNO,SUM(DECODE(JOB,'CLERK',SAL,0))"CLERK",
              SUM(DECODE(JOB,'MANAGER',SAL,0))"MANAGER",
              SUM(DECODE(JOB,'PRESIDENT',SAL,0))"PRESIDENT",
              SUM(DECODE(JOB,'ANALYST',SAL,0))"ANALYST",
              SUM(DECODE(JOB,'SALESMAN',SAL,0))"SALESMAN"
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
/*
3. 사원테이블로부터 년도별, 월별 급여합계를 출력할 수 있는 SQL문장 작성.
*/
SELECT TO_CHAR(HIREDATE,'YYYY') 년 ,TO_CHAR(HIREDATE,'MM') 월,SUM(SAL)  
FROM EMP
GROUP BY TO_CHAR(HIREDATE,'YYYY'),TO_CHAR(HIREDATE,'MM')
ORDER BY 1,2;
/*
4. 사원테이블에서 부서별 comm(커미션)을 포함하지 않은 연봉의 합과 
   포함한 연봉의 합을 구하는 SQL문장 작성.
*/
SELECT DEPTNO,SUM(SAL*12) 연봉 
FROM EMP
GROUP BY DEPTNO
ORDER BY 1;

SELECT DEPTNO, SUM((SAL+NVL(COMM,0))*12)
FROM EMP
GROUP BY DEPTNO
ORDER BY 1;
/*
5. 사원테이블에서 SALESMAN을 제외한 JOB별 급여합계?
*/
SELECT JOB,SUM(SAL) 
FROM EMP
GROUP BY JOB
HAVING JOB!='SALESMAN';

