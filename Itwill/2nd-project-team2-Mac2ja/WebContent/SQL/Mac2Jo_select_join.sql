--select
select * from members;
select * from card;
select * from address;
select * from members m join card c on m.members_no=c.members_no where m.members_no=1; 
select * from members m join address a on m.members_no=a.members_no where m.members_no=1; 
select * from members m join card c on m.members_no=c.members_no join address a on a.members_no=c.members_no where m.members_no=1;

select * from category;

select * from food;

select * from cart;
select * from cart c join food f on c.food_no=f.food_no where f.food_no = 302;
select * from cart c join members m on c.members_no=m.members_no where m.members_no = 302;


select * from orders;
select * from orders_detail;
select * from orders o join orders_detail od on o.orders_no=od.orders_no;

select * from comments;
select * from comments where comments_writer='mac123@google.com';


select o.orders_no as orders_no,orders_desc,orders_date,orders_price,members_no,orders_detail_no, 
		orders_detail_qty,food_no from orders o join 
		orders_detail od on o.orders_no=od.orders_no 
		where members_no=1


--update
/*
update members set Members_name='김춘향',
		Members_gender='F',
		Members_email='abc123@naver.com',
		Members_password='1111',
		Members_phone=01045987556
        where members_no=4;
        
update card set card_number=4525798535464598,
		Card_name='삼성카드',
		Card_type=0
        where card_no=1 and members_no=1;
        
update address set Address_name='이모집',
		Address_detail='대구광역시 산 좋고 물 좋은데',
		Address_type=1
        where Address_no=2 and members_no=1;

update cart set cart_qty=2 where cart_no=1 and food_no=301;

update orders_detail set orders_detail_qty=2 where orders_detail_no=3 and orders_no=2;
update orders set orders_price=14400 where orders_no=2;
*/
/*
update comments set 		
        Comments_title=?,
		Comments_content=?,
		Comments_star=?,
		Comments_date=sysdate,
		Comments_count=Comments_count+1,
        where Comments_writer=? and Comments_no=?;
*/

--delete
--회원 한명의 삭제는 카드,주소,카트,주문을 먼저 삭제하고 해야한다.
/*
delete from orders_detail where orders_no in(select orders_no from orders where members_no=1);
delete from orders where members_no=1;
delete from card where members_no=1;
delete from address where members_no=1;
delete from members where members_no=1;

delete from food where food_no=301;
delete from category where category_no=?;
delete from comments where comments_group=2 and comments_step=1 and comments_dept=2;
*/

