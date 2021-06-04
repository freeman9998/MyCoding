drop table userinfo;
create table userinfo(userid varchar2(100) primary key,password varchar2(100),name varchar2(200) ,email varchar2(300));
--insert
insert into userinfo(userid,password,name,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into userinfo(userid,password,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','3333','김경호3','guard3@korea.com');
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
insert into dogproduct values(dogproduct_seq.nextval, '비글', 550000, 'bigle.gif','기타 상세 정보 등...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '달마시안', 500000, 'dalma.gif','기타 상세 정보 등...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '퍼그', 400000, 'pug.gif','기타 상세 정보 등...', 0);
insert into dogproduct values(dogproduct_seq.nextval, '페키니즈', 450000, 'pekiniz.gif','기타 상세 정보 등...', 0);
commit;
UPDATE dogproduct SET click=click+1 WHERE name='비글';
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


