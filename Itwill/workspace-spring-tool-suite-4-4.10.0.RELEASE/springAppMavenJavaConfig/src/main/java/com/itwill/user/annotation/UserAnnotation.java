package com.itwill.user.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserAnnotation {
	private String userId;
	private String password;
	private String name;
	private String email;
	public UserAnnotation() {
		System.out.println("#### UserAnnotation : 디폴트생성자호출");
		
	}
	@Autowired
	public UserAnnotation( @Value("guard") String  userId, @Value("1111") String password,@Value("김수한무") String name, @Value("guard@naver.com") String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
		System.out.println("#### UserAnnotation : UserAnnotation(String userId, String password, String name, String email) : 생성자호출");
		
	}
	public String getUserId() {
		return userId;
	}
	@Autowired
	public void setUserId(@Value("iamaprogrammer") String userId) {
		System.out.println("#### UserAnnotation.setUserId("+userId+")메쏘드호출");
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserAnnotation:"+userId+","+password+","+name+","+email;
	}
	/*
	 *패쓰워드 일치여부 검사 
	 */
	public boolean isMatchPassword(String password){
		boolean isMatch=false;
		if(this.password.equals(password)){
			isMatch=true;
		}
		return isMatch;
	}
	

}







