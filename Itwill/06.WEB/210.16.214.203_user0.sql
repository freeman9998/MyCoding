drop table userinfo;
create table userinfo(userid varchar2(100) primary key,password varchar2(100),name varchar2(200) ,email varchar2(300));
--insert
insert into userinfo(userid,password,name,email) values('guard1','1111','���ȣ1','guard1@korea.com');
insert into userinfo(userid,password,name,email) values('guard2','2222','���ȣ2','guard2@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','3333','���ȣ3','guard3@korea.com');
commit;
select * from userinfo;

select count(*) cnt from userinfo where userid='guard1';


commit;

drop table dogproduct;
create table dogproduct(
	id number primary key,
	name varchar2(12),
	price number,
	image varchar2(20),
	des varchar2(400),
	click number(5)
);

drop sequence dogproduct_seq;
CREATE SEQUENCE dogproduct_seq START WITH 1 NOCACHE;
insert into dogproduct values(dogproduct_seq.nextval, '���', 550000, 'bigle.gif','��Ÿ �� ���� ��...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '�޸��þ�', 500000, 'dalma.gif','��Ÿ �� ���� ��...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '�۱�', 400000, 'pug.gif','��Ÿ �� ���� ��...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '��Ű����', 450000, 'pekiniz.gif','��Ÿ �� ���� ��...', 0);
commit;
UPDATE dogproduct SET click=click+1 WHERE name='���';
select * from dogproduct ;
commit;


DROP TABLE board;
DROP SEQUENCE board_sequence;
CREATE TABLE board
 (
    boardno number  primary key,
    title varchar2 (100) not null,
    writer varchar2 (20) not null,
    content varchar2 (2000) not null,
    regdate date default (SYSDATE),
    readcount number default (0),
    groupno number not null,
    step number not null,
    depth number default (0)
 );
CREATE SEQUENCE board_sequence;


select * 
from board 
order by groupno desc, step asc;

--XXXXX
select boardno,title,groupno,step,depth 
from board where boardno >= 71 and boardno<=80
order by groupno desc,step asc;


SELECT rownum,board.* 
FROM board;

SELECT rownum,board.* 
FROM board 
order by groupno desc,step asc;


