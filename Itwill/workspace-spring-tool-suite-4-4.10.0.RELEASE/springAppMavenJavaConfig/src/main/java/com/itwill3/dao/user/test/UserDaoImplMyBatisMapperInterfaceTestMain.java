package com.itwill3.dao.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itwill3.dao.user.User;
import com.itwill3.dao.user.UserDao;

public class UserDaoImplMyBatisMapperInterfaceTestMain {

	public static void main(String[] args) throws Exception{
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(UserDaoImplMybatisMapperInterfaceConfig.class);
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		User user=new User("gggg","gggg","ggg@gmail.com","지지지");
		System.out.println("### "+userDao.create(user));
		user.setName("지변경");
		System.out.println("### "+userDao.update(user));
		System.out.println("### "+userDao.findUser("gggg"));
		System.out.println("### "+userDao.remove("gggg"));
		System.out.println("### "+userDao.findUserList());
	}

}
