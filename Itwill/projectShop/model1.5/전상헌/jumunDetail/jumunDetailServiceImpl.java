package com.itwill.shop.jumunDetail;

import java.util.List;

public class jumunDetailServiceImpl implements JumunDetailService {
	private JumunDetailDao jumunDetailDao;
	public jumunDetailServiceImpl() {
	jumunDetailDao=new JumunDetailDao()	;
	}
	
	@Override
	public int insertDetail(int qty,int p_no,int j_no) throws Exception{
		return jumunDetailDao.insertDetail(qty, p_no, j_no);
	}
	@Override
	public List<JumunDetail> selectOneJumun(int j_no) throws Exception{
		return jumunDetailDao.selectOneJumun(j_no);
	}
	@Override
	public boolean isDetailExist(int j_no) throws Exception{
		
		return jumunDetailDao.isDetailExist(j_no);
	}
	

}
