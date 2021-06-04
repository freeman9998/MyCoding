package com.itwill.shop.product;

public class productDaoTest {
public static void main(String[] args) throws Exception{
	productDao productDao=new productDao();
	productDao.productSelectOne("bb");
	System.out.println();
	System.out.println("-----------");
	productDao.productSelectMany();
}
}
