package com.itwill2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.UserService;

public class SpringApplicationMain {

	public static void main(String[] args) throws Exception{
		/*
		 * ApplicationContext[BeanFactory] 객체생성
		 *   - Spring Container객체생성
		 */
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill2/di/2.bean_dependency.xml");
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		UserService userService =(UserService)applicationContext.getBean("userService");
		userService.findUser(null);
		
		UserService setUserService =(UserService)applicationContext.getBean("setUserService");
		setUserService.findUser(null);
	}

}
