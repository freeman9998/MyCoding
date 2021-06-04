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
	
	private int no;		//회원번호
	private String name;//회원이름
	private String hp;	//전화번호
	private Book brBook;//빌린책(Borrowed book)
	
	
	public void print() {
		System.out.println("=====================================");
		System.out.printf("%s %s %s%n", "회원번호", "   회원이름   ", "     전화번호     ");
		System.out.printf("%8d %10s %17s%n",this.no, this.name, this.hp);
		this.brBook.print();
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

	public Book getBrBook() {
		return brBook;
	}

	public void setBrBook(Book brBook) {
		this.brBook = brBook;
	}
	
	
}