package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.ProductMapper;
import com.itwill.shop.domain.Product;

public class ProductDaoImpl implements ProductDao{
	private SqlSessionFactory sqlSessionFactory;
	public ProductDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Product> list() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.list();
		return productList;
	}

	@Override
	public List<Product> listAllByDate() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listAllByDate();
		return productList;
	}

	@Override
	public List<Product> listAllByName() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listAllByName();
		return productList;
	}

	@Override
	public List<Product> listAllByLowPrice() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listAllByLowPrice();
		return productList;
	}

	@Override
	public List<Product> listAllByHighPrice() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listAllByHighPrice();
		return productList;
	}

	@Override
	public List<Product> listCategoryByDate(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listCategoryByDate(p_category);
		return productList;
	}

	@Override
	public List<Product> listCategoryByName(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listCategoryByName(p_category);
		return productList;
	}

	@Override
	public List<Product> listCategoryLowPrice(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listCategoryLowPrice(p_category);
		return productList;
	}

	@Override
	public List<Product> listCategoryHighPrice(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listCategoryHighPrice(p_category);
		return productList;
	}

	@Override
	public List<Product> listSubCategoryByDate(String p_subcategory) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listSubCategoryByDate(p_subcategory);
		return productList;
	}

	@Override
	public List<Product> listSubCategoryByName(String p_subcategory) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listSubCategoryByName(p_subcategory);
		return productList;
	}

	@Override
	public List<Product> listSubCategoryByLowPrice(String p_subcategory) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listSubCategoryByLowPrice(p_subcategory);
		return productList;
	}

	@Override
	public List<Product> listSubCategoryByHighPrice(String p_subcategory) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.listSubCategoryByHighPrice(p_subcategory);
		return productList;
	}
	@Override
	public Product findProductByNo(int p_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		Product product = productMapper.findProductByNo(p_no);
		return product;
	}
	@Override
	public List<Product> findProductByNameLike(String p_name) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.findProductByNameLike(p_name);
		return productList;
	}
	@Override
	public List<String> listSubCategoryByCategory(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<String> subcategoryList = productMapper.listSubCategoryByCategory(p_category);
		return subcategoryList;
	}
	@Override
	public List<Map> listSubCategoryByCategoryMap(String p_category) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Map> subcategoryMapList = productMapper.listSubCategoryByCategoryMap(p_category);
		return subcategoryMapList;
	}
	@Override
	public List<Map> listCategoryByCategoryMap() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Map> categoryMapList = productMapper.listCategoryByCategoryMap();
		return categoryMapList;
	}
	@Override
	public int getProductCount() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		int count = productMapper.getProductCount();
		return count;
	}
	@Override
	public List<Product> findProductList(@Param("start") int start,@Param("last") int last) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
		List<Product> productList = productMapper.findProductList(start, last);
		return productList;
	}
}
