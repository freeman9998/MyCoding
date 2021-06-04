package com.itwill00.variable.김동현;

public class BookLibraryMain {
	public static void main(String[] args) {
		
		BookMember BM1 = new BookMember();
		Book BD1 = new Book();
		BM1.setMemberData(1, "Kim", "나니아연대기", "010-1234-5678");
		BD1.setBookData(2, "나니아연대기", "소설", "소설");
		
		 BM1.headerPrint();
		 BM1.print();
		 
		 
		 System.out.println(BM1.toString());
		 BD1.bookdataPrint();
	}

}
