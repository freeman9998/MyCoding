package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember m =new BookMember();
		
		/*
		 * 책객체생성
		 */
		Book book = new Book(55, "잭과콩나물", 'A', "10대 필독 도서");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		m.setNo(1);
		m.setName("KIM");
		m.setNumber("01055556666");
		m.setBook(book);
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		m.headprint();
		m.print();

	}

}
