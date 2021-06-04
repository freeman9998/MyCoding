--insert
insert into student(no,name,kor,eng,math) values(1,'KIM',34,67,89);
insert into student(no,name,kor,eng,math) values(2,'LEE',34,67,89);
insert into student(no,name,kor,eng,math) values(3,'PARK',34,67,89);
--update(pk update)
update student set name='CHANGE',kor=12,eng=34,math=90 where no=1;
--update student set tot = kor+eng+math,avg = (kor+eng+math)/3 where no=1;
commit;

--delete (pk delete)
delete student where no=1;
commit;

--select pk
select * from student where no=1;
--select all
select * from student;

