--userinfo insert 3명
insert into userinfo  values('aa','2134','김일호','san2@naver.com');
insert into userinfo  values('bb','3334','김이호','dan2@naver.com');
insert into userinfo  values('bb','4434','김삼호','gen2@naver.com');

--product insert 제품3개

insert into product values(PRODUCT_P_NO_SEQ.nextval,'김치냉장고',300,'kimchi.jpg','김치냉장고',0);
insert into product values(PRODUCT_P_NO_SEQ.nextval,'냉장고',400,'refrigerator .jpg','냉장고',0);
insert into product values(PRODUCT_P_NO_SEQ.nextval,'컵',100,'cup.jpg','cup',0);


--userinfo select 1개 
select userid,password,name,email from userinfo where userid='aa';

--userinfo select 여러개 
select userid,password,name,email from userinfo;

--product select 1개 
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=1;

--product select 여러개 
select p_no,p_name,p_price,p_image,p_desc,p_click_count from product;

--userinfo update 
update userinfo set userid=?,password=?,name=?,email=? where userid=?;
--userinfo delete
delete from userinfo where USERID=?;

--로그인한 유저 cart에 제품3종류 담기(insert)
desc cart;
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',1);
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',2);
insert into cart values (CART_CART_NO_SEQ.nextval,1,'aa',3);
select * from cart;
desc userinfo;
--로그인한 유저 cart에 있는 제품 1개 셀렉트 (유저정보,제품정보) 
select * from cart c 
join userinfo u on c.userid=u.userid 
join product p on c.p_no=p.p_no 
where c.cart_no=19;




--로그인한 유저 cart에 있는 제품 전체 셀렉트 (유저정보 ,제품정보)


select * from cart c 
join userinfo u on c.userid=u.userid 
join product p on c.p_no=p.p_no;


--로그인한 유저 cart에 있는 제품 전체 delete 
delete from cart where userid='aa';
