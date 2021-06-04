package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 * 
		 */
		BookMember bm1 = new BookMember();
		bm1.setNo(14);
		bm1.setName("정다은");
		bm1.setPhoneNumber("010-1234-1234");
		bm1.setBook(null);
		
		BookMember bm2 = new BookMember();
		bm2.setNo(20);
		bm2.setName("김자바");
		bm2.setPhoneNumber("010-9876-5432");
		bm2.setBook(null);
	
		/*
		 * 책객체생성
		 */
		Book b1 = new Book(1, "코스모스", "천문학", "별자리와 천체관측");
		Book b2 = new Book(2,"달러구트", "판타지", "꿈 백화점 이야기");	
				
		/*
		 * 회원이 책 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
	
		bm1.setBook(b1);
		bm2.setBook(b2);
		
		
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		bm1.headerPrint();
		bm1.print();
		bm2.print();
		
		
		
		
	}

}
