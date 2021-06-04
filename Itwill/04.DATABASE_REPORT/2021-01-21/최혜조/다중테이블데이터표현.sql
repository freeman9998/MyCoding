/*
1.부서 테이블과 사원테이블에서 사번, 사원명, 부서코드, 부서명을 검색하시오.(사원명 오름차순 정렬할 것 )
*/

--ORACLE JOIN
SELECT EMPNO "사번", ENAME "사원명", E.DEPTNO "부서코드", DNAME "부서명"
FROM EMP E, DEPT D
WHERE E.DEPTNO = d.deptno
ORDER BY "사원명" ASC;

--ANSI JOIN
SELECT EMPNO "사번", ENAME "사원명", E.DEPTNO "부서코드", DNAME "부서명"
FROM EMP E JOIN DEPT D
ON E.DEPTNO = d.deptno
ORDER BY "사원명" ASC;

/*
2.부서 테이블과 사원테이블에서 사번, 사원명 , 급여 , 부서명을 검색하시오. 
단, 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것.
*/

--ORACLE JOIN
SELECT EMPNO "사번", ENAME "사원명",SAL "급여", DNAME "부서명"
FROM EMP E , DEPT D
WHERE E.DEPTNO = D.DEPTNO AND SAL >= 2000
ORDER BY SAL DESC;

--ANSI JOIN
SELECT EMPNO "사번", ENAME "사원명",SAL "급여", DNAME "부서명"
FROM EMP E JOIN DEPT D
ON E.DEPTNO = D.DEPTNO AND SAL >= 2000
ORDER BY SAL DESC;

/*
3.부서 테이블과 사원 테이블에서 사번, 사원명, 업무, 급여 , 부서명을 검색하시오. 
단, 업무가 Manager이며 급여가 2500 이상인 사원에 대하여 사번을 기준으로 오름차순 정렬할 것.
*/
--ORACLE JOIN
SELECT EMPNO"사번", ENAME"사원명", JOB"업무", SAL"급여", DNAME"부서명"
FROM  EMP E, DEPT D
WHERE JOB='MANAGER' AND SAL>=2500 AND E.DEPTNO=d.deptno 
ORDER BY E.EMPNO ASC;

--ANSI JOIN
SELECT EMPNO"사번", ENAME"사원명", JOB"업무", SAL"급여", DNAME"부서명"
FROM  EMP E JOIN DEPT D
ON JOB='MANAGER' AND SAL>=2500 AND E.DEPTNO=d.deptno 
ORDER BY E.EMPNO ASC;

/*
4.사원 테이블과 급여 등급 테이블에서 사번, 사원명, 급여, 등급을 검색하시오. 단, 등급은 급여가
하한값과 상한값 범위에 포함되고 등급이 4이며 급여를 기준으로 내림차순정렬할 것.
*/
--ORACLE JOIN
SELECT EMPNO"사번", ENAME"사원명", SAL"급여", GRADE "등급"
FROM EMP E, SALGRADE G
WHERE SAL>=LOSAL AND SAL<=HISAL AND GRADE = 4
ORDER BY "급여" DESC;

--ANSI JOIN
SELECT EMPNO"사번", ENAME"사원명", SAL"급여", GRADE "등급"
FROM EMP E JOIN SALGRADE G
ON SAL>=LOSAL AND SAL<=HISAL AND GRADE = 4
ORDER BY "급여" DESC;

/*
5.부서 테이블, 사원 테이블, 급여등급 테이블에서 사번, 사원명, 부서명, 급여 , 등급을 검색하시오. 
단, 등급은 급여가 하한값과 상한값 범위에 포함되며 등급을 기준으로 내림차순 정렬할 것.
*/
--ORACLE JOIN
SELECT EMPNO"사번", ENAME"사원명",DNAME "부서명", SAL"급여", GRADE "등급"
FROM EMP E , DEPT D, SALGRADE G
WHERE E.DEPTNO = D.DEPTNO AND SAL>=LOSAL AND SAL<=HISAL
ORDER BY "등급" DESC;

--ANSI JOIN
SELECT EMPNO"사번", ENAME"사원명",DNAME "부서명", SAL"급여", GRADE "등급"
FROM EMP E JOIN DEPT D ON E.DEPTNO = D.DEPTNO
JOIN SALGRADE ON SAL>=LOSAL AND SAL<=HISAL
ORDER BY "등급" DESC;

/*
6.사원 테이블에서 사원명과 해당 사원의 관리자명을 검색하시오.
*/
--ORACLE JOIN
SELECT E.ENAME "사원명",M.ENAME "관리자명"
FROM EMP E, EMP M
WHERE E.MGR = M.EMPNO;

--ANSI JOIN
SELECT E.ENAME "사원명",M.ENAME "관리자명"
FROM EMP E JOIN EMP M
ON E.MGR = M.EMPNO;

/*
7.사원 테이블에서 사원명, 해당 사원의 관리자명, 해당 사원의 관리자의 관리자명을 검색하시오
*/
--ORACLE JOIN
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E , EMP M1, EMP M2
WHERE E.MGR = M1.EMPNO AND M1.MGR = M2.EMPNO;

--ANSI JOIN
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E JOIN EMP M1 ON E.MGR = M1.EMPNO 
JOIN EMP M2 ON M1.MGR = M2.EMPNO;


/*
8.7번 결과에서 상위 관리자가 없는 모든 사원의 이름도 사원명에 출력되도록 수정하시오.
*/
--ORACLE JOIN
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E , EMP M1, EMP M2
WHERE E.MGR = M1.EMPNO(+) AND M1.MGR = M2.EMPNO(+) ;


--ANSI JOIN
SELECT E.ENAME "사원명", M1.ENAME "관리자명", M2.ENAME "관리자의 관리자명"
FROM EMP E LEFT OUTER JOIN EMP M1 ON E.MGR = M1.EMPNO 
LEFT OUTER JOIN EMP M2 ON  M1.MGR = M2.EMPNO;