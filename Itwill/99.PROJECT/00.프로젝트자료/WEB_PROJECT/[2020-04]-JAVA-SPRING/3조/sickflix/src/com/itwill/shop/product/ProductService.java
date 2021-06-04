﻿package com.itwill.shop.product;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * 회원관리 비즈니스로직(예외처리, 트랜젝션, 보안, 로깅)을 수행하는 클래스
 */
public class ProductService {
	private ProductDao productDao;
	private static ProductService _instance;
	
	public ProductService() throws Exception{
		productDao = new ProductDao();
		System.out.println("ProductService()생성자:"+this );
	}
	
	public static ProductService getInstance() throws Exception {
		if(ProductService._instance==null) {
			ProductService._instance=new ProductService();
		}
		return ProductService._instance;
	}
	
	
	/*
	 *  제품추가
	 */
	public int create(Product product) throws Exception {
		return productDao.create(product);
	}
	
	
	/*
	 * 제품 하나 보기
	 */
	public Product findProduct (int p_no) throws Exception,ProductNotFoundException {
		Product product = productDao.findProduct(p_no);
		if(product==null) {
			throw new ProductNotFoundException(p_no+" 존재하지않는 제품입니다.");
		}
		return product;
	}
	
	
	/*
	 * 제품리스트
	 */
	public ArrayList<Product> findProductList() throws Exception {
		return productDao.findProductList();
	}
	
	
	/*
	 * 제품 하나 보기 (장르와 조인)
	 */
	public HashMap findOneProductWithGenre(int p_no) throws Exception {
		return productDao.findOneProductWithGenre(p_no);
	}
	
	
	/*
	 * 제품리스트 (장르와 조인)
	 */
	public ArrayList<HashMap> findProductsWithGenre() throws Exception {
		return productDao.findProductsWithGenre();
	}
	
	
	/*
	 * 제품 삭제
	 */
	public int remove(int p_no) throws Exception {
		return productDao.remove(p_no);
	}
	
	
	/*
	 * 제품 수정
	 */
	
	public int update(Product product) throws Exception {
		return productDao.update(product);
	}

}
