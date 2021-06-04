package com.itwill5.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserService;

public class SpringSchedulerMain {

	public static void main(String[] args) throws Exception{
		System.out.println("------------Spring Container 초기화시작---------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext(
						"com/itwill5/scheduler/5.spring_scheduler.xml");
		System.out.println("------------Spring Container 초기화끝---------");
		
	}

}
