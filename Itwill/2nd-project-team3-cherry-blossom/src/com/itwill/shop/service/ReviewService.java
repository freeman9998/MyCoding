package com.itwill.shop.service;

import java.util.List;
import java.util.Map;

import com.itwill.shop.dao.ReviewDao;
import com.itwill.shop.dao.ReviewDaoImpl;
import com.itwill.shop.util.review.ReviewListPageMakerDto;
import com.itwill.shop.domain.Product;
import com.itwill.shop.domain.Review;
import com.itwill.shop.domain.UserInfo;
import com.itwill.shop.util.review.PageCalculator;
import com.itwill.shop.util.review.PageInputDto;
import com.itwill.shop.util.review.PageMaker;
import com.itwill.shop.util.review.ReviewListPageDto;
import com.sun.webkit.PageCache;

public class ReviewService {
	private static ReviewService _instance=null;
	private ReviewDao reviewDao;
	
	private ReviewService() throws Exception {
		reviewDao = new ReviewDaoImpl();
	}
	public static ReviewService getInstance() throws Exception {
		if(_instance==null) {
			_instance = new ReviewService();
		}
		return _instance;
	}
	//리뷰 생성
	public int insertReview(Review review)throws Exception{
		return reviewDao.insertReview(review);
	}
	//리뷰 전체 조회
	public List<Review> selectReviewAll()throws Exception{
		return reviewDao.selectReviewAll();
	}
	public List<Review> selectReview(String user_id)throws Exception{
		return reviewDao.selectReview(user_id);
	}
	public List<Review> selectReviewN(int p_no)throws Exception{
		return reviewDao.selectReviewN(p_no);
	}
	public double selectReviewStar(double p_no)throws Exception{
		return reviewDao.selectReviewStar(p_no);
	}
	public int selectReviewCheck(int p_no)throws Exception{
		return reviewDao.selectReviewCheck(p_no);
	}
	public ReviewListPageMakerDto findReviewList(int p_no, int currentPage)throws Exception{
		// 특정 상품의 리뷰 갯수
		int totReviewCount = reviewDao.getReviewCount();
		// 페이지 계산
		PageMaker pageMaker = new PageMaker(totReviewCount, currentPage);
		// 리뷰 데이터 
		List<Review> reviewList = reviewDao.findReviewList(pageMaker.getPageBegin(), pageMaker.getPageEnd(),p_no);
		ReviewListPageMakerDto reviewListPageMakerDto = new ReviewListPageMakerDto();
		reviewListPageMakerDto.totRecordCount = totReviewCount;
		reviewListPageMakerDto.reviewItemList = reviewList;
		reviewListPageMakerDto.pageMaker = pageMaker;
		return reviewListPageMakerDto;
	}
}
