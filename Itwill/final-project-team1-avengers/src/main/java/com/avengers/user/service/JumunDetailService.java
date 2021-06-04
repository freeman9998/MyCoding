package com.avengers.user.service;

import java.util.List;

import com.avengers.user.dto.JumunDetail;

public interface JumunDetailService {

	int insertJumunDetail(JumunDetail jumunDetail);

	List<JumunDetail> selectJumunDetailByNo(int j_no);

	int deleteJumunDetail(int j_no);

	List<JumunDetail> findCompleteJumunDetail(int user_no);
}