package com.itwill4.array;

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
	
	public void headprint() {
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.printf("%s %4s %8s %15s %12s %13s %11s%n","번호","이름","전화번호","책번호","책이름","책분류","책설명");
		System.out.println("--------------------------------------------------------------------------------------------");
		
	}

	public void print() {
		for (int i = 0; i < books.length; i++) {
			System.out.print(no+"\t"+name+"\t"+phoneNumber+"\t");
			books[i].print();
		}
		
	}

		


}
