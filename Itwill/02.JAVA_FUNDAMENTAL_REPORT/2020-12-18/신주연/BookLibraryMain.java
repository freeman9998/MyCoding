package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		BookMember bm1 = new BookMember(815,"KIM","010-1234-5678");
		BookMember bm2 = new BookMember();
		/*
		 * 책객체생성
		 */
		
		Book bk1 = new Book(1013,"Demian","문학","자기자신에이르는길");
		Book bk2 = new Book(907,"HarryPoter","소설","해리포터이야기");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */

		bm2.setNo(979);
		bm2.setName("LEE");
		bm2.setHp("010-9876-5432");
		
		bm1.setBook(bk1);
		bm2.setBook(bk2);
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm1.headerPrint();
		bm1.print();
		bm2.print();

		

	}

}
