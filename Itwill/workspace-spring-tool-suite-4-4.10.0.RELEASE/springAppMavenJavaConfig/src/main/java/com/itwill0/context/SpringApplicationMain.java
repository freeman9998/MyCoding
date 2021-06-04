package com.itwill0.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationMain {

	public static void main(String[] args) {
		/*
		 * ApplicationContext[BeanFactory] 객체생성
		 *   - Spring Container객체생성
		 */
		System.out.println("---------------------Spring Container초기화시작---------------------------------");
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("---------------------Spring Container초기화끝---------------------------------");
		ProductService productService =(ProductService)applicationContext.getBean("productService");
		System.out.println("### "+productService.productList());

	}

}
