package com.itwill04.array;

public class BookMember {
	
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	 */
	
	private int num;
	private String name;
	private String cellNum;
	private Book[] books;
	
	
	public BookMember() {//기본 생성자

	}
	
	

	/*
	<<기능>>
	  회원정보출력 
	 */
	
	
	
	public static void headPrint() {
		System.out.println("=================================================================================");
		System.out.println("회원번호   회원이름     전화번호    번호        제목        장르        설명");
		System.out.println("=================================================================================");
	}
	
	public void print() {
		for(int i = 0 ; i< books.length; i++) {
			System.out.printf("%4d %10s %15s", this.num, this.name, this.cellNum);
			books[i].printBookInfo();
		}
	}

	//getset메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellNum() {
		return cellNum;
	}

	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}


	public Book[] getBooks() {
		return books;
	}


	public void setBooks(Book[] books) {
		this.books = books;
	}


	
	
	
}