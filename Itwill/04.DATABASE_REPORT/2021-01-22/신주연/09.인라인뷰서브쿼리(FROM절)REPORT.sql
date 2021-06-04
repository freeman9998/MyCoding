 1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요
-------------------------------------------------------------------
  DNAME    		MAX_HEIGTH  MAX_WEIGHT 
-------------------------------------------------------------------
Computer Engineering 	182		72
-------------------------------------------------------------------

select dname, max(height) "MAX_HEIGHT", max(weight) "MAX_WEIGHT"
from(select *
     from student s 
     join department d 
     on s.deptno1=d.deptno)
group by dname
order by dname;


2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
   학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
------------------------------------------------------------------------------
  DNAME    	        MAX_HEIGTH       NAME    	 HEIGHT 
-------------------------------------------------------------------------------
Software Engineering 	182	      Sandra Bullock	     182
-------------------------------------------------------------------------------

select s1.dname, s1."MAX_HEIGHT", s2.name, s2.height
from(select dname,max(height) "MAX_HEIGHT"
     from student s
     join department d on s.deptno1=d.deptno
     group by dname) s1
join (select *
      from student s
      join department d on s.deptno1=d.deptno) s2
on s1."MAX_HEIGHT"=s2.HEIGHT and s1.dname =s2.dname
order by 2 desc;




3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순) 
------------------------------------------------------------
  GRADE    NAME    	HEIGHT    AVG_HEIGHT 
------------------------------------------------------------
     1	Sean Connery             175       170.4	
------------------------------------------------------------

select s1.grade,s2.name,s2.height,s1."AVG_HEIGHT"
from (select grade, avg(height) "AVG_HEIGHT"
      from student
      group by grade
      ) s1
join student s2 on s1.grade = s2.grade and s2.height>s1."AVG_HEIGHT"
order by grade asc;


4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.


--결과1
select rownum , p.name, p.pay 
from (select name,pay
      from professor
      order by pay desc) p
where rownum>=1 and rownum<=5;

--결과2
select p1."Ranking" ,p1.name , p1.pay
from (select rownum "Ranking" , p.name,p.pay
      from (select name,pay
            from professor
            order by pay desc) p
      ) p1
where p1."Ranking">=3 and p1."Ranking"<=5 ;
  
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





