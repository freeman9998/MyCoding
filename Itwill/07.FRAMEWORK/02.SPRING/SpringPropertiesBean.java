package com.itwill13.properties;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;

public class SpringPropertiesBean {
	String prop1;
	String prop2;
	String prop3;
	String prop4;
	@Value("#{user['user.remove.message']}")
	String prop5;
	
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
	public String getProp3() {
		return prop3;
	}
	public void setProp3(String prop3) {
		this.prop3 = prop3;
	}
	public String getProp4() {
		return prop4;
	}
	public void setProp4(String prop4) {
		this.prop4 = prop4;
	}
	MessageSource messageSource;
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public void messageSource(){
		System.out.println("-----------ResourceBundleMessageSource---------");
		//user.existed.exception = {0}는 존재하는 아이디 입니다.
		String msg=messageSource.getMessage("user.existed.exception", 
				new Object[]{"guard"}, Locale.KOREA);
		System.out.println("kor msg:"+msg);
		msg=messageSource.getMessage("user.existed.exception", 
				new Object[]{"guard"}, Locale.ENGLISH);
		System.out.println("eng msg:"+msg);
		msg=messageSource.getMessage("user.existed.exception", 
				new Object[]{"guard"}, Locale.getDefault());
		System.out.println("default msg:"+msg);
		msg=messageSource.getMessage("haha.hoho", 
				new Object[]{"guard"},"그런키는없네요" ,Locale.getDefault());
		System.out.println("no key msg:"+msg);
		msg=messageSource.getMessage("404.error", 
				new Object[]{"index.jsp"},"그런키는없네요" ,Locale.getDefault());
		System.out.println("messages msg:"+msg);
	}
	
	
}
