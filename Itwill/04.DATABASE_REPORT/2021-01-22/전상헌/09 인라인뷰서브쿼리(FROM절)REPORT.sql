 1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요
-------------------------------------------------------------------
  DNAME    		MAX_HEIGTH  MAX_WEIGHT 
-------------------------------------------------------------------
Computer Engineering 	182		72
-------------------------------------------------------------------
SELECT * FROM STUDENT;
SELECT * FROM DEPARTMENT;

SELECT DNAME,maxhi,maxwe FROM(SELECT DEPTNO1,MAX(HEIGHT) maxhi,MAX(WEIGHT) maxwe 
FROM STUDENT 
GROUP BY DEPTNO1 ) e
JOIN DEPARTMENT d  ON  e.DEPTNO1=d.DEPTNO ;













2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
   학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
------------------------------------------------------------------------------
  DNAME    	        MAX_HEIGTH       NAME    	 HEIGHT 
-------------------------------------------------------------------------------
Software Engineering 	182	      Sandra Bullock	     182
-------------------------------------------------------------------------------

SELECT*FROM DEPARTMENT;

SELECT*FROM STUDENT;

SELECT d2.DEPTNO,d2.DNAME ,d1."max",d1.NAME,d1.HEIGHT 
FROM(SELECT e2.DEPTNO1,e2.NAME,e1."max",e2.HEIGHT
FROM (SELECT DEPTNO1 ,MAX(HEIGHT) "max" 
FROM STUDENT 
GROUP BY DEPTNO1 ) e1 JOIN STUDENT e2
ON  e1."max"=e2.HEIGHT AND e1.DEPTNO1=e2.DEPTNO1) d1 JOIN DEPARTMENT d2 ON d2.DEPTNO=d1.DEPTNO1;



3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순) 
------------------------------------------------------------
  GRADE    NAME    	    HEIGHT    AVG_HEIGHT 
------------------------------------------------------------
     1	Sean Connery     175       170.4	
------------------------------------------------------------

SELECT e2.GRADE,e2.NAME,e2.HEIGHT,e1."avg" FROM (SELECT GRADE,AVG(HEIGHT) "avg" FROM STUDENT GROUP BY GRADE)
e1 JOIN STUDENT e2 ON e1."avg"<=e2.HEIGHT AND e1.GRADE=e2.GRADE ORDER BY GRADE;


4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.
  
SELECT * FROM (SELECT ROWNUM,PAY,NAME FROM (SELECT PAY,NAME FROM PROFESSOR ORDER BY PAY DESC))
  WHERE ROWNUM>=1 AND ROWNUM <=5;
  
  
SELECT e."rank",e.NAME,e.PAY FROM (SELECT ROWNUM "rank",PAY,NAME FROM (SELECT PAY,NAME FROM PROFESSOR ORDER BY PAY DESC)) e
WHERE "rank">=3 AND "rank"<=5;
  
  
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
결과2>
--------------------------------
Ranking		NAME	PAY
--------------------------------
    3
    4
    5	
--------------------------------





