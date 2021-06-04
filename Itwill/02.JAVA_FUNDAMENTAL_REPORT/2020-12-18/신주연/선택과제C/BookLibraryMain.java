package com.itwill04.array;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember mem1 = new BookMember(13, "KIM", "010-1234-5678");
		
		
		/*
		 * 책객체들생성
		 */
		
		Book[] books = {
				new Book(34214, "Herry Poter", "소설", "해리포터이야기"),
				new Book(78965, "Demian", "문학", "자아정체성을 찾아가는 이야기"),
				new Book(87699, "아몬드", "청소년", "감정이없는 아이이야기")
		};
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		
		mem1.setbook(books);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		mem1.headerPrint();
		mem1.print();
		

	}

}
