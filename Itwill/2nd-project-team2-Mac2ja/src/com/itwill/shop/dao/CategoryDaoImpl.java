package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CategoryMapper;
import com.itwill.shop.domain.Category;
import com.itwill.shop.domain.Comments;

public class CategoryDaoImpl implements CategoryDao {
	
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE = "com.itwill.shop.dao.mapper.CategoryMapper.";
	public CategoryDaoImpl() throws Exception{
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
	public Category findCategoryByno(Integer categoryNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		Category category = categoryMapper.findCategoryByno(categoryNo);
		return category;
	}
	@Override
	public List<Category> findCategoryAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		List<Category> categoryList = categoryMapper.findCategoryAll();
		return categoryList;
	}
	@Override
	public int insertCategory(Category category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		int insertRow = categoryMapper.insertCategory(category);
		return insertRow;
	}
	
	@Override
	public int insertCommentsChild(Comments comments) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateCategoryByNo(Category category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		int updateRow = categoryMapper.updateCategoryByNo(category);
		return updateRow;
	}
	@Override
	public int deleteCategoryByNo(Integer categoryNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
		int deleteRow = categoryMapper.deleteCategoryByNo(categoryNo);
		return deleteRow;
	}
	
}
