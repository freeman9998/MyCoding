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
	
	//멤버필드 캡슐화
	private int no;
	private String name;
	private String phoneNumber;
	private Book book;
	
	//생성자 정의
	public BookMember() {
		
	}
	
	public BookMember(int no, String name, String phoneNumber, Book book) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.book = book;
	}




	//회원정보 출력 메소드
	
	public void headerPrint() {
		System.out.println("---------------------------회원 정보 출력-------------------------------");
		System.out.printf("%s %s %7s %7s %s %s %8s%n","회원번호","회원명","전화번호","대출도서", "책번호", "책분류", "설명");
		System.out.println("------------------------------------------------------------------------");
		}
	
	public void print() {
		System.out.printf("%5d %6s %s", this.no, this.name, this.phoneNumber);
		this.book.print();
	}

	
	//setter
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}

	
	
	
	

}
