package com.itwill.shop.jumun;

import java.util.List;import com.itwill.shop.jumunDetail.JumunDetail;

public class JumunServiceImpl implements JumunService {
	private JumunDao jumunDao;
	public JumunServiceImpl() {
		jumunDao=new JumunDaoImpl();
	}
	
	@Override
	public int insert(String j_dsec,int j_price,String userid) throws Exception{
		
		return jumunDao.add(j_dsec, j_price, userid);
	}
	
	@Override
	public int delete (int j_no) throws Exception{
		return jumunDao.delete(j_no);
	}
	@Override
	public int allDelete (String userid) throws Exception{
		return jumunDao.allDelete(userid);
	}
	@Override
	public List<Jumun> selectById(String userid) throws Exception{
		return jumunDao.selectById(userid);
	}
	@Override
	public Jumun selectByNo(int  j_no) throws Exception{
		return jumunDao.selectByNo(j_no);
	}
	
	

}
