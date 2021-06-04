package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.domain.Cart;

public class CartService {
	private static CartService _instance=null;
	private CartDao cartDao;	
	private CartService() throws Exception{
		cartDao = new CartDaoImpl();
	}
	public static CartService getInstance() throws Exception {
		if(_instance==null) {
			_instance = new CartService();
		}
		return _instance;
	}
	
	public List<Cart> getCartList(String user_id){
		return cartDao.getCartList(user_id);
	}
	public int add(Cart cart) {
		return cartDao.add(cart);
	}
	
	public int updateCartQty(Cart cart) {
		return cartDao.updateCartQty(cart);
	}
	
	public int deleteCartByNo(Integer cart_no) {
		return cartDao.deleteCartByNo(cart_no);
	}
	
	public int deleteCart(String user_id) {
		return cartDao.deleteCart(user_id);
	}
}
