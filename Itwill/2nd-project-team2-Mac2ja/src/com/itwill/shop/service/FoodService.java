package com.itwill.shop.service;

import java.util.List;

import com.itwill.shop.dao.FoodDao;
import com.itwill.shop.dao.FoodDaoImpl;
import com.itwill.shop.domain.Food;

public class FoodService {
	
	private FoodDao foodDao;

	public FoodService() throws Exception {
		foodDao = new FoodDaoImpl();
	}
	
	public Food findFoodByNo(Integer foodNo) throws Exception{
		return foodDao.findFoodByNo(foodNo);
	}
	
	public Food findFoodByName(String foodName) throws Exception{
		return foodDao.findFoodByName(foodName);
	}
	
	public List<Food> findFoodByLikeName(String foodName) throws Exception{
		return foodDao.findFoodByLikeName(foodName);
	}
	
	public List<Food> findFoodAll() throws Exception{
		return foodDao.findFoodAll();
	}
	
	public int insertFood(Food food) {
		return foodDao.insertFood(food);
	}
	
	public int updateFoodByNo(Food food) throws Exception{
		return foodDao.updateFoodByNo(food);
	}
	
	public int deleteFoodByNo(Integer foodNo) throws Exception{
		return foodDao.deleteFoodByNo(foodNo);
	}
	
	public List<Food> findCategoryNo(Integer categoryNo) {
		return foodDao.findCategoryByNo(categoryNo);
	}
	
	public List<Food> foodListByPriceOrderDesc(Integer categoryNo) throws Exception {
		return foodDao.foodListByPriceOrderDesc(categoryNo);
	}
	
	public List<Food> foodListByPriceOrderAsc(Integer categoryNo) throws Exception {
		return foodDao.foodListByPriceOrderAsc(categoryNo);
	}
	
	public List<Food> foodListByNameOrder(Integer categoryNo) throws Exception {
		return foodDao.foodListByNameOrder(categoryNo);
	}

}


