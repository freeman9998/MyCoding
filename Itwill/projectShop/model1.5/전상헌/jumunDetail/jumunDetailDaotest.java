package com.itwill.shop.jumunDetail;

public class jumunDetailDaotest {
	public static void main(String[] args) throws Exception{
		
		JumunDetailDao jumunDetailDao=new JumunDetailDao();
		//System.out.println(jumunDetailDao.insertDetail(1, 1, 6));
		System.out.println(jumunDetailDao.selectOneJumun(6));
		
	}

}
