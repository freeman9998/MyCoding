package com.itwill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.itwill.controller.annotation.XMLView;
import com.itwill.hello.HelloService;
import com.itwill.hello.controller.HelloController;
/*
mvc-config.xml을 대신할 java 클래스
  ◆ @EnableWebMvc: 
  		- web mvc을 이용하는데 있어서 spring container가 가져야할 기본적인 bean component 등록. 
    	- 빠르고 편하게 mvc을 구축할수 있는 configuration 환경 제공[<mvc:annotation-driven/>]
    	- WebMvcConfigurationSupport 클래스가 자동으로 필요한Bean들을 등록한다. Mvc Java Config 설정에서 설정을 제공하는 주요 클래스
  		
  ◆ WebMvcConfigurer 인터페이스: 기본 설정 이외의 설정이 필요할 경우 해당 클래스 상속 받은 후 오버라이딩하여 구현.
  ◆ @ComponentScan: Controller, Service, Repository, Component 어노테이션이 붙을 클래스를 찾아 스프링 컨테이너가 관리
*/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.itwill.controller.annotation" })
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter {
	@Bean(name = "/hello.do")
	public HelloController helloController(HelloService helloService) {
		HelloController helloController = new HelloController();
		helloController.setHelloService(helloService);
		return helloController;
	}
	/*
	 <!-- View객체등록[XMLView] -->
		<bean id="xmlView"
			class="com.itwill.controller.annotation.XMLView" />
	 */
	@Bean
	public XMLView xmlView() {
		return new XMLView();
	}
	/*
	<bean
		class="org.springframework.web.servlet.view.BeanNameViewResolver">
		<property name="order" value="0" />
	</bean>
	<bean id="myInternalResourceViewResolver"
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="order" value="1" />
		<property name="prefix" value="/WEB-INF/views/" />
		<property name="suffix" value=".jsp" />
	</bean>
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		BeanNameViewResolver beanNameViewResolver=new BeanNameViewResolver();
		beanNameViewResolver.setOrder(0);
		
		InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setOrder(1);
		registry.viewResolver(beanNameViewResolver);
		registry.viewResolver(internalResourceViewResolver);
	}

	
}













