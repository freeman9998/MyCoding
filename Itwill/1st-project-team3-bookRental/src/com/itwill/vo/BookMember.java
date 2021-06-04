package com.itwill.vo;

import java.sql.Date;

public class BookMember {
	private String member_id;
	private String member_password;
	private String member_name;
	private String member_birthday;
	private String member_phone_1;
	private String member_phone_2;
	private String member_phone_3;
	private String member_email_1;
	private String member_email_2;	
	private Date member_regdate;
	private int member_count;
	private int member_penalty;
	
	public BookMember() {
	}

	public BookMember(String member_id, String member_password, String member_name, String member_birthday,
			String member_phone_1, String member_phone_2, String member_phone_3, String member_email_1,
			String member_email_2, Date member_regdate, int member_count, int member_penalty) {
		super();
		this.member_id = member_id;
		this.member_password = member_password;
		this.member_name = member_name;
		this.member_birthday = member_birthday;
		this.member_phone_1 = member_phone_1;
		this.member_phone_2 = member_phone_2;
		this.member_phone_3 = member_phone_3;
		this.member_email_1 = member_email_1;
		this.member_email_2 = member_email_2;
		this.member_regdate = member_regdate;
		this.member_count = member_count;
		this.member_penalty = member_penalty;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_birthday() {
		return member_birthday;
	}

	public void setMember_birthday(String member_birthday) {
		this.member_birthday = member_birthday;
	}

	public String getMember_phone_1() {
		return member_phone_1;
	}

	public void setMember_phone_1(String member_phone_1) {
		this.member_phone_1 = member_phone_1;
	}

	public String getMember_phone_2() {
		return member_phone_2;
	}

	public void setMember_phone_2(String member_phone_2) {
		this.member_phone_2 = member_phone_2;
	}

	public String getMember_phone_3() {
		return member_phone_3;
	}

	public void setMember_phone_3(String member_phone_3) {
		this.member_phone_3 = member_phone_3;
	}

	public String getMember_email_1() {
		return member_email_1;
	}

	public void setMember_email_1(String member_email_1) {
		this.member_email_1 = member_email_1;
	}

	public String getMember_email_2() {
		return member_email_2;
	}

	public void setMember_email_2(String member_email_2) {
		this.member_email_2 = member_email_2;
	}

	public Date getMember_regdate() {
		return member_regdate;
	}

	public void setMember_regdate(Date member_regdate) {
		this.member_regdate = member_regdate;
	}

	public int getMember_count() {
		return member_count;
	}

	public void setMember_count(int member_count) {
		this.member_count = member_count;
	}

	public int getMember_penalty() {
		return member_penalty;
	}

	public void setMember_penalty(int member_penalty) {
		this.member_penalty = member_penalty;
	}

	@Override
	public String toString() {
		return "BookMember [member_id=" + member_id + ", member_password=" + member_password + ", member_name="
				+ member_name + ", member_birthday=" + member_birthday + ", member_phone_1=" + member_phone_1
				+ ", member_phone_2=" + member_phone_2 + ", member_phone_3=" + member_phone_3 + ", member_email_1="
				+ member_email_1 + ", member_email_2=" + member_email_2 + ", member_regdate=" + member_regdate
				+ ", member_count=" + member_count + ", member_penalty=" + member_penalty + "]";
	}
}
