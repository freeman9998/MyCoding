package com.itwill.shop.cart;

import java.util.List;

public class CartServiceImpl implements CartService {
	private CartDao cartDao;
	public CartServiceImpl() throws Exception {
		cartDao=new CartDaoImpl();
	}
	/*
	 * 추가 or 수정
	 */
	@Override
	public int add(String sUserId,int p_no,int cart_qty ) throws Exception{
		
		boolean existProduct = cartDao.isProductExist(sUserId,p_no);
		if(existProduct) {
			return cartDao.update(sUserId, p_no, cart_qty);
		}else {
			return cartDao.add(sUserId, p_no, cart_qty);
		}
		
		
	}
	
	@Override
	public List<Cart> cartList(String sUserId) throws Exception{
		return cartDao.cartList(sUserId);
	}
	
	
	
	@Override
	public int deleteCartByNo (int cartNo) throws Exception{
		
		return cartDao.deleteCartByNo(cartNo);
	}
	
	@Override
	public int deleteAll(String userid) throws Exception{
		
		return cartDao.deleteCart(userid);
		
	}
	
	
	
	
}
