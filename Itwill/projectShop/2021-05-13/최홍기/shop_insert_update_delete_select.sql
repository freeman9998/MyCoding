--userinfo insert 유저3명
insert into userinfo(userid, password, name, email) values('guard1', '1111', '김경호1', 'guard1@korea.com');
insert into userinfo(userid, password, name, email) values('guard2', '2222', '김경호2', 'guard2@korea.com');
insert into userinfo(userid, password, name, email) values('guard3', '3333', '김경호3', 'guard3@korea.com');

--product insert 제품3개
insert into product values(product_p_no_SEQ.nextval, '비글', 550000, 'bigle.gif', '기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '달마시안', 500000, 'dalma.gif', '기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '퍼그', 400000, 'pug.gif', '기타 상세 정보 등...', 0);
insert into product values(product_p_no_SEQ.nextval, '페키니즈', 450000, 'pekiniz.gif', '기타 상세 정보 등...', 0);

--userinfo select 유저1
--userinfo select 유저3
select userid, password, name, email from userinfo where userid = 'guard1';
select userid, password, name, email from userinfo;

--userinfo update
update  userinfo set password='1318', name='모네', email='mone@mone.com' where userid = 'mone';
--userinfo delete
delete from userinfo where userid = 'mone';

--product select 제품1 
--product select 제품3
select p_no, p_name, p_price, p_image, p_desc, p_click_count from product where p_no = 1;
select p_no, p_name, p_price, p_image, p_desc, p_click_count from product;

--로그인한 유저 cart에 제품3종류 담기(insert)
insert into cart values (cart_cart_no_SEQ.nextval, 2, 1, 'guard1');
insert into cart values (cart_cart_no_SEQ.nextval, 1, 2, 'guard1');
insert into cart values (cart_cart_no_SEQ.nextval, 3, 3, 'guard1');

insert into cart values (cart_cart_no_SEQ.nextval, 1, 1, 'guard2');
insert into cart values (cart_cart_no_SEQ.nextval, 1, 2, 'guard2');

--로그인한 유저 cart에 있는 제품 1개 셀렉트 (유저정보, 제품정보)
select * from cart c join product p on c.p_no = p.p_no join userinfo u on c.userid = u.userid  where u.userid = 'guard1';
select * from cart c join product p on c.p_no = p.p_no join userinfo u on c.userid = u.userid  where u.userid = 'guard2';

--로그인한 유저 cart에 있는 제품 전체 셀렉트 (유저정보, 제품정보)
select * from cart where userid = 'guard1' 

--로그인한 유저 cart에 있는 제품 전체 delete
--delete from cart where userid = 'guard1';

commit;
--rollback