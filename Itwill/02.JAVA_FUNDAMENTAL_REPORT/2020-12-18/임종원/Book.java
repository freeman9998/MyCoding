package com.itwill03.B;

public class Book {
	/*
	 * - 캡슐화하세요 - 생성자를 정의하세요
	 */
	private int bookno;
	private String bookTittle;
	private String Classification;
	private String explanation;

	/*
	 * <<속성>> 책번호 책제목 책분류 책설명
	 */
	public Book() {

	}
	
	public Book(int bookno, String bookTittle, String classification, String explanation) {
		this.bookno = bookno;
		this.bookTittle = bookTittle;
		this.Classification = classification;
		this.explanation = explanation;
	}

	/*
	 * <<기능>> 책정보출력
	 * 
	 */	
	public void print() {
		System.out.printf("%5d %15s %8s %20s%n",this.bookno,this.bookTittle,this.Classification,this.explanation);
	}
	
	
	
	// setter
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}


	public void setBookTittle(String bookTittle) {
		this.bookTittle = bookTittle;
	}


	public void setClassification(String classification) {
		Classification = classification;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}	
}
