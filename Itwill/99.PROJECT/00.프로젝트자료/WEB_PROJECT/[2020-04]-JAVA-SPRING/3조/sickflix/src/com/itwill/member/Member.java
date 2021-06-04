package com.itwill.member;

public class Member {
	
	private String m_id; 		//회원아이디
	private String m_password;  //회원비밀번호
	private String m_name;      //회원이름
	private String m_phone;     //회원 휴대전화	
	private String m_email;		//회원 이메일
	
	public Member() {
		
	}
	
	public Member(String m_id, String m_password, String m_name, String m_phone, String m_email) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_phone = m_phone;
		this.m_email = m_email;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public boolean isMatchPassword(String m_password2) {
		if(this.m_password.equals(m_password2)) {
			return true;
		} else {
			return false;
		}
	}                       		
	
}
