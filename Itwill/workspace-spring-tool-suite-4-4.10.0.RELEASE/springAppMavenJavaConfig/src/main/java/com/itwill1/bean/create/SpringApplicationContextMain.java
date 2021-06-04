package com.itwill1.bean.create;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextMain {

	public static void main(String[] args) throws Exception{
		/*
		 * ApplicationContext[BeanFactory] 객체생성
		 *   - Spring Container객체생성
		 */
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		System.out.println("--------------------scope[singleton]--------------------------");
		SingletonBean singletonBean1=(SingletonBean)applicationContext.getBean("singletonBean");
		SingletonBean singletonBean2=(SingletonBean)applicationContext.getBean("singletonBean");
		System.out.println(singletonBean1);
		System.out.println(singletonBean2);
		
		System.out.println("-------------------init-method,destroy-method------------------------");
		DisposableBean context=(DisposableBean)applicationContext;
		context.destroy();
		
		
	}

}
