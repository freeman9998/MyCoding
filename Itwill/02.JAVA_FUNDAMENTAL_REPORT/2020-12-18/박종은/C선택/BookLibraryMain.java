package study03.포함.선택;



public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember();
		/*
		 * 책객체들생성
		 */
		Book[] books = {
		new Book(46372, "책제목1", "문학", "좋은책1"),
		new Book(46372, "책제목2", "문학", "좋은책2")
		 };
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setNo(1);
		bookMember.setName("박종은");
		bookMember.setPhoneNumber("010-1234-5678");
		bookMember.setBooks(books);
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		BookMember.headerprint();
		bookMember.print();
		
	}
}