package com.itwill0.context;



public class JavaApplicationMain {

	public static void main(String[] args) {
		
		ProductDao productDao=new ProductDao();
		ProductService productService=new ProductService();
		productService.setProductDao(productDao);
		
		System.out.println(productService.productList());

	}

}
