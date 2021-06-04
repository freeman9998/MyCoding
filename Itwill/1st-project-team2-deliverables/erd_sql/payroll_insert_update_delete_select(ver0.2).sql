--insert
--departments
insert into departments values(10,'인사');
insert into departments values(20,'경영');
insert into departments values(30,'마케팅');
insert into departments values(40,'개발');
insert into departments values(50,'전산');

--members
INSERT INTO members VALUES (101213,'이익준','1999/03/17','전략기획','이사',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20101213','YYYY/MM/DD'),20);
INSERT INTO members VALUES (110506,'채송화','2002/05/09','경영지원','부장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20110506','YYYY/MM/DD'),20);
INSERT INTO members VALUES (141232,'김준완','2007/05/04','전산','부장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140102','YYYY/MM/DD'),50);
INSERT INTO members VALUES (142132,'용석민','2012/10/21','마케팅','과장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140201','YYYY/MM/DD'),30);
INSERT INTO members VALUES (144456,'도재학','2013/04/17','개발','과장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140404','YYYY/MM/DD'),40);
INSERT INTO members VALUES (157625,'안정원','2015/06/13','인사','대리',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20150706','YYYY/MM/DD'),10);
INSERT INTO members VALUES (167584,'장겨울','2017/11/07','마케팅','대리',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20160705','YYYY/MM/DD'),30);
INSERT INTO members VALUES (201516,'안치홍','2018/08/15','영업지원','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20200105','YYYY/MM/DD'),20);
INSERT INTO members VALUES (210102,'추민하','2018/04/28','개발','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210102','YYYY/MM/DD'),40);
insert into members values(210112,'장윤복','2020/09/03','전산','인턴',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210112','YYYY/MM/DD'),50);

--id_pw
insert into id_pw (ID,password,member_no) values('aa@naver.com',1111,101213);
insert into id_pw (ID,password,member_no) values('bb@naver.com',2222,110506);
insert into id_pw (ID,password,member_no) values('cc@daum.net',3333,141232);
insert into id_pw (ID,password,member_no) values('dd.nate.com',4444,142132);
insert into id_pw (ID,password,member_no) values('ee.naver.com',5555,144456);
insert into id_pw (ID,password,member_no) values('ff.gmail.com',6666,157625);
insert into id_pw (ID,password,member_no) values('hh.gmail.com',7777,167584);
insert into id_pw (ID,password,member_no) values('ii.daum.net',8888,201516);
insert into id_pw (ID,password,member_no) values('jj.naver.com',9999,210102);
insert into id_pw (ID,password,member_no) values('kk.nate.com',0000,210112);


--pays
/*
insert into pays values(2021012901,101213,20000,0,2000000,70000,100000,'01');
insert into pays values(2021012902,110506,0,12000,3300000,90000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012903,141232,50000,92000,1900000,70000,600000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012904,142132,10000,30000,2200000,80000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012905,144456,100000,45000,3700000,90000,1000000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012906,157625,30000,22000,4000000,100000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012907,167584,90000,9000,3200000,90000,500000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012908,201516,120000,29000,2900000,80000,700000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012909,210102,0,0,2600000,100000,500000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021012910,210112,67000,20000,3000000,90000,450000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into pays values(2021022901,101213,20000,0,3000000,80000,100000,'02');
insert into pays values(2021032901,101213,30000,0,4000000,90000,200000,'03');
*/

--paystubs
insert into paystubs values(10001,101213,'2021/01/30',100000,10000,50000,50000,200000,20000,0,2000000,70000,100000,'01');
insert into paystubs values(10002,110506,'2021/01/30',150000,15000,50000,50000,300000,0,12000,3300000,90000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10003,141232,'2021/01/30',200000,20000,50000,50000,400000,50000,92000,1900000,70000,600000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10004,142132,'2021/01/30',250000,25000,50000,50000,250000,10000,30000,2200000,80000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10005,144456,'2021/01/30',150000,15000,50000,50000,200000,100000,45000,3700000,90000,1000000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10006,157625,'2021/01/30',150000,15000,50000,50000,150000,30000,22000,4000000,100000,300000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10007,167584,'2021/01/30',200000,20000,50000,50000,400000,90000,9000,3200000,90000,500000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10008,201516,'2021/01/30',250000,25000,50000,50000,300000,120000,29000,2900000,80000,700000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10009,210102,'2021/01/30',300000,30000,50000,50000,400000,0,0,2600000,100000,500000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10010,210112,'2021/01/30',100000,10000,50000,50000,350000,67000,20000,3000000,90000,450000,to_char(TO_DATE('20210130','YYYY/MM/DD'),'MM'));
insert into paystubs values(10011,101213,'2021/02/28',100,100,100,100,100,20000,0,3000000,80000,100000,'02');
insert into paystubs values(10012,101213,'2021/03/29',200,200,200,200,200,30000,0,4000000,90000,200000,'03');

commit;

--delete
delete from paystubs;
--delete from pays;
delete from id_pw;
delete from members;
delete from departments;

commit;

--update
update members set job='서버개발자',lev='사원' where member_no=210112;
commit;
--select

select * from members where member_no=210112;
--selectAll
select * from departments;
select * from members;
select * from id_pw;
--select * from pays;
select * from paystubs;