package com.itwill03.포함;

public class DvdMember {
	// 회원번호
	// 회원이름
	// 전화번호
	// 빌린dvd
	private int no;
	private String name;
	private String number;
	private Dvd dvd;

	public DvdMember() {

	}

	public void headprint() {
		System.out.println("-----------회원정보------------");
		System.out.printf("%5s %5s %5s%n", "회원번호", "회원이름", "전화번호");
		System.out.println("-------------------------------");
	}

	public void print() {
		System.out.printf("%5d %10s %13s %n", this.no, this.name, this.number);
		this.dvd.headprint();
		this.dvd.print();
	}
	//setter

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

}
