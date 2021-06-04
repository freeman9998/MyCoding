1. Student 테이블에서 jumin 컬럼을 이용해서 1전공이
   101번인 학생들의이름과 태어난월일,생일을 출력하시요
   select name,substr(to_char(jumin),3,4) "birthday"
   from student
   where deptno1=101;

   from student;
   select name,substr(to_char(jumin),3,2)||'월'||substr(to_char(jumin),5,2)||'일' "birthday"
   from student
   where deptno1=101;

2. Student 테이블을 참조해서  1전공이(deptno1 컬럼) 
   201번인 학생의이름과 전화번호와 지역번호를 출력하세요
   단 지역번호는 숫자만나오게하세요
   select name, tel, 
          (
                case when substr(tel,1,2)=02 then substr(tel,1,2)
                else substr(tel,1,3)
                end
           ) "area code"
   from student
   where deptno1=201;
   
3. Studnt 테이블에서 전공1(deptno1) 이 101번인 학생들의 이름과
   주민등록번호를 아래와같이 출력하세요.
   select name,jumin,replace(jumin,substr(jumin,7),'*******') "replace"
   from student
   where deptno1=101;

   select name,jumin,replace(jumin,substr(jumin,7),'-*******') "replace"
   from student
   where deptno1=101;

4.Student 테이블에서 deptno1 이 101번인 학과 학생들의 이름과
  전화번호와 전화번호에서 지역번호와 국번을 제외한 나머지
  번호를 * 로 표시해서 출력하세요
  
  select name,tel,
         (
             case when substr(tel,1,2)=02 then replace(tel,substr(tel,7),'-****')
             else replace(tel,substr(tel,8),'-****')
             end
          ) "replace"
  from student
  where deptno1=101;

  

