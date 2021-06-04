package com.itwill.shop.dao;

import java.util.List;

import com.itwill.shop.domain.Food;

public interface FoodDao {
	Food findFoodByNo(Integer foodNo);
	
	Food findFoodByName(String foodName);
	
	List<Food> findFoodByLikeName(String foodName);
	
	List<Food> findFoodAll();
	
	int insertFood(Food food);
	
	int updateFoodByNo(Food food);
	
	int deleteFoodByNo(Integer foodNo);
	
	List<Food> findCategoryByNo(Integer categoryNo);
	
    public List<Food> foodListByPriceOrderDesc(Integer categoryNo) throws Exception;
	
	public List<Food> foodListByPriceOrderAsc(Integer categoryNo) throws Exception;
	
	public List<Food> foodListByNameOrder(Integer categoryNo) throws Exception;
}
