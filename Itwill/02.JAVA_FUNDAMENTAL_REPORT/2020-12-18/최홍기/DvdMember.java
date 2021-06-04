package com.itwill03.포함;


public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	private int no;
	private String name;
	private String phoneNo;
	private Dvd brDvd;
	public DvdMember() {
		
	}
	public DvdMember(int no, String name, String phoneNo, Dvd brDvd) {
		this.no = no;
		this.name = name;
		this.phoneNo = phoneNo;
		this.brDvd = brDvd;
	}
	public void print() {
		System.out.println("=====================================");
		System.out.printf("%s %s %s%n", "회원번호", "   회원이름   ", "     전화번호     ");
		System.out.println(this.no + this.name + this.phoneNo);
		this.brDvd.print();	
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Dvd getBrDvd() {
		return brDvd;
	}
	public void setBrDvd(Dvd brDvd) {
		this.brDvd = brDvd;
	}
	
}