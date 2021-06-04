package com.itwill.shop.domain;

/*
이름               널?       유형            
---------------- -------- ------------- 
MEMBERS_NO       NOT NULL NUMBER(10)    
MEMBERS_NAME              VARCHAR2(100) 
MEMBERS_EMAIL             VARCHAR2(100) 
MEMBERS_PASSWORD          VARCHAR2(100) 
MEMBERS_PHONE             VARCHAR2(30)  
 */
public class Members {
	private int members_no;
	private String members_name;
	private String members_email;
	private String members_password;
	private String members_phone;
	
	public Members() {
		// TODO Auto-generated constructor stub
	}

	public Members(int members_no, String members_name, String members_email, String members_password,
			String members_phone) {
		super();
		this.members_no = members_no;
		this.members_name = members_name;
		this.members_email = members_email;
		this.members_password = members_password;
		this.members_phone = members_phone;
	}

	public int getMembers_no() {
		return members_no;
	}

	public void setMembers_no(int members_no) {
		this.members_no = members_no;
	}

	public String getMembers_name() {
		return members_name;
	}

	public void setMembers_name(String members_name) {
		this.members_name = members_name;
	}

	public String getMembers_email() {
		return members_email;
	}

	public void setMembers_email(String members_email) {
		this.members_email = members_email;
	}

	public String getMembers_password() {
		return members_password;
	}

	public void setMembers_password(String members_password) {
		this.members_password = members_password;
	}

	public String getMembers_phone() {
		return members_phone;
	}

	public void setMembers_phone(String members_phone) {
		this.members_phone = members_phone;
	}

	@Override
	public String toString() {
		return "Members [members_no=" + members_no + ", members_name=" + members_name + ", members_email="
				+ members_email + ", members_password=" + members_password + ", members_phone=" + members_phone + "]";
	}
	/*
	 * 패스워드 일치여부 검사
	 */
	public boolean isMatchPassword(String password) {
		boolean isMatch=false;
		if (this.members_password.equals(password)) {
			isMatch=true;
		}
		return isMatch;		
	}
	
}

