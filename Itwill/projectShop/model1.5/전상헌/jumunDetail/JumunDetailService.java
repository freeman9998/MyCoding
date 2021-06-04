package com.itwill.shop.jumunDetail;

import java.util.List;

public interface JumunDetailService {

	int insertDetail(int qty, int p_no, int j_no) throws Exception;

	List<JumunDetail> selectOneJumun(int j_no) throws Exception;

	boolean isDetailExist(int j_no) throws Exception;

}