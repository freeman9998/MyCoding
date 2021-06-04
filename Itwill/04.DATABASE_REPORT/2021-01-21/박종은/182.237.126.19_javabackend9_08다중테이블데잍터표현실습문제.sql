--8.다중테이블데이터표현  실습문제
--1.부서테이블과 사원테이블에서 사번,사원명,부서코드,부서명  검색(사원명 오름차순정렬)
SELECT E.EMPNO, ENAME, D.DEPTNO , DNAME
FROM EMP E JOIN DEPT D ON E.DEPTNO=D.DEPTNO
ORDER BY ENAME;

--2. 부서테이블과 사원테이블에서 사번,사원명,급여,부서명을 검색
--단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬
SELECT EMPNO, ENAME, SAL, DNAME
FROM EMP E JOIN DEPT D ON E.DEPTNO=D.DEPTNO
WHERE SAL >= 2000
ORDER BY SAL  DESC;

--3. 부서테이블과 사원테이블에서 사번,사원명,업무,급여,부서명을 검색
-- 단,  업무가 MANAGER이며 급여가 2500 이상인 사원에  대하여  사번을 기준으로 오름차순  정렬
SELECT EMPNO,ENAME,JOB,SAL,DNAME
FROM EMP E JOIN DEPT D  ON E.DEPTNO = D.DEPTNO
WHERE  JOB='MANAGER' AND SAL >= 2500
ORDER BY EMPNO;

--4. 사원ㅌ테이블과 급여 등급 테이블에서 사번,사원명,급여,등급을 검색하시오.
--단, 등급은 급여가 하한값과   상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬
SELECT EMPNO, ENAME, SAL,GRADE
FROM EMP JOIN SALGRADE ON SAL BETWEEN LOSAL AND HISAL
WHERE GRADE = 4
ORDER BY SAL DESC;

--5. 부서테이블,  사원테이블,급여등급 테이블에서  사번,사원명,부서명,급여,등급을 검색
--단, 등급은 급여가  하한값과 상한값범위에 포함되며 등급을 기준으로 내림차순정렬
SELECT E.EMPNO, E.ENAME, E.SAL, G.GRADE 
FROM EMP E JOIN SALGRADE G ON E.SAL >= G.LOSAL AND E.SAL <= G.HISAL;

--6. 사원테이블에서 사원명과 해당사원의 관리자명을 검색
SELECT  E.ENAME "사원명", M.ENAME "관리자명" 
FROM EMP E JOIN EMP M ON E.MGR = M.EMPNO;

--7. 사원테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E JOIN EMP M1 ON E.MGR = M1.EMPNO
JOIN EMP M2 ON M1.MGR=M2.EMPNO;

--8. 7번 결과에서 상위관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E LEFT OUTER JOIN EMP M1 ON E.MGR = M1.EMPNO
LEFT OUTER JOIN EMP M2 ON M1.MGR=M2.EMPNO;