package com.itwill3.dao;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.UserService;

public class SpringDataSourceMain {

	public static void main(String[] args) throws Exception{
		/*
		 * ApplicationContext[BeanFactory] 객체생성
		 *   - Spring Container객체생성
		 */
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(SpringDataSourceConfig.class);
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		DataSource apacheDataSource=(DataSource)applicationContext.getBean("apacheDataSource");
		System.out.println("### 1.ApacheDataSource:"+apacheDataSource);
		System.out.println("### 2.ApacheDataSource Connection:"+apacheDataSource.getConnection());
	
		
	}

}
