package com.itwill.shop.util.review;

import java.util.List;

import com.itwill.shop.domain.Review;
import com.itwill.shop.util.review.PageMaker;

public class ReviewListPageMakerDto {
	public List<Review> reviewItemList;
	public PageMaker pageMaker;
	public int totRecordCount;
}
