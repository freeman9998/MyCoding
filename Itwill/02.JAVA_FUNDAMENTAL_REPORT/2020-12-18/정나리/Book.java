package com.itwill04.array;

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
	 */
	
	private int bookNum;
	private String bookTitle;
	private String bookGenre;
	private String bookInfo;
	
	
	public Book() { //기본 생성자

	}
	
	public Book(int bookNum, String bookTitle, String bookGenre, String bookInfo) {
		//인자 5개 짜리 생성자
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookInfo = bookInfo;
	}

	
	
	
	/*
	 * <<기능>>
	 *   책정보출력 메소드
	 *   
	 */
	
	
	public void printBookInfo() {
		System.out.printf("%6d %9s %6s %9s%n",this.bookNum,this.bookTitle, this.bookGenre, this.bookInfo);

	}
	
	
	//getset 메소드
	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	
	
	
	
	
}