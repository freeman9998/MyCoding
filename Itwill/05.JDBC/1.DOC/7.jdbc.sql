delete from member;
insert into member values(1,'guard1','���ȣ1','010-5484-4731','��⵵��');
insert into member values(2,'guard2','���ȣ2','010-5484-4731','��⵵��');
insert into member values(3,'guard3','���ȣ3','010-5484-4731','��⵵��');
insert into member values(4,'guard4','���ȣ4','010-5484-4731','��⵵��');
insert into member values(5,'guard5','���ȣ5','010-5484-4731','��⵵��');
insert into member values(6,'guard6','���ȣ6','010-5484-4731','��⵵��');

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
   10011, '��ǰ�÷�����',
   '�ѱ��ڸ� �ȳ����',4000.123,to_date('06/12/24','yy/mm/dd'));
INSERT INTO s_product VALUES (
   10012, '���������',
   '����� ����3��',3000.1234,to_date('2006/12/24','yyyy/mm/dd'));
INSERT INTO s_product VALUES (
   10021, '�������̵���������',
   '��ȭ���ó׸�����',3000,to_date('2006/12/24','yyyy/mm/dd'));
INSERT INTO s_product VALUES (
   10022, '�������̵���������2',
   '��ȭ���ó׸�����2',4000.5,sysdate);

commit;

select * from s_product;



drop table account;
create table account( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into account(acc_no,acc_name) values(10000,'������',350000);
insert into account values(20000,'����ȣ',670000);
insert into account values(30000,'�����',235000);
insert into account values(40000,'�ϸ���',110000);
insert into account values(50000,'���ȣ',900000);
insert into account values(60000,'��浿',23600);
commit;

drop table accountA;
create table accountA( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountA values(10000,'������',350000);
insert into accountA values(20000,'����ȣ',670000);
insert into accountA values(30000,'�����',235000);
insert into accountA values(40000,'�ϸ���',110000);
insert into accountA values(50000,'���ȣ',900000);
insert into accountA values(60000,'��浿',23600);
commit;

drop table accountB;
create table accountB( acc_no number(20)  primary key
                                  ,acc_name varchar2(20)
				  ,acc_balance number(10));
insert into accountB values(10000,'������',350000);
insert into accountB values(20000,'����ȣ',670000);
insert into accountB values(30000,'�����',235000);
insert into accountB values(40000,'�ϸ���',110000);
insert into accountB values(50000,'���ȣ',900000);
insert into accountB values(60000,'��浿',23600);
commit;



desc account;
select * from account;
select * from accountA;
select * from accountB;

desc dept;

desc guest;











     ��     

