package com.itwill03.포함;

public class DvdMember {
		//회원번호
		//회원이름
		//전화번호
		//빌린dvd
	private int no;
	private String name;
	private String tel;
	private Dvd dvd;
	
	public void headerprint() {
		System.out.println("-----------------------------Dvd Info-----------------------------");
		System.out.printf("%s %3s %9s %10s %5s %8s\n","회원번호","이름","전화번호","Dvd번호","타이틀","장르");
		System.out.println("------------------------------------------------------------------");		
	}
	
	public void print() {
		System.out.printf("%4d %7s %15s",this.no,this.name,this.tel);
		this.dvd.print();
	}

	//setter
	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
		
}
