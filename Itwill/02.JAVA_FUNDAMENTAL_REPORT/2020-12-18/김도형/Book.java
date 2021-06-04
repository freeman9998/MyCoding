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
	private int no;
	private String book;
	private String reference;
	private String explanation;
	private BookMember bookmember;	
	
	public Book() {		
		
	}	
	public Book(int no, String book, String reference, String explanation) {
		//super();
		this.no = no;
		this.book = book;
		this.reference = reference;
		this.explanation = explanation;
	}
	
	//헤더프린트
	public void headerPrint() {
		System.out.println("------------------------------");
		System.out.printf("%s %s %7s %s%n","책제목","책번호","책분류","책설명");
		System.out.println("------------------------------");
	}
	public void print() {
		System.out.printf("%10s %7s %7s %7s%n",this.book,this.no,this.reference,this.explanation);
		
	}
	
	//setter
	public void setNo(int no) {
		this.no = no;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public void setBookmember(BookMember bookmember) {
		this.bookmember = bookmember;
	}
	
	
	
}