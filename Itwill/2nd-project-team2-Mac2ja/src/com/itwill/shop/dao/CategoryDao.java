package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Category;
import com.itwill.shop.domain.Comments;

public interface CategoryDao {
	
	Category findCategoryByno(Integer categoryNo);
	List<Category> findCategoryAll();
	int insertCategory(Category category);
	public int insertCommentsChild(Comments comments);
	int updateCategoryByNo(Category category);
	int deleteCategoryByNo(Integer categoryNo);

}
