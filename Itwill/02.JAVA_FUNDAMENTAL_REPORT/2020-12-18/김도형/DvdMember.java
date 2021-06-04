package com.itwill03.포함;


public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	private int memberNo;
	private String memberName;
	private String phoneNo;
	public Dvd dvd;
	
	public DvdMember() {
		
	}
	
	//Constructor	
	public DvdMember(int memberNo, String memberName, String phoneNo, Dvd dvd) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.phoneNo = phoneNo;
		this.dvd = dvd;
	}

	public void headerPrint() {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%1s %5s %7s %14s %9s %7s%n","회원번호","회원이름","전화번호","DVD번호","타이틀","장르");
		System.out.println("------------------------------------------------------------------------------------");
	}
	
	public void print() {
		System.out.printf("%7s %7s %14s",this.memberNo,this.memberName,this.phoneNo);
		this.dvd.print();
		
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	//setter
	
	
	
	
}