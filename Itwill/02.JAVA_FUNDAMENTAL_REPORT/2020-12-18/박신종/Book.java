package com.itwill03.포함;

import com.sun.org.apache.regexp.internal.recompile;

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
	private String bookCategory;
	private String bookInfo;
	
	public Book() {
	}
	
	public Book(int bookNum, String bookName, String bookCategory, String bookInfo) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookInfo = bookInfo;
	}

	public void printInfo() {
		System.out.println("-----------회원님이 빌린 책 정보-----------");
		System.out.printf("책번호 : %d, 책제목 : %s, 책분류 : %s, 책설명 : %s ", bookNum, bookName, bookCategory, bookInfo);
	}
}
