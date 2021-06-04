drop sequence edu_info_no_seq;
create sequence edu_info_no_seq start with 1;

drop table edu_info;
create table edu_info (no number(3),name varchar2(10),class varchar2(10),age number(3));
insert into edu_info values( edu_info_no_seq.nextval,'김은희1','자바',33);
insert into edu_info values( edu_info_no_seq.nextval,'김은희2','디자인',45); 
insert into edu_info values( edu_info_no_seq.nextval,'김은희3','자바',67); 
insert into edu_info values( edu_info_no_seq.nextval,'김은희4','쇼핑몰',39); 
insert into edu_info values( edu_info_no_seq.nextval,'김은희5','자바',56); 
commit;
 
