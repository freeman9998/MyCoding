package com.itwill.shop.product;

public class ProductDaoTest {
public static void main(String[] args) throws Exception{
	ProductDao productDao=new ProductDao();
	productDao.productSelectOne("bb");
	System.out.println();
	System.out.println("-----------");
	productDao.productSelectMany();
}
}
