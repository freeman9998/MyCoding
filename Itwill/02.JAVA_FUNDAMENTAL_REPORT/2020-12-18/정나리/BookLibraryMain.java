package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		BookMember mem1 = new BookMember();
		
		/*
		 * 책객체생성 하면서 책 정보 입력
		 */
		Book[] book1 = {
				new Book(1234, "해커스 토익", "문제집", "토익 문제집"),
				new Book(5678, "기초 통계학", "전공서", "통계학 전공서적"),
				new Book(9387, "다빈치 코드1", "소설", "추리소설 상편")
				};
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		
		mem1.setNum(1); //회원번호 set
		mem1.setName("김우주"); //회원이름 set
		mem1.setCellNum("01012340987");//회원 전화번호 set
		mem1.setBooks(book1); //책 배열 객체를 회원 멤버변수에 대입
		
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */

		BookMember.headPrint();
		mem1.print();


		
	}
}