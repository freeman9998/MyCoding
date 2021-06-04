package com.itwill.shop.product.test;

import com.itwill.shop.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();
		
		System.out.println("select :***********************");
		//productDao.selectProductByNo(2);
		
		System.out.println("selectAll :********************");
		//productDao.selectProductAll();
	}

}
