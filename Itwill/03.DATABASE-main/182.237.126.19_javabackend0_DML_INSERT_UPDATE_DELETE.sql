--DML
--insert

desc dept;
select * from dept;
insert into dept(deptno,dname,loc) values(90,'인사과','서울');
insert into dept(loc,dname,deptno) values('부산','개발과',70);
insert into dept values(80,'홍보과','인천');
--null 값입력
insert into dept(deptno,dname,loc) values(91,null,null);
insert into dept(deptno) values(92);
insert into dept values(93,'생산과',null);
insert into dept(deptno,dname) values(94,'생산2과');

desc emp;
select * from emp;
--ORA-00001: unique constraint (JAVABACKEND0.PK_EMP) violated
insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) 
values(9001,'강감찬2','MANAGER',7839,to_date('2021/01/22','YYYY/MM/DD'),200,0,40);

insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) 
values(9002,'홍길동','MANAGER',null,sysdate,7000,null,70);

insert into emp values(9003,'임꺽정',null,null,null,null,null,null);
--ORA-02291: integrity constraint (JAVABACKEND0.FK_DEPTNO) violated - parent key not found
insert into emp values(9004,'이순신',null,null,null,null,null,99);

insert into emp(empno) values(9999);
--UPDATE
select * from dept;
update dept set dname='인사팀',loc='LA' where deptno=90;
update dept set loc='제주' where deptno = 70; 
update dept set dname='MARKETING' where deptno=80;
--1 행 이(가) 업데이트되었습니다.
update dept set dname='운영과',loc='청주' where deptno=99;
--0개 행 이(가) 업데이트되었습니다
update dept set loc='제주' where loc is null;
--4개 행 이(가) 업데이트되었습니다.
update dept set dname='영업1팀' where deptno=91;
update dept set dname='영업2팀' where deptno=92;

select * from emp;
update emp 
set ename='이순신',job='PRESIDENT', mgr=null,hiredate=to_date('2000/01/01','YYYY/MM/DD'),sal=9000,comm=1000,deptno=10
where empno=9999;

update emp set hiredate=sysdate where ename='임꺽정';
update emp set sal=900 where sal is null;
update emp set comm=0 where comm is null;

update emp set sal = sal*1.1 where sal<=1000;

update emp set sal=(select sal 
                    from emp 
                    where empno=7839) 
where empno=9003;
--delete
select * from emp;
select * from dept;
delete from dept where deptno=90;

delete emp where deptno=70;
delete dept where deptno=10;
--ORA-02292: integrity constraint (JAVABACKEND0.FK_DEPTNO) violated - child record found
delete dept where dname like '생산%';

--delete dept where deptno=10;
--ORA-02292: integrity constraint (JAVABACKEND0.FK_DEPTNO) violated - child(emp) record found

delete dept where deptno>= 80;

delete emp where empno = 9000;
delete emp where to_char(hiredate,'YYYY/MM/DD') =  to_char(sysdate,'YYYY/MM/DD');
delete emp where empno > 9000;
--db 반영
commit;

delete emp;
delete dept;

select * from emp;
select * from dept;
--db반영
commit;
--취소
rollback;




