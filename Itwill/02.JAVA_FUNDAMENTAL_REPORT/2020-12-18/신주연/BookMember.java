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
	private String hp;
	private Book book;
	
	public BookMember() {
	}
	
	public BookMember(int no,String name,String hp) {
		this.no = no;
		this.name = name;
		this.hp = hp;
		
	}
	
	public void headerPrint() {
		System.out.println("---------------------------------------------");
		System.out.println("번호 이름 핸드폰 책번호 책이름 책분류 책설명");
		System.out.println("---------------------------------------------");
	}
	
	public void print() {
		System.out.print(this.no+" "+this.name+" "+this.hp+" ");
		this.book.print();
	}
	
	public void setBook(Book book) {
		this.book = book;
	}

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

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public Book getBook() {
		return book;
	}
	
	
}
