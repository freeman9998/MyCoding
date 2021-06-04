package com.itwill.shop.dao.test;

import java.util.List;
import java.util.Map;

import com.itwill.shop.dao.ProductDao;
import com.itwill.shop.dao.ProductDaoImpl;
import com.itwill.shop.service.ProductService;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao = new ProductDaoImpl();
		//System.out.println(productDao.list());
		//System.out.println(productDao.listAllByName());
		//System.out.println(productDao.listCategoryByName("ACC"));
		//System.out.println(productDao.listSubCategoryByName("RING"));
		//System.out.println(productDao.listSubCategoryByCategory("OUTER"));
		//List<Map> mapList = productDao.listSubCategoryByCategoryMap("OUTER");
		//System.out.println(mapList.get(0).get("P_SUBCATEGORY"));
		//List<Map> mapList = productDao.listCategoryByCategoryMap();
		//System.out.println(mapList);
		//System.out.println(productDao.findProductByNameLike("tee"));
		ProductService.getInstance().findProductList(3);
	}
}
