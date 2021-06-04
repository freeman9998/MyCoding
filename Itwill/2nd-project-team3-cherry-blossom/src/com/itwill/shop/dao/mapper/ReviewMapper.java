package com.itwill.shop.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.Review;
import com.itwill.shop.domain.UserInfo;

public interface ReviewMapper {
	//
	public int insertReview(Review review);
	
	public List<Review> selectReviewAll();
	
	public List<Review> selectReview(String user_id);
	
	public List<Review> selectReviewN(int p_no);
	
	public double selectReviewStar(double p_no);
	
	public int selectReviewCheck(int p_no);
	
	public int selectReviewCount(int p_no);
	
	public int getReviewCount();
	
	public List<Review> findReviewList(Map paramMap);
}
