package com.itwill.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.domain.Cart;

public interface CartDao {

	public List<Cart> findCartAll();
	public List<Cart> findCartByFoodNo(Integer foodNo);
	public List<Cart> findCartByMembersNo(Integer membersNo);
	public int updateCartByNo(Cart cart);
	public int insertCart(Cart cart);
	public int deleteCartByNo(Integer cartNo);
	public int deleteCartByMember(Integer membersNo);
}