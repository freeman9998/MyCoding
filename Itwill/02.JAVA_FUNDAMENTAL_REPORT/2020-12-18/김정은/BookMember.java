/*
	캡슐화 하세요.
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	<<기능>>
	  회원정보출력 
*/
package com.itwill03.포함;

public class BookMember {
	private int no;
	private String name;
	private String number;
	private Book book;

	public BookMember() {

	}

	public void headprint() {
		System.out.println("----------회원정보출력----------");
		System.out.printf("%5s %5s %5s%n", "회원번호", "회원이름", "전화번호");
		System.out.println("--------------------------------");
	}

	public void print() {
		System.out.printf("%5d %10s %15s%n ", this.no, this.name, this.number);
		System.out.println("-------------책정보-------------");

		this.book.print();
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



	public void setBook(Book book) {
		this.book = book;
	}
	

	
	
	

}
