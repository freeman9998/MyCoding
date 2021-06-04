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
	private int bookNum;
	private String bookName;
	private String bookType;
	private String bookReadmd;
	
	public Book() {
		
	}
	
	public Book(int bookNum, String bookName, String bookType, String bookReadmd) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookReadmd = bookReadmd;
	}

	public void print() {
		System.out.println(bookName+" \n책번호: "+bookNum+" ");
		System.out.println("장르: "+bookType);
		System.out.println("책설명: "+bookReadmd);
	}
	
}
