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
	private int adminNum;
	private String adminName;
	private String tellNum;
	private Book book;
	
	public BookMember() {
		
	}
	
	public BookMember(int adminNum, String adminName, String tellNum) {
		this.adminNum = adminNum;
		this.adminName = adminName;
		this.tellNum = tellNum;
	}

	
	public void print() {
		System.out.println("회원번호: "+adminNum+" 회원명: "+adminName+" 연락처: "+tellNum);
		System.out.printf("대여중인 책: ");
		book.print();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
