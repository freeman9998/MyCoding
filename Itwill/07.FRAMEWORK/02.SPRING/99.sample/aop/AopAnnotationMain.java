package com.itwill10.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.UserDao;
import com.itwill.user.UserService;

public class AopAnnotationMain {
	public static void main(String[] args) throws Exception{
		System.out.println("-------------ApplicationContext 초기화전------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("10-02.aop_basic_annotation.xml");
		System.out.println("-------------ApplicationContext 초기화후------------");
		System.out.println("1.----profiling around advice----");
		UserService userService=(UserService)applicationContext.getBean("userService");
		userService.update(null);
		userService.remove(null);
		userService.create(null);
		userService.findUser(null);
		userService.login(null,null);
		
		

	}

}
