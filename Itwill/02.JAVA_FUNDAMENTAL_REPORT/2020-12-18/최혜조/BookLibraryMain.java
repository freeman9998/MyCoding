package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/* 
		* 회원객체생성
		 */
		BookMember m1 = new BookMember();
		m1.setNo(1);
		m1.setName("박자바");
		m1.setTel("010-1111-1111");
		/*
		 * 책객체생성
		 *
		 *
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		Book b1 = new Book(21,"혼공자","IT","JAVA");
		m1.setBook(b1);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		m1.headerprint();
		m1.print();

	}

}
