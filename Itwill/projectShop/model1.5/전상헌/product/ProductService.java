package com.itwill.shop.product;

import java.util.ArrayList;

public interface ProductService {

	Product productSelectOne(int p_no) throws Exception;

	/*
	 * 제품 리스트
	 */
	ArrayList<Product> productList() throws Exception;

	/*
	 * 제품 상세보기 
	 */
	Product productDetail(int p_no) throws Exception;

}