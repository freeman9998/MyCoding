package com.itwill.shop.product;

import java.util.List;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao pd=new ProductDao();
	
		//Product p1=pd.selectOneMain(2);
		//System.out.println(p1);
		
		List<Product> findProductList = pd.selectManyMain();
		System.out.println(findProductList);
		

	}

}
