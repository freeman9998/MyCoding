package com.itwill.shop.dao.test;

import com.itwill.shop.dao.ReviewDao;
import com.itwill.shop.dao.ReviewDaoImpl;
import com.itwill.shop.dao.UserInfoDao;
import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.Review;
import com.itwill.shop.domain.UserInfo;

public class ReviewDaoTestMain {
	public static void main(String[] args)throws Exception{
		ReviewDao reviewDao = new ReviewDaoImpl();
		UserInfo userInfo = new UserInfo("itwill4");
		Product product = new Product(62);
		
		//System.out.println("1.insert");
		reviewDao.insertReview(new Review(0, "리뷰입니다10.", 3, userInfo, product));
		//System.out.println(reviewDao);
		
	//	System.out.println("2.select All");
	//	System.out.println(reviewDao.selectReviewAll());
		
	//	System.out.println("3.select ID");
	//	System.out.println(reviewDao.selectReview("itwill3"));
		
	//	System.out.println("3-1.select No");
	//	System.out.println(reviewDao.selectReviewN(8));
		
	//	System.out.println("4.review score");
	//	System.out.println(String.format("%.1f",reviewDao.selectReviewStar(2)));
		
	//	System.out.println("5. review Check");
	//	System.out.println(reviewDao.selectReviewCheck(52));
		
	//	System.out.println("6. review Count");
	//	System.out.println(reviewDao.selectReviewCount(8));
	}
}
