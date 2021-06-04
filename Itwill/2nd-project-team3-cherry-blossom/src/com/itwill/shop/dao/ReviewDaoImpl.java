package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.ReviewMapper;
import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.Review;
import com.itwill.shop.domain.UserInfo;

public class ReviewDaoImpl implements ReviewDao{

	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE="com.mybatis3.dao.mapper.ReviewMapper.";

	public ReviewDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Review> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertReview(Review review) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		int count = reviewMapper.insertReview(review);
		sqlSession.commit();
		sqlSession.close();
		return count;
	}
	@Override
	public List<Review> selectReviewAll(){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		List<Review> count = reviewMapper.selectReviewAll();
		return count;
	}
	
	@Override
	public List<Review> selectReview(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		List<Review> reviewList = reviewMapper.selectReview(user_id);
		return reviewList;
	}
	@Override
	public List<Review> selectReviewN(int p_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		List<Review> reviewList = reviewMapper.selectReviewN(p_no);
		return reviewList;
	}
	@Override
	public double selectReviewStar(double p_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		double reviewStar = reviewMapper.selectReviewStar(p_no);
		return reviewStar;
	}
	@Override
	public int selectReviewCheck(int p_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		int reviewCheck = reviewMapper.selectReviewCheck(p_no);
		return reviewCheck;
	}
	@Override
	public int selectReviewCount(int p_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		int reviewCount = reviewMapper.selectReviewCount(p_no);
		return reviewCount;
	}
	@Override
	public List<Review> findReviewList( int start,int last, int p_no) {
		Map paramMap = new HashMap<String, Object>();
		paramMap.put("start", start);
		paramMap.put("last", last);
		paramMap.put("p_no", p_no);
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		List<Review> reviewList = reviewMapper.findReviewList(paramMap);
		return reviewList;
	}
	@Override
	public int getReviewCount() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ReviewMapper reviewMapper = sqlSession.getMapper(ReviewMapper.class);
		int count = reviewMapper.getReviewCount();
		return count;
	}
	
	
}
