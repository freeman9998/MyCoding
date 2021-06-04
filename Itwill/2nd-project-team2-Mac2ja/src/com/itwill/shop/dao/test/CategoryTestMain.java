package com.itwill.shop.dao.test;

import com.itwill.shop.dao.CategoryDao;
import com.itwill.shop.dao.CategoryDaoImpl;
import com.itwill.shop.domain.Category;

public class CategoryTestMain {

	public static void main(String[] args) throws Exception{
		CategoryDaoImpl categoryDaoImpl = new CategoryDaoImpl();
		//System.out.println(categoryDaoImpl.findCategoryByno(10));
		//System.out.println(categoryDaoImpl.findCategoryAll());
		Category category = new Category(99, "꾸꾸까까");
		//System.out.println(categoryDaoImpl.insertCategory(category));
		System.out.println(categoryDaoImpl.updateCategoryByNo(category));
		//System.out.println(categoryDaoImpl.deleteCategoryByNo(99));
		

	}

}
