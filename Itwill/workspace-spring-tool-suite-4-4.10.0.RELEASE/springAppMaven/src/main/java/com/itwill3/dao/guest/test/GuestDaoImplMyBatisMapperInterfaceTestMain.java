package com.itwill3.dao.guest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill3.dao.guest.GuestDao;
import com.itwill3.dao.guest.GuestDaoImplMyBatis;
import com.itwill3.dao.guest.GuestDaoImplMyBatisMapperInterface;

public class GuestDaoImplMyBatisMapperInterfaceTestMain {

	public static void main(String[] args)throws Exception {
		
		GuestDao guestDao=new GuestDaoImplMyBatisMapperInterface();
		System.out.println("### "+guestDao.selectAll());
		System.out.println("### "+guestDao.selectByNo(107));
		
		/*
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext(
						"com/itwill3/dao/guest/3.guest-dao_mybatis_mapper_interface.xml");
		GuestDao guestDao=(GuestDao)applicationContext.getBean("guestDao");
		System.out.println("### "+guestDao.selectAll());
		System.out.println("### "+guestDao.selectByNo(51));
		*/
	}

}
