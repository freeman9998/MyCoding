package com.itwill03.포함;

public class BookMember {
	// 회원번호
	private int no;

	// 회원이름
	private String name;

	// 전화번호
	private String phoneNumber;

	// 빌린책
	private Book[] books;

	// 대출제한여부
	private int rentLimit;

	public BookMember() {

	}

	public BookMember(int no, String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		books = new Book[5];
		rentLimit = 5;

	}

	public void rentBook(Book b) {
		if (b.isRentAvailable()) {
			switch (rentLimit) {
			case 0:
				System.out.println("대출은 5권까지만 가능합니다.");
				break;
			default:
				for (int i = 0; i < books.length; i++) {
					if (books[i] == null) {
						books[i] = b;
						b.setRentAvailable(false);
						rentLimit--;
						break;
					}
				}
				break;
			}

		} else {
			System.out.println(b.getTitle() + "은(는) 이미 대출된 책입니다.");

		}
	}

	public void returnBook(Book b) {
		if (b.isRentAvailable()) {
			System.out.println(b.getTitle() + "을(를) 대출한 기록이 없습니다.");
		} else {
			for (int i = 0; i < books.length; i++) {
				if (books[i] == b) {
					books[i] = null;
					b.setRentAvailable(true);
					rentLimit++;
					break;
				}
			}
		}
	}

	public void memberPrint() {
		System.out.println();
		System.out.println("-----------회원정보-----------");
		System.out.printf("%s    %s    %s\n", "회원번호", "이름", "전화번호");
		System.out.println("------------------------------");
		System.out.printf("%5d %9s %14s\n", no, name, phoneNumber);
		System.out.println("---------대출도서정보---------");
		System.out.printf("  %s    %s    %s    %s\n", "번호", "제목", "분류", "설명");
		System.out.println("------------------------------");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].bookPrint();
			}
		}

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
