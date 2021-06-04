package com.itwill.shop.product;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao = new ProductDao();
		Product p1 = productDao.selectProduct(2);
		System.out.println(p1);
		Product p2 = productDao.selectProduct(1);
		System.out.println(p2);
		
		System.out.println("productList >> " + productDao.selectAllProduct());
	}

}
