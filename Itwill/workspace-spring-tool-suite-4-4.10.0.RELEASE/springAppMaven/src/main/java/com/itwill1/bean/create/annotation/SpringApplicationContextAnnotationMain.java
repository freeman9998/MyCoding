package com.itwill1.bean.create.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextAnnotationMain {

	public static void main(String[] args) throws Exception{
		/*
		 * ApplicationContext[BeanFactory] 객체생성
		 *   - Spring Container객체생성
		 */
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext(
						"com/itwill1/bean/create/annotation/1.bean_create_annotation.xml");
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		CreateBean1 cb1=(CreateBean1)applicationContext.getBean("createBean1");
		CreateBean2 cb2=(CreateBean2)applicationContext.getBean("createBean2");
		CreateBean3 cb3=(CreateBean3)applicationContext.getBean("createBean3");
		System.out.println("### "+cb1);
		System.out.println("### "+cb2);
		System.out.println("### "+cb3);
		System.out.println("--------------------------scope[singleton] bean-----------------------");
		SingletonBean singletonBean1=(SingletonBean)applicationContext.getBean("singletonBean");
		SingletonBean singletonBean2=(SingletonBean)applicationContext.getBean("singletonBean");
		System.out.println(singletonBean1);
		System.out.println(singletonBean2);
		System.out.println("--------------------init-method,destroy-method----------------------");
		DisposableBean context=(DisposableBean)applicationContext;
		context.destroy();
		
	}

}
