package com.itwill2.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImpl;
import com.itwill.user.UserService;
import com.itwill.user.UserServiceImpl;

@Configuration
public class JavaConfig {
	@Bean("constructorUser0")
	public User user1() {
		return new User();
	}
	@Bean("constructorUser1")
	public User user2() {
		return new User("guard","1111","경미","guard@gmail.com");
	}
	/*
	<bean id="userDao" class="com.itwill.user.UserDaoImpl"/>
	<bean id="userService" class="com.itwill.user.UserServiceImpl">
		<constructor-arg ref="userDao" index="0"/>
	</bean>
	 */
	@Bean("userDao")
	public UserDao userDao1() {
		return new UserDaoImpl();
	}
	@Bean("userService")
	public UserService userService1() {
		return new UserServiceImpl(this.userDao1());
	}
	/*
	@Bean("userService")
	public UserService userService1(UserDao userDao) {
		return new UserServiceImpl(userDao);
	}
	*/
	
	/*
	 <!-- 2.Setter Injection -->
	<!-- set argument primitive type -->
	<bean id="setUser1" class="com.itwill.user.User">
		<property name="email" value="guard@gmail.com"/>
		<property name="name" value="가드"/>
		<property name="password" value="1111"/>
		<property name="userId" value="guard"/>
	</bean>
	<bean 
		id="setUser2" 
		p:email="guard@gmail.com"
		p:name="엑스맨"
		p:password="1111"
		p:userId="xxx"
		class="com.itwill.user.User" />
	*/
	@Bean("setUser1")
	public User user3() {
		User user=new User();
		user.setEmail("guard@naver.com");
		user.setUserId("guard");
		user.setName("가이드");
		user.setPassword("1111");
		return user;
	}
	@Bean("setUser2")
	public User user4() {
		User user=new User();
		user.setEmail("guard2@naver.com");
		user.setUserId("guard2");
		user.setName("가이드2");
		user.setPassword("2222");
		return user;
	}
	/*
	<!--set argument  reference type -->
	<bean id="setUserDao" class="com.itwill.user.UserDaoImpl"/>
	<bean id="setUserService" class="com.itwill.user.UserServiceImpl">
		<property name="userDao" ref="setUserDao"/>
	</bean>
	 */
	
	@Bean("setUserDao")
	public UserDao userDao2() {
		return new UserDaoImpl();
	}
	@Bean("setUserService")
	public UserService userService2(@Qualifier("setUserDao") UserDao userDao) {
		UserServiceImpl userService=new UserServiceImpl();
		userService.setUserDao(userDao);
		return userService;
	}
}
