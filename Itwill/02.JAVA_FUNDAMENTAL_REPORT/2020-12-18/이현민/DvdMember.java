package com.itwill03.포함;


public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	
	private int no;
	private String name;
	private String phone;
	private Dvd dvd;
	
	public DvdMember() {
		
	}
	public DvdMember(int no, String name, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	public void headerPrint() {
		System.out.printf("-------------------회원정보출력---------------------%n");
		System.out.printf("%s %s %6s %9s %s %s %n",
				"회원번호","회원이름","전화번호","DVD번호","타이틀","장르");
		System.out.printf("----------------------------------------------------%n");
		return;
	}
	public void print() {
		System.out.printf("%5d %7s %14s",no,name,phone);
		dvd.print();
	}
	
	
	
	//getter,setter
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
}
