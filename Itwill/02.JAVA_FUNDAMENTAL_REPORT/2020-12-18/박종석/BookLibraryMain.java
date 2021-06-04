package com.itwill02.constructor;

public class BookLibraryMain {

	public static void main(String[] args) {
		BookMember bm = new BookMember();// 회원객체생성
		Book bk = new Book();// 책객체생성
		/*
		 * 회원이 책들 대여
		 */
		bk.setNo(1);
		bk.setTitle("이클");
		bk.setType("IT");
		bk.setExplain("Java");

		bm.setId(1);
		bm.setName("박종석");
		bm.setTel("02-343-3433");
		bm.setBook(bk);// 책객체참조변수를 회원의 멤버변수에대입
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm.headprint();
		bm.print();
	}

}
