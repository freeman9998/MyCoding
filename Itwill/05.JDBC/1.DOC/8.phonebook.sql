drop table phonebook;
create table phonebook(name varchar2(30) primary key, phone varchar2(20), address varchar2(250));
INSERT INTO phonebook values('김경호','256-9547','서울 송파구');
INSERT INTO phonebook values('구은미','567-4578','서울 서초구');
INSERT INTO phonebook values('김은희','897-5687','서울 강남구');
INSERT INTO phonebook values('김미정','256-9547','서울 강남구');
INSERT INTO phonebook values('신명숙','567-4578','충북 보은군');
INSERT INTO phonebook values('최경녀','897-5687','충남 서산시');
commit;

desc phonebook;
