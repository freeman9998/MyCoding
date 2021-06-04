
public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember(1,"kim","010-0000-0000");
		/*
		 * 책객체들생성
		 */
		Book book1=new Book(2030, "해리포터", "판타지", "마법사내용");
		Book book2=new Book(2201, "나니아연대기", "판타지", "판타지내용");
		Book book3=new Book(2223, "드래곤볼", "만화", "싸움");
		Book book4=new Book(5551, "JAVA혼자공", "IT", "혼자공부");
		Book book5=new Book(1123, "피아노책", "교육용", "피아노 연주책 ");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		Book[] books = {book1,book2,book3,book4,book5};
		System.out.println("-------------회원------------");
		bookMember.setBooks(books);
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();
		System.out.println("-----------빌린책------------");
		for (int i = 0; i < books.length; i++) {
			bookMember.getBooks()[i].print();
		}
		
	}
}