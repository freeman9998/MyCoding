delete from member;
insert into member values(1,'guard1','김경호1','010-5484-4731','경기도민');
insert into member values(2,'guard2','김경호2','010-5484-4731','경기도민');
insert into member values(3,'guard3','김경호3','010-5484-4731','경기도민');
insert into member values(4,'guard4','김경호4','010-5484-4731','경기도민');
insert into member values(5,'guard5','김경호5','010-5484-4731','경기도민');
insert into member values(6,'guard6','김경호6','010-5484-4731','경기도민');

commit;
SELECT * FROM MEMBER;

drop table s_product;

CREATE TABLE s_product
(
 id                         NUMBER(7) primary key,
 name                       VARCHAR2(50),
 short_desc                 VARCHAR2(255),
 price 			    NUMBER(10,3),
 ipgo_date		    DATE
 );
 
desc s_product;
 
INSERT INTO s_product VALUES (
   10011, '명품플러스원',
   '한글자막 안내기능',4000.123,to_date('06/12/24','yy/mm/dd'));
INSERT INTO s_product VALUES (
   10012, '장수명브라운관',
   '브라운관 수명3배',3000.1234,to_date('2006/12/24','yyyy/mm/dd'));
INSERT INTO s_product VALUES (
   10021, '액정와이드프로젝션',
   '고화질시네마비젼',3000,to_date('2006/12/24','yyyy/mm/dd'));
INSERT INTO s_product VALUES (
   10022, '액정와이드프로젝션2',
   '고화질시네마비젼2',4000.5,sysdate);

commit;

select * from s_product;



drop table account;
create table account( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into account(acc_no,acc_name) values(10000,'이종범',350000);
insert into account values(20000,'박찬호',670000);
insert into account values(30000,'서재웅',235000);
insert into account values(40000,'하리수',110000);
insert into account values(50000,'김경호',900000);
insert into account values(60000,'고길동',23600);
commit;

drop table accountA;
create table accountA( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountA values(10000,'이종범',350000);
insert into accountA values(20000,'박찬호',670000);
insert into accountA values(30000,'서재웅',235000);
insert into accountA values(40000,'하리수',110000);
insert into accountA values(50000,'김경호',900000);
insert into accountA values(60000,'고길동',23600);
commit;

drop table accountB;
create table accountB( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountB values(10000,'이종범',350000);
insert into accountB values(20000,'박찬호',670000);
insert into accountB values(30000,'서재웅',235000);
insert into accountB values(40000,'하리수',110000);
insert into accountB values(50000,'김경호',900000);
insert into accountB values(60000,'고길동',23600);
commit;



desc account;
select * from account;
select * from accountA;
select * from accountB;

desc dept;

desc guest;











     　     

