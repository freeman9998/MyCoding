--장바구니
select c.cart_no,p_name,p_color,p_size,p_price,c.cart_qty
from cart c
join product p on c.p_no=p.p_no
join userinfo u on c.user_id=u.user_id
where u.user_id=#{user_id}
order by cart_no asc

--하나 삭제
delete cart where cart_no=#{} and user_id=#{}

--장바구니 비우기
delete cart where user_id=#{}

--장바구니 수량 조정
update cart set cart_qty=#{cart_qty} where cart_no=#{cart_no}