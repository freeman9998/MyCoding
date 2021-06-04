package com.itwill03.포함;

public class BookMember {
	// 회원번호
	private int no;

	// 회원이름
	private String name;

	// 전화번호
	private String tel;

	// 빌린책
	private Book rentBook;

	// 대출제한여부
	private boolean rentLimit;

	public BookMember() {

	}

	public BookMember(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		rentLimit = true;

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

	public Book getRentBook() {
		return rentBook;
	}

	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}

	public boolean isRentLimit() {
		return rentLimit;
	}

	public void setRentLimit(boolean rentLimit) {
		this.rentLimit = rentLimit;
	}

	public void rentBook(Book b) {
		if (rentLimit) {
			if (b.isRentAvailable()) {
				rentBook = b;
				rentLimit = false;
				b.setRentAvailable(false);

			} else {
				System.out.println(b.getTitle() + "는 이미 대출된 책입니다.");

			}
		} else {
			System.out.println("대출은 1권까지만 가능합니다.");

		}

	}

	public void returnBook(Book b) {
		if (rentLimit) {
			System.out.println("책을 대출한 적이 없습니다.");

		} else {
			rentBook = null;
			rentLimit = true;
			b.setRentAvailable(true);

		}
	}

	public void printMember() {
		System.out.println();
		System.out.println("-----------회원정보-----------");
		System.out.printf("%s    %s    %s\n", "회원번호", "이름", "전화번호");
		System.out.println("------------------------------");
		System.out.printf("%5d %9s %14s\n", no, name, tel);
		System.out.println("---------대출도서정보---------");
		System.out.printf("  %s    %s    %s    %s\n", "번호", "제목", "분류", "설명");
		System.out.println("------------------------------");
		if (rentBook == null) {
			System.out.println("        대출기록없음");
		} else {
			rentBook.printBook();

		}

	}

}
