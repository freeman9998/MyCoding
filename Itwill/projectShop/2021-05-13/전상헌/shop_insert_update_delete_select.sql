--userinfo insert 3��
insert into userinfo  values('aa','2134','����ȣ','san2@naver.com');
insert into userinfo  values('bb','3334','����ȣ','dan2@naver.com');
insert into userinfo  values('bb','4434','���ȣ','gen2@naver.com');

--product insert ��ǰ3��

insert into product values(PRODUCT_P_NO_SEQ.nextval,'��ġ�����',300,'kimchi.jpg','��ġ�����',0);
insert into product values(PRODUCT_P_NO_SEQ.nextval,'�����',400,'refrigerator .jpg','�����',0);
insert into product values(PRODUCT_P_NO_SEQ.nextval,'��',100,'cup.jpg','cup',0);


--userinfo select 1�� 
select userid,password,name,email from userinfo where userid='aa';

--userinfo select ������ 
select userid,password,name,email from userinfo;

--product select 1�� 
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=1;

--product select ������ 
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product;

--userinfo update 
update userinfo set userid=?,password=?,name=?,email=? where userid=?;
--userinfo delete
delete from userinfo where USERID=?;

--�α����� ���� cart�� ��ǰ3���� ���(insert)
desc cart;
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',1);
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',2);
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',3);
select * from cart;
desc userinfo;
--�α����� ���� cart�� �ִ� ��ǰ 1�� ����Ʈ (��������,��ǰ����) 
select * from cart c 
join userinfo u on c.userid=u.userid 
join product p on c.p_no=p.p_no 
where c.cart_no=19;




--�α����� ���� cart�� �ִ� ��ǰ ��ü ����Ʈ (�������� ,��ǰ����)


select * from cart c 
join userinfo u on c.userid=u.userid 
join product p on c.p_no=p.p_no;


--�α����� ���� cart�� �ִ� ��ǰ ��ü delete 
delete from cart where userid='aa';
