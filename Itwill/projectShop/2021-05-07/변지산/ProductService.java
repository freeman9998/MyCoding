package com.itwill.shop.product;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() {
		productDao = new ProductDao();
	}
	
	/*
	 * 제품 리스트
	 */
	public List<Product> productList() throws Exception{
		return productDao.selectAllProduct();
	}
	/*
	 * 제품 상세보기
	 */
	public Product productDetatil(int p_no) throws Exception{
		return productDao.selectProduct(p_no);
	}
	
	
}
