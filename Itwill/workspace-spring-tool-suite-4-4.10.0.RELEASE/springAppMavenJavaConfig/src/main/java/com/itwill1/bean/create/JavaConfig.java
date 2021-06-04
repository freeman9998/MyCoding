package com.itwill1.bean.create;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	/*
	 <!-- 생성시 기본생성자호출 -->
	<bean id="createBean1" class="com.itwill1.bean.create.CreateBean1" />
	*/
	@Bean
	public CreateBean1 createBean1() {
		return new CreateBean1();
	}
	/*
	<bean id="createBean2" class="com.itwill1.bean.create.CreateBean2" />
	*/
	@Bean
	public CreateBean2 createBean2() {
		return new CreateBean2();
	}
	/*
	<bean id="createBean3" class="com.itwill1.bean.create.CreateBean3" />
	*/
	@Bean
	public CreateBean3 createBean3() {
		return new CreateBean3();
	}
	/*
	<!-- scope[singleton] -->
	<bean id="singletonBean" scope="singleton"
		class="com.itwill1.bean.create.SingletonBean" />
	*/
	@Bean(value = "singletonBean")
	@Scope("singleton")
	public SingletonBean singletonBean() {
		return new SingletonBean();
	}
	/*
	<!-- init,Destroy -->
	<bean id="initDestroyBean" init-method="myInit"
		destroy-method="myDestroy"
		class="com.itwill1.bean.create.InitDestroyBean" />
	 */
	@Bean(value = "initDestroyBean",initMethod = "myInit",destroyMethod = "myDestroy")
	public InitDestroyBean initDestroyBean() {
		return new InitDestroyBean();
	}
}
