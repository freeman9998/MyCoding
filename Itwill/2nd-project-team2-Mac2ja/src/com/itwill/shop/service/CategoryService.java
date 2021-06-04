package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.CategoryDao;
import com.itwill.shop.dao.CategoryDaoImpl;
import com.itwill.shop.domain.Category;

public class CategoryService {
	
	private CategoryDao categoryDao;

	public CategoryService() throws Exception{
		categoryDao = new CategoryDaoImpl();
	}
	
	public Category findCategoryByno(Integer categoryNo) {
		return categoryDao.findCategoryByno(categoryNo);
	}	
	
	public List<Category> findCategoryAll() {
		return categoryDao.findCategoryAll();
	}
	
	public int insertCategory(Category category) {
		return categoryDao.insertCategory(category);
	}
	
	public int updateCategoryByNo(Category category) {
		return categoryDao.updateCategoryByNo(category);
	}
	
	public int deleteCategoryByNo(Integer categoryNo) {
		return categoryDao.deleteCategoryByNo(categoryNo);
	}
	

}
