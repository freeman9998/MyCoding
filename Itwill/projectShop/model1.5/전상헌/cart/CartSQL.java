package com.itwill.shop.cart;

public class CartSQL {
	public static final String ADD_CART="insert into cart values(CART_CART_NO_SEQ.nextval,?,?,?)";
	public static final String UPDATE_CART="update cart set cart_qty=cart_qty+? where p_no=? and userid=?";
	public static final String LIST_CART="select * from cart c join product p on c.p_no=p.p_no join userinfo u on c.userid=u.userid  where u.userid=?";
	public static final String isProductExist="select count(p_no) from cart where userid=? and p_no=?";
	public static final String DELETE_CART="delete from cart where cart_no=?";
	public static final String DELETE_CARTALL="delete from cart where userid=?";
	
}
