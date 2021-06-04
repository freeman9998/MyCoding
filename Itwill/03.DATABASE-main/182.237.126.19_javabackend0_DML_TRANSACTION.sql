/*
<< Transaction >>
트랜잭션의 정의 
    - 트랜잭션(Transaction)은 데이터베이스의 상태를 변환시키는(DML) 하나의 논리적 기능을 수행하기 위한 작업의 단위
*/
/*
Transaction 시작(DML--> insert delete update)
*/
select * from dept;
--transaction시작
--트랜잭션내의 모든 데이터 변경 사항은 트랜잭션이 종료되기 전까지는 모두 임시적이다.
insert into dept values(80,'생산1팀','대전');
insert into dept values(90,'생산2팀','인천');
select * from dept;
--transaction종료
--모든 데이터 변경사항을 데이터베이스에 영구히 반영시키는 명령어.
commit;

--transaction시작
insert into dept values(60,'기획팀','LA');
insert into dept values(70,'영업팀','서울');
select * from dept;
--transaction종료
--모든 데이터 변경사항을 취소하는 명령어 변경전의 데이터가 복원된다.
rollback;
select * from dept;










