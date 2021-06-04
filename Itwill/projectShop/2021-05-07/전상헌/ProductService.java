package com.itwill.shop.product;
/*
 * 제품 업무
 */

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() {
	 productDao=new ProductDao();
	}
	/*
	 * 제품 리스트
	 */
	public ArrayList<Product> productList() throws Exception{
		return productDao.productSelectMany();
	}
	/*
	 * 제품 상세보기 
	 */
	public Product productDetail(int p_no)throws Exception {
		
		return productDao.productSelectOne(p_no);
	}
}
