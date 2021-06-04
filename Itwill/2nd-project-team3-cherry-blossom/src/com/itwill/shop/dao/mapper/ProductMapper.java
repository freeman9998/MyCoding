package com.itwill.shop.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itwill.shop.domain.Product;

public interface ProductMapper {
	public List<Product> list();
	
	public List<Product> listAllByDate();
	
	public List<Product> listAllByName();
	
	public List<Product> listAllByLowPrice();
	
	public List<Product> listAllByHighPrice();
	
	public List<Product> listCategoryByDate(String p_category);
	
	public List<Product> listCategoryByName(String p_category);
	
	public List<Product> listCategoryLowPrice(String p_category);
	
	public List<Product> listCategoryHighPrice(String p_category);
	
	public List<Product> listSubCategoryByDate(String p_subcategory);
	
	public List<Product> listSubCategoryByName(String p_subcategory);
	
	public List<Product> listSubCategoryByLowPrice(String p_subcategory);
	
	public List<Product> listSubCategoryByHighPrice(String p_subcategory);
	
	public Product findProductByNo(int p_no);
	
	public List<Product> findProductByNameLike(String p_name);
	
	public List<String> listSubCategoryByCategory(String p_category);
	
	public List<Map> listSubCategoryByCategoryMap(String p_category);

	public List<Map> listCategoryByCategoryMap();
	
	public int getProductCount();
	
	public List<Product> findProductList(@Param("start") int start,@Param("last") int last);
}
