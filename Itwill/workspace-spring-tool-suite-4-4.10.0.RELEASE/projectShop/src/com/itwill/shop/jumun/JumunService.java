package com.itwill.shop.jumun;

import java.util.List;

public class JumunService {
	private JumunDao jumunDao;
	public JumunService() { 
		jumunDao=new JumunDao();
	}
	
	public List<Jumun> list(String sUserId)throws Exception{
		return jumunDao.list(sUserId);
	}
}
