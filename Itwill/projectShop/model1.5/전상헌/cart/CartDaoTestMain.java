package com.itwill.shop.cart;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception{
	
		CartDao cartDao=new CartDaoImpl();
		//System.out.println(cartDao);
		System.out.println(cartDao.cartList("aa"));
	//System.out.println(cartDao.update("aa", 1, 1));
	//System.out.println(cartDao.isProductExist("aa",42));
	//System.out.println(cartDao.deleteCartByNo(44));
    //System.out.println(cartDao.deleteCart("aa"));
		
	
	}

}
