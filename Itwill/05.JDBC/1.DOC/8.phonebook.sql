drop table phonebook;
create table phonebook(name varchar2(30) primary key, phone varchar2(20), address varchar2(250));
INSERT INTO phonebook values('���ȣ','256-9547','���� ���ı�');
INSERT INTO phonebook values('������','567-4578','���� ���ʱ�');
INSERT INTO phonebook values('������','897-5687','���� ������');
INSERT INTO phonebook values('�����','256-9547','���� ������');
INSERT INTO phonebook values('�Ÿ��','567-4578','��� ������');
INSERT INTO phonebook values('�ְ��','897-5687','�泲 �����');
commit;

desc phonebook;
