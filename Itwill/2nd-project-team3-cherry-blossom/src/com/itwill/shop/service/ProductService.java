package com.itwill.shop.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.itwill.shop.dao.ProductDao;
import com.itwill.shop.dao.ProductDaoImpl;
import com.itwill.shop.dao.mapper.ProductMapper;
import com.itwill.shop.domain.Product;
import com.itwill.shop.util.product.PageMaker;
import com.itwill.shop.util.product.ProductListPageMakerDto;

public class ProductService {
	private static ProductService _instance=null;
	private ProductDao productDao;
	private ProductService() throws Exception{
		productDao = new ProductDaoImpl();
	}
	public static ProductService getInstance() throws Exception {
		if(_instance==null) {
			_instance = new ProductService();
		}
		return _instance;
	}
	
	public List<Product> list() {
		return productDao.list();
	}
	
	public List<Product> listAllByDate() {
		return productDao.listAllByDate();
	}
	
	public List<Product> listAllByName(){
		return productDao.listAllByName();
	}
	
	public List<Product> listAllByLowPrice(){
		return productDao.listAllByLowPrice();
	}
	
	public List<Product> listAllByHighPrice(){
		return productDao.listAllByHighPrice();
	}

	public List<Product> listCategoryByDate(String p_category){
		return productDao.listCategoryByDate(p_category);
	}
	
	public List<Product> listCategoryByName(String p_category){
		return productDao.listCategoryByName(p_category);
	}
	
	public List<Product> listCategoryLowPrice(String p_category){
		return productDao.listCategoryLowPrice(p_category);
	}
	
	public List<Product> listCategoryHighPrice(String p_category){
		return productDao.listCategoryHighPrice(p_category);
	}
	
	public List<Product> listSubCategoryByDate(String p_subcategory){
		return productDao.listSubCategoryByDate(p_subcategory);
	}
	
	public List<Product> listSubCategoryByName(String p_subcategory){
		return productDao.listSubCategoryByName(p_subcategory);
	}
	
	public List<Product> listSubCategoryByLowPrice(String p_subcategory){
		return productDao.listSubCategoryByLowPrice(p_subcategory);
	}
	
	public List<Product> listSubCategoryByHighPrice(String p_subcategory){
		return productDao.listSubCategoryByHighPrice(p_subcategory);
	}
	public Product findProductByNo(int p_no) {
		return productDao.findProductByNo(p_no);
	}
	public List<Product> findProductByNameLike(String p_name) {
		return productDao.findProductByNameLike(p_name);
	}
	public List<String> listSubCategoryByCategory(String p_category) {
		return productDao.listSubCategoryByCategory(p_category);
	}
	public List<Map> listSubCategoryByCategoryMap(String p_category) {
		return productDao.listSubCategoryByCategoryMap(p_category);
	}
	public List<Map> listCategoryByCategoryMap() {
		return productDao.listCategoryByCategoryMap();
	}
	public ProductListPageMakerDto findProductList(int currentPage) throws Exception {
		//1.전체상품의 갯수
		int totalRecordCount = productDao.getProductCount();
		//2. paging계산
		PageMaker pageMaker = new PageMaker(totalRecordCount, currentPage);
		//3.상품데이터 얻기
		List<Product> productList = productDao.findProductList(pageMaker.getPageBegin(),pageMaker.getPageEnd());
		ProductListPageMakerDto pageMakerProductList = new ProductListPageMakerDto();
		pageMakerProductList.totRecordCount=totalRecordCount;
		pageMakerProductList.itemList = productList;
		pageMakerProductList.pageMaker=pageMaker;
		return pageMakerProductList;
	}
}
