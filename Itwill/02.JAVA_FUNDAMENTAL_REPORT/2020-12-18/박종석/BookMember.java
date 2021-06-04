package com.itwill02.constructor;

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
public class BookMember {
	private int id;
	private String name, tel;
	private Book book;

	public BookMember() {
	}

	public BookMember(int id, String name, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
	}

	public void headprint() {
		System.out.println("-----------------------------출력정보------------------------------------");
		System.out.println("회원번호 이름 전화번호 책번호 제목 분류 설명");
		System.out.println("---------------------------------------------------------------------------");

	}

	public void print() {
		System.out.printf("%5d %5s %5s", this.id, this.name, this.tel);
		this.book.print();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
