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
	
	private Book book;
	

	



	public BookMember() {
		
	}
	
	
	public BookMember(int no, String name, String phoneNumber) {
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
	
	
	


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public void print() {
		System.out.println("-----------회원 정보---------------");
		System.out.println(no+"\t"+name+"\t"+phoneNumber);
		System.out.println("----------빌린책 정보 ------------");
		if(books==null) {
			System.out.println("빌린책이 없습니다 ");
		
		}else {
			for (int i = 0; i < books.length; i++) {
					books[i].print();
			}
		}
		
     
		
		
	}



	
	
	
	
}