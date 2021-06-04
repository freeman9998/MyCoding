package com.itwill.shop.product;
/*
 * 제품 업무
 */

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	public ProductServiceImpl() {
	 productDao=new ProductDaoImpl();
	}
	@Override
	public Product productSelectOne(int p_no) throws Exception{
		return productDao.productSelectOne(p_no);
	}
	
	
	
	/*
	 * 제품 리스트
	 */
	@Override
	public ArrayList<Product> productList() throws Exception{
		return productDao.productSelectMany();
	}
	/*
	 * 제품 상세보기 
	 */
	@Override
	public Product productDetail(int p_no)throws Exception {
		
		return productDao.productSelectOne(p_no);
	}
}
