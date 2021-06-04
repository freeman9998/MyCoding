package com.itwill0.annotation;

public class SpringApplicationContextMain {
	public static void main(String[] args) throws Exception {
		SpringApplicationContext applicationContext = 
				new SpringApplicationContext("com.itwill0.annotation.MemberService");
		
		MemberService memberService=(MemberService)applicationContext.getBean("MemberService");
		memberService.login();
	
	}
}