package com.itwill.shop.jumun;

import java.util.List;import com.itwill.shop.jumunDetail.JumunDetail;

public class JumunService {
	private JumunDao jumunDao;
	public JumunService() {
		jumunDao=new JumunDao();
	}
	
	public int insert(String j_dsec,int j_price,String userid) throws Exception{
		
		return jumunDao.add(j_dsec, j_price, userid);
	}
	
	public int delete (int j_no) throws Exception{
		return jumunDao.delete(j_no);
	}
	public int allDelete (String userid) throws Exception{
		return jumunDao.allDelete(userid);
	}
	public List<Jumun> selectById(String userid) throws Exception{
		return jumunDao.selectById(userid);
	}
	public Jumun selectByNo(int  j_no) throws Exception{
		return jumunDao.selectByNo(j_no);
	}
	
	

}
