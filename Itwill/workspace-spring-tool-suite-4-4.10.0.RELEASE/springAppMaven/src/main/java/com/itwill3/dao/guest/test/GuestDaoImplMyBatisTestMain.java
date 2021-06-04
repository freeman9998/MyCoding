package com.itwill3.dao.guest.test;

import com.itwill3.dao.guest.GuestDao;
import com.itwill3.dao.guest.GuestDaoImplMyBatis;

public class GuestDaoImplMyBatisTestMain {

	public static void main(String[] args)throws Exception {
		
		GuestDao guestDao=new GuestDaoImplMyBatis();
		System.out.println("### "+guestDao.selectAll());
		System.out.println("### "+guestDao.selectByNo(107));
		
		/*
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext(
						"com/itwill3/dao/guest/3.guest_dao_mybatis.xml");
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		
		GuestDao guestDao=(GuestDao)applicationContext.getBean("guestDao");
		System.out.println("### "+guestDao.selectAll());
		System.out.println("### "+guestDao.selectByNo(107));
		*/
	}

}
