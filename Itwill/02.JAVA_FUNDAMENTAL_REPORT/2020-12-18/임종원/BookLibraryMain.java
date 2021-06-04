package com.itwill03.B;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm = new BookMember();
		
		/*
		 * 책객체생성
		 */
		Book b = new Book();
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수
		 * 를 회원의 멤버변수에대입
		 */
		bm.setMemberNum(1);
		bm.setMemberName("임종원");
		bm.setMemberPhoneNumber("010-0000-7632");
		b.setBookno(1);
		b.setBookTittle("혼자 공부하는 JAVA");
		b.setClassification("IT_Web");
		b.setExplanation("작심삼일 하다가 포기하게 될 떄");	
		bm.setBook(b);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm.headPrint();
		bm.print();

	}

}
