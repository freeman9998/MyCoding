--insert
--departments
insert into departments values(10,'인사');
insert into departments values(20,'경영');
insert into departments values(30,'마케팅');
insert into departments values(40,'개발');
insert into departments values(50,'전산');

--members
INSERT INTO members VALUES (101213,'이익준','1999/03/17','전략기획','이사',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20101213','YYYY/MM/DD'),'aa@naver.com',1111,20);
INSERT INTO members VALUES (110506,'채송화','2002/05/09','경영지원','부장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20110506','YYYY/MM/DD'),'bb@naver.com',2222,20);
INSERT INTO members VALUES (141232,'김준완','2007/05/04','전산','부장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140102','YYYY/MM/DD'),'cc@daum.net',3333,50);
INSERT INTO members VALUES (142132,'용석민','2012/10/21','마케팅','과장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140201','YYYY/MM/DD'),'dd.nate.com',4444,30);
INSERT INTO members VALUES (144456,'도재학','2013/04/17','개발','과장',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20140404','YYYY/MM/DD'),'ee.naver.com',5555,40);
INSERT INTO members VALUES (157625,'안정원','2015/06/13','인사','대리',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20150706','YYYY/MM/DD'),'ff.gmail.com',6666,10);
INSERT INTO members VALUES (167584,'장겨울','2017/11/07','마케팅','대리',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20160705','YYYY/MM/DD'),'gg.gmail.com',6666,30);
INSERT INTO members VALUES (201516,'안치홍','2018/08/15','영업지원','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20200105','YYYY/MM/DD'),'hh.gmail.com',7777,20);
INSERT INTO members VALUES (210102,'추민하','2018/04/28','개발','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210102','YYYY/MM/DD'),'ii.daum.net',8888,40);
INSERT INTO members values(210112,'장윤복','2020/09/03','전산','인턴',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210112','YYYY/MM/DD'),'jj.naver.com',9999,50);
INSERT INTO members(member_no,member_name,jobdate,job,lev,jobtime,dept_no) values(210130,'참이슬','2020/10/30','전산','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210112','YYYY/MM/DD'),50);
INSERT INTO members(member_no,member_name,jobdate,job,lev,jobtime,dept_no) values(150105,'김철수','2015/09/20','마케팅','사원',TO_DATE('20210130','YYYY/MM/DD')-TO_DATE('20210112','YYYY/MM/DD'),30);

/*
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
*/

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
insert into paystubs values(10013,101213,'2020/12/30',330,950,220,650,220,13000,0,5600000,7000,120000,'12');
insert into paystubs values(10014,101213,'2020/11/30',430,850,520,950,420,10000,0,6500000,10000,100000,'11');
insert into paystubs values(10015,101213,'2020/10/30',530,750,720,750,520,13000,0,1200000,20000,80000,'10');
insert into paystubs values(10016,101213,'2020/09/30',630,650,920,450,250,21000,0,7400000,5000,80000,'09');
insert into paystubs values(10017,101213,'2020/08/30',730,550,220,550,450,21000,0,9400000,6000,450000,'08');
insert into paystubs values(10018,101213,'2020/07/30',830,450,520,350,740,21000,0,3400000,5000,130000,'07');
insert into paystubs values(10019,101213,'2020/06/30',930,350,720,150,650,12000,0,4500000,10000,90000,'06');
commit;

--delete
delete from paystubs;
--delete from pays;
--delete from id_pw;
delete from members;
delete from departments;

commit;

--update
update members set job='서버개발자',lev='사원' where member_no=210112;
update members set member_id ='cc@naver.com',member_password='1111' where member_no=101213;
commit;
--select

select * from members where member_no=210112;
--selectAll
select * from departments;
select * from members;
--select * from id_pw;
--select * from pays;
select * from paystubs;