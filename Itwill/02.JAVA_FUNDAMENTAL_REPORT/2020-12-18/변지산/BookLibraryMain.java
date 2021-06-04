package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm1 = new BookMember();
		/*
		 * 책객체생성
		 */
		Book b1 = new Book(111, "언어의정원", "일본문학", "청춘소설");
		Book b2 = new Book(222, "메인영한사전","사전","영한사전");

		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bm1.setMno(1);
		bm1.setMname("김나리");
		bm1.setPhone("01012345678");
		bm1.setTakeb(b1);
		bm1.setTakeb2(b2);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		
		bm1.headprint();
		bm1.print();
		bm1.print1();
		
	}
}
