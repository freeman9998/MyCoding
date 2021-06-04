package com.itwill04.array;


public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book[] books;
	
	public BookMember() {
		
	}
	public BookMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public static void headerPrint() {
		System.out.printf("-------------------------------대여정보출력-------------------------------------------------------------------%n");
		System.out.printf("%s %s %6s %8s %9s %9s %8s %n",
				"회원번호","회원이름","전화번호","책번호","책제목","책분류","책설명");
		System.out.printf("--------------------------------------------------------------------------------------------------------------%n");
	}
	public void print() {
		for (int i = 0; i < books.length; i++) {
			System.out.printf("%5d %7s %14s",no,name,phoneNumber);
			this.books[i].print();
		}
	}
	
	
	
	
}