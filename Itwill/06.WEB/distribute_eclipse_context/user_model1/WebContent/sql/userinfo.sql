drop table userinfo;
create table userinfo(userid varchar2(100) primary key,password varchar2(100),name varchar2(200) ,email varchar2(300));
--insert
insert into userinfo(userid,password,name,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into userinfo(userid,password,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','3333','김경호3','guard3@korea.com');
commit;
select * from userinfo;
commit;