package com.itwill.shop.dao.test;

import java.sql.Date;

import com.itwill.shop.dao.CartDao;
import com.itwill.shop.dao.CartDaoImpl;
import com.itwill.shop.domain.Cart;
import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.UserInfo;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception{
		CartDao cartDao = new CartDaoImpl();
		System.out.println(cartDao.getCartList("itwill4"));
		//System.out.println(cartDao.deleteCart("itwill4"));
		//System.out.println(cartDao.deleteCartByNo(2));
		/*
		UserInfo user = new UserInfo("itwill4", null, null, null, null, null);
		Product product = new Product(7, null, null, null, 0, null, null, null, null, null);
		Cart updateCart = new Cart(4, 9,user , product);
		System.out.println(cartDao.updateCartQty(updateCart));
		
		List<Cart> cartList = CartService.getInstance().getCartList("itwill3");
		UserInfo user = new UserInfo("itwill4", null, null, null, null, null);
		Product product = new Product(7, "PANTS", "DENIM", "레터스-pt", 43000, "연청", "S", null, null);
		Cart cart = new Cart(0, 2,"itwill4" , product);
		System.out.println(cartDao.add(cart));
		 */
	}

}
