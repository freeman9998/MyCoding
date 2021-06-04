package com.itwill.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.Review;
import com.itwill.shop.domain.UserInfo;


public interface ReviewDao {
	List<Review> list();
	
	/**************insert*********************/
	int insertReview(Review review);
	
	/***************select*********************/
	List<Review> selectReviewAll();
	
	List<Review> selectReview(String user_id);
	
	List<Review> selectReviewN(int p_no);
	
	double selectReviewStar(double p_no);
	
	int selectReviewCheck(int p_no);
	
	int selectReviewCount(int p_no);
	
	public int getReviewCount();
	
	public List<Review> findReviewList(int start, int last,int p_no);

}
