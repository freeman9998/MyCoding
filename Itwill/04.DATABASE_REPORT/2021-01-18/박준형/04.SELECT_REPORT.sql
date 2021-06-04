/*
1)TEMP 테이블에서 SALARY(연봉)을 이용하여 월 급여를 알아보는 SQL을 작성하시요.
	월 급여는 연봉을 18로 나누어 홀수 달에는 연봉의 1/18 이 지급되고,
        짝수 달에는 연봉의 2/18 가 지급된다고 가정했을 때 홀수 달과 짝수 달에 
        받을 금액을 SELECT 해 보세요.

	결과>
	EMP_NAME   SALARY/18  	SALARY*2/18
 	---------- ---------- 	-----------
 	김길동     5555555.56 	11111111.1
 	홍길동     4000000   	8000000
 	박문수     2777777.78 	5555555.56
 	정도령     3888888.89 	7777777.78
 	이순신     3111111.11 	6222222.22
 	지문덕     2500000 	5000000
 	강감찬     3555555.56 	7111111.11
 	설까치     1944444.44 	3888888.89
 	연흥부     2500000 	5000000
 	배뱅이     2166666.67 	4333333.33
*/
--1번 문제--
SELECT emp_name,ROUND(salary/18,2),ROUND(salary*2/18,2) FROM TEMP;

/*
2) 위에서 구한 월 급여에 교통비가 10만원씩 지급된다면 (짝수 달은20만원) 위의 문장이 어떻게 바뀔 지
   작성해 보세요.

	결과>
 
	EMP_NAME 	100000+SAL 	200000+SAL
	---------	------- 	----------
	김길동 		5655555.56 	11311111.1
	홍길동 		4100000 	8200000
	박문수 		2877777.78 	5755555.56
	정도령 		3988888.89 	7977777.78
	이순신 		3211111.11 	6422222.22
	지문덕 		2600000 	5200000
	강감찬 		3655555.56 	7311111.11
	설까치 		2044444.44 	4088888.89
	연흥부 		2600000 	5200000
	배뱅이 		2266666.67 	4533333.33
*/
--2번 문제--
SELECT emp_name,ROUND(salary/18+100000,2) as "100000+SAL",ROUND(salary*2/18+200000,2) as "200000+SAL" FROM TEMP;

/*
3)TEMP 의 자료 중 EMP_ID 와 EMP_NAME 을 각각 ‘사번’,‘성명’
  으로 표시되어DISPLAY 되도록 COLUMN ALIAS를 부여하여 SELECT 하시오.

	<결과>
	사번 		성명
	---------------------- 
	19970101 	김길동
	19960101 	홍길동

	19970201 	박문수
	19930331 	정도령
	19950404 	이순신
	19966102 	지문덕
	19930402 	강감찬
	19960303 	설까치
	19970112 	연흥부
	19960212 	배뱅이
	10 rows selected
*/
--3번 문제--
SELECT emp_id as 사번,emp_name as 성명  FROM TEMP;

/*
4) TEMP 에서 성명을 보여줄 때 직급을 괄호 안에 함께 보여주는 SQL을 작성하시요.

  	<결과1>   
	성명
	-----------------
	김길동(부장 )
	홍길동(과장 )
	박문수(과장 )
	정도령(차장 )
	이순신(대리 )
	지문덕(과장 )
	강감찬(차장 )
	설까치(사원 )
	연흥부(대리 )
	배뱅이(과장 )
	<결과2>   
	성명
	----------------
	김길동'부장'
	홍길동'과장'
	박문수'과장'
	정도령'차장'
	이순신'대리'
	지문덕'과장'
	강감찬'차장'
	설까치'사원'
	연흥부'대리'
	배뱅이'과장'
	10 rows selected
*/
--4번 문제--
SELECT emp_name||'('||lev||' )' as 성명 FROM TEMP;
SELECT emp_name||''''||lev||'''' as 성명 FROM TEMP;

/*
5) TEMP 테이블에서 HOBBY(취미) 가 NULL 이 아닌 사람의 
   성명을 읽어오는 SQL을 작성하시요.

	<결과>
	EMP_NAME
	----------
	김길동
	홍길동
	박문수
	정도령
	4 rows selected.
*/
--5번 문제--
SELECT emp_name FROM TEMP WHERE hobby is not null;

/*
6) TEMP테이블에서 성명과 생년월일을 작은따옴표로 묶어서 
   하나의 문자열로 보여주는 SQL을 작성하시요.

<결과>
	NAME_BIRTH
	--------------------------
	‘김길동74/01/25’
	‘홍길동73/03/22’
	‘박문수75/04/15’
	‘정도령76/05/25’
	‘이순신73/06/15’
	‘지문덕72/07/05’
	‘강감찬72/08/15’
	‘설까치71/09/25’
	‘연흥부76/11/05’
	‘배뱅이72/12/15’
	10 rows selected.
*/
--6번 문제--
SELECT ''''||emp_name||birth_date||'''' as NAME_BRITH FROM TEMP;

/*
7)EMP 테이블을 이용해서 취미가 있는 사람 중 
  직급이 과장인 사람의 사번, 성명, 취미를 읽어오는
  SQL을 작성 하시오.
 
	<결과> 
	EMP_ID 	   EMP_NAME 	HOBBY
	---------- ----- 	------
	19960101   홍길동 	낚시
	19970201   박문수 	바둑
	2 rows selected.
*/
--7번 문제--
SELECT emp_id,emp_name,hobby FROM TEMP WHERE HOBBY is not null AND lev='과장';
