package com.itwill.shop.cart;

import java.util.List;

public interface CartService {

	/*
	 * 추가 or 수정
	 */
	int add(String sUserId, int p_no, int cart_qty) throws Exception;

	List<Cart> cartList(String sUserId) throws Exception;

	int deleteCartByNo(int cartNo) throws Exception;

	int deleteAll(String userid) throws Exception;

}