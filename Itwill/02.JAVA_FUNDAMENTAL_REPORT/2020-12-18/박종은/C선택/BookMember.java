package study03.포함.선택;



public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book[] books;
	
	public BookMember() {
		
	}
	
	public static void headerprint() {
		System.out.println("----------------멤버------------------");
		System.out.printf("%4s %5s %5s\n","회원번호","회원이름","전화번호");
	}
	
	public void print() {
		System.out.printf("%4d %8s %11s\n",this.no, this.name, this.phoneNumber);
		Book.headerprint();
		for (int i = 0; i < books.length; i++) {
			this.getBooks()[i].print();
		}
	}
	
	

	public BookMember(int no, String name, String phoneNumber, Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.books = books;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Book[] getBooks() {
		return books;
	}



	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	
}