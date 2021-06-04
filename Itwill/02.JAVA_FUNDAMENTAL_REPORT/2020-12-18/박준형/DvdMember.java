package com.itwill03.포함;


public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	
	private int accountNum;
	private String accountName;
	private String tellNum;
	private Dvd dvd;
	
	public DvdMember() {
		
	}

	public DvdMember(int accountNum, String accountName, String tellNum,Dvd dvd) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.tellNum = tellNum;
		this.dvd=dvd;
	}

//	public void setDvd(Dvd dvd) {
//		this.dvd = dvd;
//	}
	
	public void print() {
		System.out.println("회원번호:"+accountNum+" 회원명:"+accountName+" 전화번호:"+tellNum);
		System.out.printf("대영중인 dvd -> ");
		dvd.print();
	}
}
