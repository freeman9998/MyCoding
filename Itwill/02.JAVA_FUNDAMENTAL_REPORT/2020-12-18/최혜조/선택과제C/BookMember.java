package 선택과제C;

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
	

	
	public void setBooks(Book book[]) {
		this.books = book;
	}

	public Book[] getBooks() {
		return books;
	}

	public static void headerprint() {
		System.out.println("------------Library Info------------------");
		System.out.printf("%7s %6s %9s\n","회원번호","이름", "전화번호");	
		System.out.println("------------------------------------------");
	}
	
	public void print() {
	
		System.out.printf("%7d %10s %16s\n",this.no,this.name,this.phoneNumber);
		Book.headerprint();
		for (int i = 0; i < books.length; i++) {
			this.getBooks()[i].print();
		}
		
	}





}
