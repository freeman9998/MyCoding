package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	<<기능>>
	  회원정보출력 
	 */
	private int mno;
	private String mname;
	private String phone;
	private Book takeb;
	private Book takeb2;
	public BookMember() {
		
	}
	public void BookMember(int mno, String mname, String phone, Book takeb) {
		this.mno = mno;
		this.mname = mname;
		this.phone = phone;
		this.takeb = takeb;
	} 
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Book getTakeb() {
		return takeb;
	}
	public void setTakeb(Book takeb) {
		this.takeb = takeb;
	}
	public Book getTakeb2() {
		return takeb2;
	}
	public void setTakeb2(Book takeb2) {
		this.takeb2 = takeb2;
	}
	void headprint() {
		System.out.println("--------------------------도서대장------------------------------");
		System.out.printf("%s %s %s %7s %s %s %s%n","회원번호","회원이름","연락처","도서번호","도서이름","도서분류","도서설명");
		System.out.println("----------------------------------------------------------------");
		
		
		
	}
	
	void print() {
		System.out.printf("%5d %7s %s  ", this.mno, this.mname, this.phone);
		this.takeb.bprint();
	}
	void print1() {
		System.out.printf("%5d %7s %s  ", this.mno, this.mname, this.phone);
		this.takeb2.bprint();
		
	}
	
	
}
