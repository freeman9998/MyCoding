package com.itwill.shop.user;

/*
 * 이름       널?       유형            
-------- -------- ------------- 
USERID   NOT NULL VARCHAR2(100) 
PASSWORD          VARCHAR2(100) 
NAME              VARCHAR2(100) 
EMAIL             VARCHAR2(100) 

 */
public class User {	
	private String userid;
	private String password;
	private String name;
	private String email;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String userid, String password, String name, String email) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.email = email;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
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
		return "User [userid=" + userid + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
