package com.itwill.shop.jumunDetail;

import java.util.List;

public class jumunDetailService {
	private JumunDetailDao jumunDetailDao;
	public jumunDetailService() {
	jumunDetailDao=new JumunDetailDao()	;
	}
	
	public int insertDetail(int qty,int p_no,int j_no) throws Exception{
		return jumunDetailDao.insertDetail(qty, p_no, j_no);
	}
	public List<JumunDetail> selectOneJumun(int j_no) throws Exception{
		return jumunDetailDao.selectOneJumun(j_no);
	}
	public boolean isDetailExist(int j_no) throws Exception{
		
		return jumunDetailDao.isDetailExist(j_no);
	}
	

}
