package itwill03.포함;

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

		
		
		// 회원객체생성
		BookMember bmem = new BookMember();
		bmem.setNo(1);
		bmem.setName("박종은");
		bmem.setTel("010-1234-5678");
		
		
		// 책객체 생성
		Book book = new Book(123, "JAVA", "교육", "IT");
		bmem.setBook(book);
		
		// 회원정보출력
		
		bmem.headerprint();
		bmem.print();
		
		
		
		
		
		
		
		
		
		
		
	}

}
