drop table student;
create table student (
		no number(4) primary key,
		name varchar2(20),
		kor number(3),
		eng number(3),
		math number(3),
		tot number(3) default 0,
		avg number(5,2) default 0.0,
		grade char(1) default 'F',
        rank number(3) default 1
);
insert into student(no,name,kor,eng,math) values(1,'KIM',34,67,89);
insert into student(no,name,kor,eng,math) values(2,'KIM',34,67,89);
insert into student(no,name,kor,eng,math) values(3,'KIM',34,67,89);





