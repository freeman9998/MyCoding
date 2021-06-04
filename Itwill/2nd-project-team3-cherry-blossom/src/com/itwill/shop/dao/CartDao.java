package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Cart;

public interface CartDao {
	public List<Cart> getCartList(String user_id);
	
	public int add(Cart cart);
	
	public int updateCartQty(Cart cart);
	
	public int deleteCartByNo(Integer cart_no);
	
	public int deleteCart(String user_id);
}
