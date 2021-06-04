package com.itwill.shop.cart;

import java.util.List;

public class CartService {
	private CartDao cartDao;
	public CartService() {
		cartDao=new CartDao();
	}
	/*
	 * 추가 or 수정
	 */
	public int add(String userId,int p_no,int cart_qty ) throws Exception{
		
		//boolean existProduct = cartDao.isProductExist(sUserId,p_no);
		boolean existProduct = false;
		if(existProduct) {
			return cartDao.update(userId, p_no, cart_qty);
		}else {
			return cartDao.add(userId, p_no, cart_qty);
		}
		
		
	}
	
	public List<Cart> cartList(String userId) throws Exception{
		return cartDao.cartList(userId);
	}
	
	public int deleteUser(String userId)throws Exception{
		return cartDao.deleteCart(userId);
	}
	public int deleteProduct(String userId, int p_no)throws Exception{
		return cartDao.deleteCartByNo(userId, p_no);
	}
	
}