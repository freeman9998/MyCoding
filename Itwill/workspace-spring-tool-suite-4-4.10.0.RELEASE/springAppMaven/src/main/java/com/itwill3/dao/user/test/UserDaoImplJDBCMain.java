package com.itwill3.dao.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill3.dao.user.UserDao;



public class UserDaoImplJDBCMain {

	public static void main(String[] args) throws Exception{
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill3/dao/user/3.user_dao_jdbc.xml");
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		System.out.println("### "+userDao.findUserList());
	}

}
