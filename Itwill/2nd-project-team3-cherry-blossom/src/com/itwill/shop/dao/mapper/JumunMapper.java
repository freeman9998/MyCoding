package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Jumun;
import com.itwill.shop.domain.Jumun_detail;

public interface JumunMapper {
	
	public List<Jumun> selectAllById(String user_id);
	
	public int insertJumun(Jumun jumun);
	
	public int insertJumunDetail(Jumun_detail jumun_detail);
	
	public List<Jumun> detail(Integer j_no);
}

