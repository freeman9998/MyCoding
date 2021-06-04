package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		BookMember bookmember = new BookMember(1, "고길동", "010-4584-7777");
		Book book1 = new Book(12450,"Java고수비법","전공서적","이것만 보면 당신도 Java의 달인");
		
		bookmember.setBook(book1);
		//book1=null;
		bookmember.print();
		
	}
}
