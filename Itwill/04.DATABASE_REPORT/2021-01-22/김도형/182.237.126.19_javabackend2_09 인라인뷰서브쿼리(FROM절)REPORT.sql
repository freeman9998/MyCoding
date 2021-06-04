 1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요
-------------------------------------------------------------------
  DNAME    		MAX_HEIGTH  MAX_WEIGHT 
-------------------------------------------------------------------
Computer Engineering 	182		72
-------------------------------------------------------------------    
SELECT DNAME, MAX(HEIGHT) "MAX_HEIGHT", MAX(WEIGHT) "MAX_WEIGHT" 
FROM (SELECT * 
            FROM STUDENT S1
            JOIN DEPARTMENT D1
            ON S1.DEPTNO1 = D1.DEPTNO) 
GROUP BY DNAME 
ORDER BY DNAME;

2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
   학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
------------------------------------------------------------------------------
  DNAME    	        MAX_HEIGTH       NAME    	 HEIGHT 
-------------------------------------------------------------------------------
Software Engineering 	182	      Sandra Bullock	     182
-------------------------------------------------------------------------------
SELECT S2.DNAME,S3."MAX_HEIGHT",S2.NAME,S2.HEIGHT
FROM (SELECT *
      FROM STUDENT S1
      JOIN DEPARTMENT D1
      ON S1.DEPTNO1=D1.DEPTNO) S2
JOIN (SELECT DEPTNO1,MAX(HEIGHT) "MAX_HEIGHT"
      FROM STUDENT
      GROUP BY DEPTNO1) S3
ON S2.DEPTNO1=S3.DEPTNO1
AND S2.HEIGHT="MAX_HEIGHT";

3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순) 
------------------------------------------------------------
  GRADE    NAME    	HEIGHT    AVG_HEIGHT 
------------------------------------------------------------
     1	Sean Connery             175       170.4	
------------------------------------------------------------
SELECT S1.GRADE, NAME, HEIGHT, "AVG_HEIGHT"
FROM (SELECT *
            FROM STUDENT) S1
JOIN (SELECT GRADE, AVG(HEIGHT) "AVG_HEIGHT" 
          FROM STUDENT
          GROUP BY GRADE) S2
ON S1.GRADE = S2.GRADE 
AND S1.HEIGHT > S2."AVG_HEIGHT" 
ORDER BY GRADE;

4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.
결과1>
--------------------------------
Ranking		NAME	PAY
--------------------------------
    1           
    2
    3
    4
    5	
--------------------------------
SELECT ROWNUM "PAY_RANK", NAME, PAY
FROM (SELECT NAME, PAY 
            FROM PROFESSOR 
            ORDER BY PAY DESC)
WHERE ROWNUM>=1 AND ROWNUM<=5;

결과2>
--------------------------------
Ranking		NAME	PAY
--------------------------------
    3
    4
    5	
--------------------------------
SELECT * 
FROM (SELECT ROWNUM "PAY_RANK", NAME, PAY 
            FROM (SELECT NAME, PAY 
                        FROM PROFESSOR 
                        ORDER BY PAY DESC))
WHERE "PAY_RANK" >= 3 and "PAY_RANK" <= 5;