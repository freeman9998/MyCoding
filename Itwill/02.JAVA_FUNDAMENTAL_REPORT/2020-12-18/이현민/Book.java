package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int bookNo;
	private String bookName;
	private String bookCategory;
	private String bookIntroduction;
	
	public Book() {
		
	}
	public Book(int bookNo, String bookName, String bookCategory, String bookIntroduction) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookIntroduction = bookIntroduction;
	}


	public void print() {
		System.out.printf("%3d\t %-8s",this.bookNo,this.bookName);
		System.out.printf("%-4s %s %n",this.bookCategory,this.bookIntroduction);
	}
	//getter,setter
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookIntroduction() {
		return bookIntroduction;
	}
	public void setBookIntroduction(String bookIntroduction) {
		this.bookIntroduction = bookIntroduction;
	}
	
	
}
