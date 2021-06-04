package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		//책 객체 생성과 동시에 초기화
		Book b1=new Book(56, "모모", "소설", "시간도둑에게서 시간을 지키는 모모");
		//회원 객체 생성과 동시에 초기화
		BookMember no1=new BookMember(1, "강준우", "01029394182", b1);
		
		//회원정보 및 책정보 출력
		no1.headprint();
		b1.print();
		
		
		
		
		
		
		
		
		
		
	}

}
