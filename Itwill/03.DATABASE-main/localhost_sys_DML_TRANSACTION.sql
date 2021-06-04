/*
localhost sys계정에 접속
*/
select sal from scott.emp where ename='KING';

-- LOCK경합(sys)
select * from scott.dept;
-- 90번부서가 lock이걸려있으므로 wait
-- 90번부서가 lock이풀리면 update

--transaction시작
update scott.dept set loc='서울'
where deptno=90;
select * from scott.dept;
rollback;
