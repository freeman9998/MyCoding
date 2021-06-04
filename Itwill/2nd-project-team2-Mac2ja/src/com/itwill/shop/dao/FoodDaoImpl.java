package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.FoodMapper;
import com.itwill.shop.domain.Food;

public class FoodDaoImpl implements FoodDao {
	
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE = "com.itwill.shop.dao.mapper.FoodMapper.";
	public FoodDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = 
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = 
					sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public Food findFoodByNo(Integer foodNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		Food food = foodMapper.findFoodByNo(foodNo);
		return food;
	}

	@Override
	public List<Food> findFoodAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> foodList = foodMapper.findFoodAll();
		return foodList;
	}

	@Override
	public int insertFood(Food food) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		int insertRow = foodMapper.insertFood(food);
		return insertRow;
	}

	@Override
	public int updateFoodByNo(Food food) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		int updateRow = foodMapper.updateFoodByNo(food);
		return updateRow;
	}

	@Override
	public int deleteFoodByNo(Integer foodNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		int deleteRow = foodMapper.deleteFoodByNo(foodNo);
		return deleteRow;
	}


	@Override
	public List<Food> findFoodByLikeName(String foodName) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> foodList = foodMapper.findFoodByLikeName(foodName);
		return foodList;
	}


	@Override
	public Food findFoodByName(String foodName) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		Food food = foodMapper.findFoodByName(foodName);
		return food;
	}
	
	@Override
	public List<Food> findCategoryByNo(Integer categoryNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> food = foodMapper.findCategoryByNo(categoryNo);
		return food;
	}
	
	@Override
	public List<Food> foodListByPriceOrderAsc(Integer categoryNo) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> foodListByAsc = foodMapper.foodListByPriceOrderAsc(categoryNo);
		return foodListByAsc;
	}
	
	@Override
	public List<Food> foodListByPriceOrderDesc(Integer categoryNo) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> foodListByDesc = foodMapper.foodListByPriceOrderDesc(categoryNo);
		return foodListByDesc;
	}


	@Override
	public List<Food> foodListByNameOrder(Integer categoryNo) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		FoodMapper foodMapper = sqlSession.getMapper(FoodMapper.class);
		List<Food> foodListByName = foodMapper.foodListByNameOrder(categoryNo);
		return foodListByName;
	}


}
