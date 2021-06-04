 1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요
select dname, max(height) "MAX_HEIGHT" ,max(weight) "MAX_WEIGHT" 
from (select * from student join department on deptno1=deptno)
group by dname;


2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
   학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
select stu1.dname,stu1."MAX_HEIGHT",stu2.name,stu2.height
from (select dname ,max(height)"MAX_HEIGHT"
      from student 
      join department
      on deptno1=deptno
      group by dname) stu1
join (select * from student join department on deptno1=deptno) stu2
on stu1."MAX_HEIGHT"=stu2.height and stu1.dname=stu2.dname
order by 2 desc;


3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순)
select stu1.grade,stu2.name,stu2.height,stu1."AVG_HEIGHT"
from (select grade,avg(height)"AVG_HEIGHT" 
      from student 
      group by grade)stu1
join student stu2
on stu1."AVG_HEIGHT"<stu2.height and stu1.grade=stu2.grade
order by grade;  


4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.
결과1)
select rownum, name, pay 
from (select name,pay 
      from professor 
      order by pay desc)  
where rownum>=1 and rownum<=5;      
 
결과2)
select e1."rank",e1.name,e1.pay
from(select rownum "rank", e.name, e.pay 
    from (select name,pay 
           from professor 
                  order by pay desc)e )e1
where e1."rank">=3 and e1."rank"<=5;


