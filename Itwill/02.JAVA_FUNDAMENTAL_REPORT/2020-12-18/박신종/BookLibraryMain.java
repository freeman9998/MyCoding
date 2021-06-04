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
		Book book = new Book(10, "자바의정석", "자바", "자바");
		BookMember bookMember = new BookMember(7, "김자바", "010-1234-1234",book);
		
		bookMember.printMemberInfo();
	}
}