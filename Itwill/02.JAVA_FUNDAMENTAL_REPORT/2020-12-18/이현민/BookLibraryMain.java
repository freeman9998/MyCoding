package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember(78, "스찌바", "010-9876-5432");
		/*
		 * 책객체들생성
		 */
		Book book1 = new Book(46372, "안나 카레리나 상", "문학", "톨스토이의 사상과 고민이 집결된 대작");
		Book book2 = new Book(46373, "안나 카레리나 중", "문학", "톨스토이의 사상과 고민이 집결된 대작");
		Book book3 = new Book(46374, "안나 카레리나 하", "문학", "톨스토이의 사상과 고민이 집결된 대작");
		Book[] books1 = {book1, book2, book3};
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setBooks(books1);
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		BookMember.headerPrint();
		bookMember.print();
		
		
	}
}