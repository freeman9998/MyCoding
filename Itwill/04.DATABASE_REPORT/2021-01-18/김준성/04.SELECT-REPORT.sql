SELECT emp_name, salary/18 홀수달, salary*2/18 짝수달 FROM temp;

SELECT emp_name, salary/18+100000 홀수달, salary*2/18+200000 짝수달 FROM temp;

SELECT emp_id 사번, emp_name 성명 FROM temp;

SELECT emp_name||'('||lev||')' 성명 FROM temp;
SELECT emp_name||''''||lev||'''' 성명 FROM temp;

SELECT emp_name FROM temp WHERE hobby IS NOT NULL;

SELECT ''''||emp_name||birth_date||'''' NAME_BIRTH FROM temp;

SELECT emp_id, emp_name, hobby FROM temp WHERE hobby IS NOT NULL AND lev = '과장';

COMMIT;