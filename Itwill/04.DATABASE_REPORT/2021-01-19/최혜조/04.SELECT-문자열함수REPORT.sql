--1. Student 테이블에서 jumin 컬럼을 이용해서 1전공이 101번인 학생들의이름과 태어난월일,생일을 출력
SELECT * FROM STUDENT;
--1-1)
SELECT NAME,SUBSTR(JUMIN,3,4) "Birthday" FROM STUDENT WHERE DEPTNO1 = 101;
--1-2)
SELECT NAME,CONCAT(SUBSTR(JUMIN,3,2),'월')||CONCAT(SUBSTR(JUMIN,5,2),'일') "Birthday" FROM STUDENT WHERE DEPTNO1 = 101;

--2. Student 테이블을 참조해서  1전공이(deptno1 컬럼) 201번인 학생의이름과 전화번호와 지역번호를 출력하세요 단 지역번호는 숫자만나오게하세요
SELECT NAME, TEL, SUBSTR(TEL,1,INSTR(TEL,')')-1) "AREA CODE" FROM STUDENT WHERE DEPTNO1 = 201;

--3. Studnt 테이블에서 전공1(deptno1) 이 101번인 학생들의 이름과 주민등록번호를 아래와같이 출력하세요.
SELECT NAME,JUMIN,REPLACE(JUMIN,SUBSTR(JUMIN,7),'-*******') "REPLACE" FROM STUDENT WHERE DEPTNO1 = 101;

--4.Student 테이블에서 deptno1 이 101번인 학과 학생들의 이름과 전화번호와 전화번호에서 지역번호와 국번을 제외한 나머지 번호를 * 로 표시해서 출력하세요
SELECT NAME,TEL,REPLACE(TEL,SUBSTR(TEL,INSTR(TEL,'-')),'-****') "REPLACE" FROM STUDENT WHERE DEPTNO1 = 101;
