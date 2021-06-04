package com.itwill.shop.service;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.domain.Cart;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		//cartDao=new CartDaoImpl();
		cartDao=new CartDaoImpl();
	}
	
	public List<Cart> findCartAll() {
		return cartDao.findCartAll();
	}
	
	public List<Cart> findCartByFoodNo(Integer foodNo) {
		return cartDao.findCartByFoodNo(foodNo);
	}
	
	public List<Cart> findCartByMembersNo(Integer membersNo) {
		return cartDao.findCartByMembersNo(membersNo);
	}
	
	public int updateCartByNo(Cart cart) {
		return cartDao.updateCartByNo(cart);
	}
	
	public int insertCart(Cart cart) {
		return cartDao.insertCart(cart);
	}
	
	public int deleteCartByNo(Integer cartNo) {
		return cartDao.deleteCartByNo(cartNo);
	}
	
	public int deleteCartByMember(Integer membersNo) {
		return cartDao.deleteCartByMember(membersNo);
	}

}
