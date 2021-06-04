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
	
	private int memberNum;
	private String memberName;
	private String memberPhoneNum;
	private Book book;
	
	public BookMember() {
	}
	
	public BookMember(int memberNum,String memberName, String memberPhoneNum,Book book) {
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberPhoneNum= memberPhoneNum;
		this.book = book;
	}
	
	public void printMemberInfo() {
		System.out.printf("회원번호 : %d, 회원이름 : %s, 전화번호 : %s ", memberNum, memberName, memberPhoneNum);
		System.out.println();
		book.printInfo();
	}
}