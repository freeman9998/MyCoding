--1) TEMP 테이블에서 SALARY 을 이용하여 월 급여를 알아보는 SQL을 작성
SELECT EMP_NAME, SALARY/18, SALARY *2/18 FROM TEMP;

--2) 위에서 구한 결과값을 교통비가 10만원씩 지급된다면(짝수는 2배) 값이 어떻게 바뀔지 작성
SELECT EMP_NAME, SALARY/18 + 100000, SALARY *2/18 + 100000*2 FROM TEMP;

--3)TEMP 의 자료중 ID, NAME을 각각 사번 성명으로 표시되어 작성
SELECT EMP_ID "사번", EMP_NAME "성명" FROM TEMP;

--4)TEMP 에서 성명을 보여줄때 직급을 괄호안에 보여주는 SQL을 작성
SELECT EMP_NAME || '('||LEV||')' 성명 FROM TEMP;
SELECT EMP_NAME ||'''' || LEV || '''' 성명 FROM TEMP; 

--5)TEMP 테이블에서 HOBBY가 NULL이 아닌 사람의 성명을 읽어오는 SQL을 작성
SELECT EMP_NAME FROM TEMP WHERE HOBBY IS NOT NULL;

--6)TEMP 테이블에서 성명과 생년월일을 작은 따음표로 묶어서 하나의 문자열로 보여주는 SQL을 작성
SELECT ''''||EMP_NAME || BIRTH_DATE || '''' 성명
FROM TEMP ;

--7)TEMP 테이블에서 취미가 있는 사람중 직급이 과장인 사람의 사번,성명,취미를 읽어오는 SQL을 작성
SELECT EMP_ID "사번", EMP_NAME "성명", HOBBY "취미" FROM TEMP
WHERE LEV = '과장' AND HOBBY IS NOT NULL;