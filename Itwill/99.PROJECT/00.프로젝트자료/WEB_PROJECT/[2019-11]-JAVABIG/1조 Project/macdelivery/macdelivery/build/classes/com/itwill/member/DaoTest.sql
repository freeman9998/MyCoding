insert into Member values(seq_member_no.nextval,'����','����','����','����','����','����');
update Member set m_pwd='1111',m_phone='1121',m_email='email' where m_no=1000;
insert into MemberAddressList values(1000,2000,'�����','������','���ﵿ');
insert into MemberAddressList values(1000,seq_Address_no.nextval,'â����','�󳲱�','�󳲵�');
select * from MemberAddressList;
update MemberAddressList set m_address_si='�����',m_address_gu='���α�',m_address_detail='������' where m_no=1000 and ma_no=1;

select * from Member;