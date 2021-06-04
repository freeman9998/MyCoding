package com.itwill.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.itwill.hello.HelloDao;
import com.itwill.hello.HelloService;
import com.itwill.service.UserService;

/*
/*
application-config.xml을 대신할 java 클래스
 */
@Configuration
public class ApplicationContextConfig {
	/*
	<bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
    	<property name="basenames" value="messages/guest,messages/messages,messages/user"/>
    </bean>
    <bean id="userService" class="com.itwill.service.UserService">
    	<property name="messageSource"  ref="messageSource"/>
    </bean>
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasenames("messages/guest","messages/messages","messages/user");
		return messageSource;
	}
	@Bean
	public UserService userService() {
		UserService userService=new UserService();
		userService.setMessageSource(this.messageSource());
		return userService;
	}
	
	
	
	
	
	@Bean
	public HelloDao helloDao() {
		return new HelloDao();
	}

	@Bean
	public HelloService helloService() {
		HelloService helloService = new HelloService();
		helloService.setHelloDao(this.helloDao());
		return helloService;
	}
	
	

}
