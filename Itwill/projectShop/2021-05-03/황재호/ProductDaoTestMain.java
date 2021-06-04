package com.itwill.user.dao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();
		
		productDao.selectProductOne(1);
		productDao.productSelectMany();
	}

}
