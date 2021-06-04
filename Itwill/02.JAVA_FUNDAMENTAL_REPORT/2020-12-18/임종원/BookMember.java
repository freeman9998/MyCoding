package com.itwill03.B;

public class BookMember {
	/*
	 * - 캡슐화
	 * 
	 * <<속성>> 회원번호 회원이름 전화번호 빌린책 <<기능>> 회원정보출력
	 * 책번호 책제목 책분류 책설명
	 */

	private int memberNum;
	private String memberName;
	private String memberPhoneNumber;
	private Book book;

	public BookMember() {

	}	
	public void headPrint() {
		System.out.printf("---------------------------------------------도서관 정보출력---------------------------------------------%n");
		System.out.printf("%s %5s %5s %8s %10s %10s %15s%n", "회원번호","회원이름","전화번호","책번호","책제목","책분류","책설명" );
		System.out.printf("---------------------------------------------------------------------------------------------------------%n");
	}
	public void print() { 
		System.out.printf("%2d %10s %15s",this.memberNum,this.memberName,this.memberPhoneNumber);
		this.book.print();
	
	}

	public BookMember(int memberNum, String memberName, String memberPhoneNumber, Book book) {
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberPhoneNumber = memberPhoneNumber;
		this.book = book;
	}
	// setter
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberPhoneNumber(String memberPhoneNumber) {
		this.memberPhoneNumber = memberPhoneNumber;
	}
	public void setBook(Book book) {
		this.book = book;
	}
}
