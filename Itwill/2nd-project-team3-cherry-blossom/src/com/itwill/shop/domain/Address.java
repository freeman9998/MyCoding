package com.itwill.shop.domain;
/*
이름         널?       유형            
---------- -------- ------------- 
A_NO       NOT NULL NUMBER(30)    
AO_NAME             VARCHAR2(255) 
AD_NAME             VARCHAR2(255) 
AD_ADDRESS          VARCHAR2(255) 
AD_MESSAGE          VARCHAR2(255) 
J_NO                NUMBER(30) 
 */
public class Address {
	private int a_no;
	private String ao_name;
	private String ad_name;
	private String ad_address;
	private String ad_phone;
	private String ad_message;
	private int j_no;
	private Jumun jumun;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int a_no, String ao_name, String ad_name, String ad_address, String ad_phone, String ad_message,
			int j_no) {
		super();
		this.a_no = a_no;
		this.ao_name = ao_name;
		this.ad_name = ad_name;
		this.ad_address = ad_address;
		this.ad_phone = ad_phone;
		this.ad_message = ad_message;
		this.j_no = j_no;
	}

	public Address(int a_no, String ao_name, String ad_name, String ad_address, String ad_phone, String ad_message,
			Jumun jumun) {
		super();
		this.a_no = a_no;
		this.ao_name = ao_name;
		this.ad_name = ad_name;
		this.ad_address = ad_address;
		this.ad_phone = ad_phone;
		this.ad_message = ad_message;
		this.jumun = jumun;
	}

	public int getJ_no() {
		return j_no;
	}

	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}

	public int getA_no() {
		return a_no;
	}

	public void setA_no(int a_no) {
		this.a_no = a_no;
	}

	public String getAo_name() {
		return ao_name;
	}

	public void setAo_name(String ao_name) {
		this.ao_name = ao_name;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}

	public String getAd_address() {
		return ad_address;
	}

	public void setAd_address(String ad_address) {
		this.ad_address = ad_address;
	}

	public String getAd_phone() {
		return ad_phone;
	}

	public void setAd_phone(String ad_phone) {
		this.ad_phone = ad_phone;
	}

	public String getAd_message() {
		return ad_message;
	}

	public void setAd_message(String ad_message) {
		this.ad_message = ad_message;
	}

	public Jumun getJumun() {
		return jumun;
	}

	public void setJumun(Jumun jumun) {
		this.jumun = jumun;
	}

	@Override
	public String toString() {
		return "Address [a_no=" + a_no + ", ao_name=" + ao_name + ", ad_name=" + ad_name + ", ad_address=" + ad_address
				+ ", ad_phone=" + ad_phone + ", ad_message=" + ad_message + ", j_no=" + j_no + ", jumun=" + jumun + "]";
	}

	
	
	
}
