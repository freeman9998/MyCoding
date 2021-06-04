 1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요
    
    select d.dname, hw."MAX_HEIGHT", hw."MAX_WEIGHT"
    from (select deptno1 "학과", max(height) "MAX_HEIGHT", max(weight) "MAX_WEIGHT"
            from student 
            group by deptno1) hw
    join department d
    on hw."학과" = d.deptno;
    
-------------------------------------------------------------------
  DNAME    		MAX_HEIGTH  MAX_WEIGHT 
-------------------------------------------------------------------
Computer Engineering 	182		72
-------------------------------------------------------------------

2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
   학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
   
   select d.dname, stu3."MAX_HEIGHT", stu3.name, stu3.height
   from( select stu1."학과", stu1."MAX_HEIGHT", stu2.name, stu2.height
         from (select deptno1 "학과",max(height) "MAX_HEIGHT"
                 from student
                    group by deptno1) stu1
           join student stu2
           on stu1."MAX_HEIGHT" = stu2.height) stu3
    join department d
    on d.deptno = stu3."학과";
------------------------------------------------------------------------------
  DNAME    	        MAX_HEIGTH       NAME    	 HEIGHT 
-------------------------------------------------------------------------------
Software Engineering 	182	      Sandra Bullock	     182
-------------------------------------------------------------------------------

3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순)

  select stu1."GRADE", stu2.name, stu2.height, stu1."AVG_HEIGHT"
  from (select grade "GRADE", avg(height) "AVG_HEIGHT"
         from student
         group by grade)stu1
  join student stu2
  on stu2.height > stu1."AVG_HEIGHT"
  order by stu1."GRADE" asc;
  
------------------------------------------------------------
  GRADE    NAME    	HEIGHT    AVG_HEIGHT 
------------------------------------------------------------
     1	Sean Connery             175       170.4	
------------------------------------------------------------

4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.
  
  결과1>
  select rownum "Ranking", pf.name, pf.pay
  from (select name, pay
          from professor
          order by pay desc)pf
  where rownum >=1 and rownum <= 5;
  
  결과2>
  select pf1."Ranking", pf1.name, pf1.pay
  from(select rownum "Ranking", pf.name, pf.pay
          from (select name, pay
                  from professor
                  order by pay desc)pf )pf1
  where "Ranking">=3 and "Ranking" <=5;
  
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





