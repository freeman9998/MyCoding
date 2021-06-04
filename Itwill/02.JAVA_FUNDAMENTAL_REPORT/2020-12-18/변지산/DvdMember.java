package com.itwill03.포함;


public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	private int hno;
	private String hname;
	private String phone;
	private Dvd dvd;
	
	public DvdMember() {
		
	}
	public DvdMember(int hno, String hname, String phone, Dvd dvd) {
		this.hno = hno;
		this.hname = hname;
		this.phone = phone;
		this.dvd = dvd;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
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
	void headprint() {
		System.out.println("------------------------대출대장------------------------");
		System.out.printf("%s %s %4s %7s %5s %6s%n","회원번호","회원이름","연락처","번호","제목","장르");
		System.out.println("--------------------------------------------------------");
	}
	void print() {
		System.out.printf("%4d %8s %s   ", this.hno, this.hname, this.phone);
		this.dvd.dprint();
	}
	
}
