package com.itwill.shop.domain;
/*
이름           널?       유형            
------------ -------- ------------- 
USER_ID      NOT NULL VARCHAR2(100) 
PASSWORD              VARCHAR2(100) 
USER_NAME             VARCHAR2(100) 
USER_ADDRESS          VARCHAR2(255) 
USER_PHONE            NUMBER(20)    
EMAIL                 VARCHAR2(100) 
 */
public class UserInfo {
	private String user_id;
	private String password;
	private String user_name;
	private String user_address;
	private String user_phone;
	private String email;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String user_id, String password, String user_name, String user_address, String user_phone,
			String email) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_phone = user_phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", password=" + password + ", user_name=" + user_name
				+ ", user_address=" + user_address + ", user_phone=" + user_phone + ", email=" + email + "]";
	}
	public UserInfo(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/* 패쓰워드일치확인 */
	public boolean isMatchPassword(String password){
		boolean isMatch=false;
		if(this.password.equals(password)){
			isMatch=true;
		}
		return isMatch;
	}
}
