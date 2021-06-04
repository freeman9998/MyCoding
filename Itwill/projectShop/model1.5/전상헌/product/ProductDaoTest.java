package com.itwill.shop.product;

import java.util.ArrayList;

public class ProductDaoTest {
public static void main(String[] args) throws Exception{
	ProductDao productDao=new ProductDaoImpl();
	System.out.println(productDao.productSelectOne(1));
	System.out.println("----------------------------------");

	ArrayList<Product> productList=productDao.productSelectMany();
	for (Product product : productList) {
		System.out.println(product);
	}
}
}
