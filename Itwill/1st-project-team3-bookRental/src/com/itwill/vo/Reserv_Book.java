package com.itwill.vo;

import java.sql.Date;

public class Reserv_Book {
	
	private int reserv_no;
	private String member_id;
	private int book_no;
	private String book_title;
	private String book_author;
	private Date borrow_rental;
	private Date borrow_return;
	public Reserv_Book() {
		
	}
	
	public Reserv_Book(int reserv_no, String member_id, int book_no) {
		super();
		this.reserv_no = reserv_no;
		this.member_id = member_id;
		this.book_no = book_no;
	}
	
	public Reserv_Book(int book_no, String book_title, String book_author, Date borrow_rental, Date borrow_return) {
		super();
		this.book_no = book_no;
		this.book_title = book_title;
		this.book_author = book_author;
		this.borrow_rental = borrow_rental;
		this.borrow_return = borrow_return;
	}

	public int getReserv_no() {
		return reserv_no;
	}
	public void setReserv_no(int reserv_no) {
		this.reserv_no = reserv_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	@Override
	public String toString() {
		return "Reserv_Book [reserv_no=" + reserv_no + ", member_id=" + member_id + ", book_no=" + book_no +  "]";
	}
	
}
