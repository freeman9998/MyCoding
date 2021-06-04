--1. 인라인뷰를 사용해서 Student테이블과 department 테이블을 사용해서
--    학과별로 학생들의 최대키와 몸무게 학과 이름을 출력하세요.
select d.dname,s.height as "MAX_HEIGHT",s.weight as "MAX_WEIGHT"
from (select deptno1,max(height) height,max(weight) weight from student group by deptno1) s,department d
where d.deptno=s.deptno1;

--2.student 테이블과 department테이블을 사용하여 학과이름,학과별 최대키
-- 학과별로 가장키가 큰학생들의 이름과 키를 인라인뷰를 사용하여 출력하시요
select d.dname,s1.MAX_HEIGHT,s2.name,s2.height as "MAX_HEIGHT"
from (select deptno1,max(height) MAX_HEIGHT from student group by deptno1) s1,student s2,department d
where s2.deptno1 = d.deptno
and s1.max_height = s2.height
and s2.deptno1=s1.deptno1;

--3.student 테이블에서 학생의키가 동일 학년의 평균키보다 큰학생들의 학년과
--  이름과 키,해당학년의 평균키를 출력하세요(학년컬럼으로 오름차순) 
select s2.grade,s2.name,s2.height,s1.height "AVG_HEIGHT"
from (select grade,avg(height) height from student group by grade) s1,student s2
where s1.height < s2.height
and s1.grade = s2.grade
order by grade;

--4.professor 테이블을 조회하여 교수들의 급여순위와 교수이름,급여를출력하세요
--  급여순위는 급여가 많은 사람부터 1~5위까지 출력하세요.
select rownum "Ranking",NAME,PAY 
from (select name,pay from professor ORDER BY pay desc)
where rownum BETWEEN 1 and 5;


select p1."Ranking",p1.name,p1.pay
from(select rownum "Ranking",p.name,p.pay 
        from (select name,pay
                from professor 
                order by pay desc) p) p1
where p1."Ranking">=3 and p1."Ranking"<=5;
