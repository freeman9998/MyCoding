package com.itwill03.포함;

public class DvdMember {
	/*
	 회원번호
	 회원이름
     전화번호
	 빌린dvd
	*/
	private int no;
	private String name;
	private String phoneNumber;
	private Dvd dvd;
	
	
	//생성자
	public DvdMember() {
		
	}

	public DvdMember(int no, String name, String phoneNumber, Dvd dvd) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dvd = dvd;
	}

	//출력
	
		public void headerprint() {
			System.out.println("-----------------회원 정보 출력------------------");
			System.out.printf("%s %s %7s %7s %3s %3s%n","번호","회원명","전화번호","DVD번호","DVD제목","장르");
			System.out.println("-------------------------------------------------");
		}
		
		public void print() {
			System.out.printf("%3d %4s %5s",this.no, this.name, this.phoneNumber);
			this.dvd.print();
		}
	
	//getter, setter
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	
	
}
