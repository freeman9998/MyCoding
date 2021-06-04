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
	private int memberNo;
	private String memberName;
	private String memberPhoneNo;
	private Book memberBook;
	public BookMember() {
		
	}
	public BookMember(int memberNo, String memberName, String memberPhoneNo) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhoneNo = memberPhoneNo;
	}
	public void headerPrint() {
		System.out.printf("-------------------------------대여정보출력-------------------------------------------------------------------------------------%n");
		System.out.printf("%s %s %6s %6s %8s %6s %4s %n",
				"회원번호","회원이름","전화번호","책번호","책제목","책분류","책설명");
		System.out.printf("--------------------------------------------------------------------------------------------------------------------------------%n");
	}
	
	public void print() {
		System.out.printf("%5d %7s %14s\t",this.memberNo,this.memberName,this.memberPhoneNo);
		memberBook.print();
	}
	
	//getter,setter
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhoneNo() {
		return memberPhoneNo;
	}
	public void setMemberPhoneNo(String memberPhoneNo) {
		this.memberPhoneNo = memberPhoneNo;
	}
	public Book getMemberBook() {
		return memberBook;
	}
	public void setMemberBook(Book memberBook) {
		this.memberBook = memberBook;
	}
}
