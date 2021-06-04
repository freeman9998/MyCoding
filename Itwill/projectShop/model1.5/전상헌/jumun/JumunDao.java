package com.itwill.shop.jumun;

import java.util.List;

public interface JumunDao {

	int add(String j_dsec, int j_price, String userid) throws Exception;

	int delete(int j_no) throws Exception;

	int allDelete(String userid) throws Exception;

	List<Jumun> selectById(String userid) throws Exception;

	Jumun selectByNo(int j_no) throws Exception;

}