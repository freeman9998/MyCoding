package com.itwill.vo;

public class Book {
	private int book_no;
	private String book_title;
	private String book_author;
	private String book_summary;
	private int book_total;
	
	public Book() {
	}

	public Book(int book_no, String book_title, String book_author, String book_summary, int book_total) {
		super();
		this.book_no = book_no;
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_summary = book_summary;
		this.book_total = book_total;
	}

	public int getBook_no() {
		return book_no;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_summary() {
		return book_summary;
	}

	public void setBook_summary(String book_summary) {
		this.book_summary = book_summary;
	}

	public int getBook_total() {
		return book_total;
	}

	public void setBook_total(int book_total) {
		this.book_total = book_total;
	}

	@Override
	public String toString() {
		return "Book [book_no=" + book_no + ", book_title=" + book_title + ", book_author=" + book_author
				+ ", book_summary=" + book_summary + ", book_total=" + book_total + "]";
	}

}
