package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm1=new BookMember();
		bm1.setNo(1234);
		bm1.setName("김도형");
		bm1.setPhone("010-2255-4884");
		
		/*
		 * 책객체생성
		 */
		Book b1=new Book(2020, "혼자공부하는자바", "3467.21", "자바수업교재 저자 신용권");
		bm1.setBook(b1);
				
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
			
						
		bm1.headerPrint();
		bm1.print();	
		
	}
}