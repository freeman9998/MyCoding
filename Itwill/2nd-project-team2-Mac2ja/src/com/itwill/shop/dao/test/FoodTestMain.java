package com.itwill.shop.dao.test;

import com.itwill.shop.dao.FoodDaoImpl;
import com.itwill.shop.domain.Category;
import com.itwill.shop.domain.Food;

public class FoodTestMain {

	public static void main(String[] args) throws Exception{
		
		FoodDaoImpl foodDaoImpl = new FoodDaoImpl();
		
		//System.out.println(foodDaoImpl.findFoodByNo(301));
		//System.out.println(foodDaoImpl.findFoodByLikeName("불고기"));
		//System.out.println(foodDaoImpl.findFoodByName("불고기 버거"));
		//Food food = new Food(999, "기기기 버거", 6000, "999.png", "오리", 4, 300, new Category(30));
		//System.out.println(foodDaoImpl.insertFood(food));
		//System.out.println(foodDaoImpl.updateFoodByNo(food));
		//System.out.println(foodDaoImpl.deleteFoodByNo(999));
		
		//System.out.println(foodDaoImpl.foodListByNameOrder(30));
		
	}

}
