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
		Book book1 = new Book(1, "코스모스", "100", "과학");
		Book book2 = new Book(2, "강신주의 감정수업", "200", "인문학");
		Book book3 = new Book(3, "미움받을 용기", "300", "자기계발서");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bm1.setNo(1);
		bm1.setName("LEE");
		bm1.setHp("010-1111-1111");
		bm1.setBrBook(book1);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm1.print();
		bm1.setBrBook(book2);
		bm1.print();
	
	}
}