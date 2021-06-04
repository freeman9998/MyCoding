--userinfo insert 3명
insert into userinfo(userid, password, name, email) 
values('hong01', '1111', '홍길동', 'hong01@gmail.com');

insert into userinfo(userid, password, name, email) 
values('hong02', '2222', '김삿갓', 'hong02@gmail.com');

insert into userinfo(userid, password, name, email) 
values('kim01', '3333', '김아무개', 'kim01@gmail.com');

--product insert 제품3개
insert into product(p_no, p_name, p_price, p_image, p_desc, p_click_count)
values(product_p_no_SEQ.nextval, '삼다수','1000','water.jpg','제주삼다수는 화산암반수입니다','0');

insert into product(p_no, p_name, p_price, p_image, p_desc, p_click_count)
values(product_p_no_SEQ.nextval, '펩시스트롱','1000','pepsi.jpg','강렬한 짜릿한 맛(400ml)','0');

insert into product(p_no, p_name, p_price, p_image, p_desc, p_click_count)
values(product_p_no_SEQ.nextval, '코카콜라','1200','coke.jpg','ORIGINAL TASTE','0');

--userinfo select 1개
select  userid, password, name, email
from userinfo
where name ='홍길동';

select  userid, password, name, email
from userinfo
where userid ='hong02';

select  userid, password, name, email
from userinfo
where email ='kim01@gmail.com'; 

--userinfo select 여러개 
select userid, password, name, email
from userinfo;
--product select 1개 
select p_no, p_name, p_price, p_image, p_desc, p_click_count
from product
where p_name = '삼다수';

select p_no, p_name, p_price, p_image, p_desc, p_click_count
from product
where p_no = 3;

select p_no, p_name, p_price, p_image, p_desc, p_click_count
from product
where p_name = '펩시스트롱';
--product select 여러개 
select *
from product;

-- 로그인한 유저 cart에 제품 3 종류 담기(insert)
insert into cart(cart_no, userid, p_no, cart_qty) values(cart_p_no_SEQ.nextval, 'kim01',1,6);
insert into cart(cart_no, userid, p_no, cart_qty) values(cart_p_no_SEQ.nextval, 'kim01',2,3);
insert into cart(cart_no, userid, p_no, cart_qty) values(cart_p_no_SEQ.nextval, 'four29',3,3);

-- 로그인한 유저 cart에 있는 제품 1개 select (유저 정보, 제품 정보)
select c.cart_no, u.userid, u.name, u.email, p.p_no, p.p_name, p.p_price, p.p_desc
from cart c
join product p on c.p_no = p.p_no
join userinfo u on c.userid = u.userid
where c.userid = 'kim01';
-- 로그인한 유저 cart에 있는 제품 전체 select (유저 정보, 제품 정보)
select c.cart_no, u.userid, u.name, u.email, p.p_no, p.p_name, p.p_price, p.p_desc
from cart c
join product p on c.p_no = p.p_no
join userinfo u on c.userid = u.userid;
-- 로그인한 유저 cart에 있는 제품 전체 delete 
delete cart
where userid = 'four29';





commit;