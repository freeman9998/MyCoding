package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember m1 = new BookMember(1, "KIM", "01011112222");
		BookMember m2 = new BookMember(2, "LEE", "01022223333");

		/*
		 * 책객체생성
		 */
		Book b1 = new Book(1, "사랑", "한국소설", "이광수");
		Book b2 = new Book(2, "상록수", "한국소설", "심훈");
		Book b3 = new Book(3, "카인의 후예", "한국소설", "황순원");
		Book b4 = new Book(4, "죄와 벌", "외국소설", "도스토예프스키");
		Book b5 = new Book(5, "좁은 문", "외국소설", "앙드레 지드");
		Book b6 = new Book(6, "데스노트", "만화책", "1권");
		Book b7 = new Book(7, "게이머즈", "잡지", "2020년 10월호");

		/*
		 * 회원이 책들 대여 책객체참조변수를 회원의 멤버변수에대입
		 */
		m1.rentBook(b1);
		m2.rentBook(b1);
		m2.rentBook(b2);
		m2.rentBook(b3);
		m2.rentBook(b4);
		m2.rentBook(b5);
		m2.rentBook(b6);
		m2.rentBook(b7);
		

		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		m1.memberPrint();
		m2.memberPrint();

	}

}
