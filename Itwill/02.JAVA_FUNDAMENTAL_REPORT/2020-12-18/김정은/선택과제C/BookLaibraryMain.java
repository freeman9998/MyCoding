package com.itwill4.array;

public class BookLaibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm=new BookMember();
		/*
		 * 책객체들생성
		 */
		Book book1=new Book(49, "혼자 공부하는 자바", "IT", "초보에게 좋은 책");
		Book book2=new Book(50, "둘이 공부하는 자바", "IT", "중급자에게 좋은 책");
		Book book3=new Book(66, "여러명이서 하는 자바", "IT", "상급자에게 좋은 책");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bm.setNo(5);
		bm.setName("KIM");
		bm.setPhoneNumber("01055556666");
		Book[] books = {book1,book2,book3};
		bm.setBooks(books);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bm.headprint();
		bm.print();
		
	

	}

}
