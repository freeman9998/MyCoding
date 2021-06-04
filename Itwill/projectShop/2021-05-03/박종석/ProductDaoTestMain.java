package com.itwill.shop.product;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao pd=new ProductDao();
		pd.selectManyMain();
		pd.selectOneMain(2);

	}

}
