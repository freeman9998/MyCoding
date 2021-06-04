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
	
	public void setbook(Book[] books) {
		this.books=books;
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
	


	


	public static void headerPrint(){
		System.out.println("---------------------------------------------");
		System.out.println("번호 이름 핸드폰 책번호 책이름 책분류 책설명");
		System.out.println("---------------------------------------------");
	}
	
	
	public void print() {
		System.out.print(no+"\t"+name+"\t"+phoneNumber+" ");
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
	}
	
	
	
	
}
