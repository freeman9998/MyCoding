package com.itwill.shop.cart;

import java.util.List;

public interface CartDao {

	int add(String userid, int p_no, int cart_qty) throws Exception;

	int update(String userid, int p_no, int cart_qty) throws Exception;

	List<Cart> cartList(String sUserId) throws Exception;

	boolean isProductExist(String userid, int p_no) throws Exception;

	int deleteCartByNo(int cart_no) throws Exception;

	int deleteCart(String userid) throws Exception;

}