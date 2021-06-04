package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Food;

public interface FoodMapper {
	
	public Food findFoodByNo(Integer foodNo);
	
	public Food findFoodByName(String foodName);
	
	public List<Food> findFoodByLikeName(String foodName);
	
	public List<Food> findFoodAll();
	
	public List<Food> findCategoryByNo(Integer categoryNo);
	
	public int insertFood(Food food);
	
	public int updateFoodByNo(Food food);
	
	public int deleteFoodByNo(Integer foodNo);
	
	public List<Food> foodListByPriceOrderAsc(Integer categoryNo);
	
	public List<Food> foodListByPriceOrderDesc(Integer categoryNo);
	
	public List<Food> foodListByNameOrder(Integer categoryNo);
	
	
}
