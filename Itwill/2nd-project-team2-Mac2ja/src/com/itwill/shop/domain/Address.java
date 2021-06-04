package com.itwill.shop.domain;

public class Address {
	
/*
 * 이름             널?       유형            
-------------- -------- ------------- 
ADDRESS_NO     NOT NULL NUMBER(10)    
ADDRESS_NAME            VARCHAR2(100) 
ADDRESS_DETAIL          VARCHAR2(100) 
ADDRESS_TYPE            NUMBER(10)    
MEMBERS_NO              NUMBER(10)   
 */
	
private int address_no;
private String address_name;
private String address_detail;
private int address_type;
private int members_no;

public Address() {
	
}

public Address(Integer address_no, String address_name, String address_detail, int address_type,
		int members_no) {
	super();
	this.address_no = address_no;
	this.address_name = address_name;
	this.address_detail = address_detail;
	this.address_type = address_type;
	this.members_no = members_no;
}
public Address(String address_name, String address_detail, int address_type,int members_no) {
	super();
	this.address_name = address_name;
	this.address_detail = address_detail;
	this.address_type = address_type;
	this.members_no = members_no;
}

public int getAddress_no() {
	return address_no;
}

public void setAddress_no(int address_no) {
	this.address_no = address_no;
}

public String getAddress_name() {
	return address_name;
}

public void setAddress_name(String address_name) {
	this.address_name = address_name;
}

public String getAddress_detail() {
	return address_detail;
}

public void setAddress_detail(String address_detail) {
	this.address_detail = address_detail;
}

public int getAddress_type() {
	return address_type;
}

public void setAddress_type(int address_type) {
	this.address_type = address_type;
}

public int getMembers_no() {
	return members_no;
}

public void setMembers_no(int members_no) {
	this.members_no = members_no;
}

@Override
public String toString() {
	return "Address [address_no=" + address_no + ", address_name=" + address_name + ", address_detail=" + address_detail
			+ ", address_type=" + address_type + ", members_no=" + members_no + "]";
}

}
