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
	
	private int no;
	private String name;
	private String phone;
	private Book book;
	
	public BookMember() {
		
	}
	//Constructor	
	public BookMember(int no, String name, String phone, Book book) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.book = book;
	}



	//헤더프린트
	public void headerPrint() {
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.printf("%3s %7s %9s %7s %14s %9s %7s%n","회원번호","회원이름","전화번호","빌린책","번호","분류","설명");
		System.out.println("------------------------------------------------------------------------------------------");
	}
	public void print() {
		System.out.printf("%7s %7s %17s",this.no,this.name,this.phone);
		this.book.print();
	}
	
	//setter
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
		
	
}