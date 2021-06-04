package com.itwill.shop.product;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao = new ProductDao();
		
		productDao.findOneProduct(2);
		productDao.findAllProduct();
		
	}

}
