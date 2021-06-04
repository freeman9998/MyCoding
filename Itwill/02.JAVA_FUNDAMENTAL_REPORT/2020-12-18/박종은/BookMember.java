package itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	<<기능>>
	  회원정보출력 
	 */
	
	
	// 캡슐화
	private int no;
	private String name;
	private String tel;
	private Book book;
	
	public BookMember() {
		
	}
	

	public void headerprint() {
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s %3s %9s %7s %5s %5s %5s\n"
				,"회원번호","이름", "전화번호", "책번호", "제목","분류","설명");	
		System.out.println("-------------------------------------------------------------------");
		}
	
	
	

	public void print() {
		System.out.printf("%4d %7s %15s",this.no, this.name, this.tel, this.book);
		this.book.print();
		
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


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
