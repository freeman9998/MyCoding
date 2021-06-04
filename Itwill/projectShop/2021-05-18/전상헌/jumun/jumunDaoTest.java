package com.itwill.shop.jumun;

public class jumunDaoTest {

	public static void main(String[] args)  throws Exception{
		JumunDao jumunDao=new JumunDao();
		
		//System.out.println(jumunDao.add("김치외 2종", 1000, "aa"));
		//System.out.println(jumunDao.delete(3));
		//System.out.println(jumunDao.allDelete("aa"));
		System.out.println(jumunDao.selectById("aa"));
		System.out.println(jumunDao.selectByNo(6));
		
		
	}
	
	
}
