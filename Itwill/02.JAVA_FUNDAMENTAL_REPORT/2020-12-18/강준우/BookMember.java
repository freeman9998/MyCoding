package com.itwill03.포함;

public class BookMember {
	private int no; // 회원번호
	private String name; // 회원이름
	private String callnum; // 전화번호
	private Book book; //빌린 책
	
	//기본 생성자메쏘드와 초기화 작업을 할 수 있는 생성자메쏘드 선언 
	public BookMember() {}
	public BookMember(int no, String name, String callnum, Book book) {
		this.no=no;
		this.name=name;
		this.callnum=callnum;
		this.book=book;
	}
	public void headprint() {
		System.out.println("---------------회원정보---------------");
		System.out.printf("%s %9s %9s%n", "회원번호", "회원이름", "전화번호");
		System.out.printf("%5d %12s %15s%n", this.no, this.name, this.callnum);
	}
	
}
