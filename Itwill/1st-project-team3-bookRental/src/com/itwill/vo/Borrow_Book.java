package com.itwill.vo;

import java.sql.Date;

public class Borrow_Book {
	
	private int borrow_no;
	private String member_id;
	private int book_no;
	private Date borrow_rental;
	private Date borrow_return;
	
	public Borrow_Book() {
		
	}

	public Borrow_Book(int borrow_no, String member_id, int book_no, Date borrow_rental, Date borrow_return) {
		super();
		this.borrow_no = borrow_no;
		this.member_id = member_id;
		this.book_no = book_no;
		this.borrow_rental = borrow_rental;
		this.borrow_return = borrow_return;
	}

	
	
	
	public int getBorrow_no() {
		return borrow_no;
	}

	public void setBorrow_no(int borrow_no) {
		this.borrow_no = borrow_no;
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

	public Date getBorrow_rental() {
		return borrow_rental;
	}

	public void setBorrow_rental(Date borrow_rental) {
		this.borrow_rental = borrow_rental;
	}

	public Date getBorrow_return() {
		return borrow_return;
	}

	public void setBorrow_return(Date borrow_return) {
		this.borrow_return = borrow_return;
	}

	@Override
	public String toString() {
		return "Borrow_Book [borrow_no=" + borrow_no + ", member_id=" + member_id + ", book_no=" + book_no
				+ ", borrow_rental=" + borrow_rental + ", borrow_return=" + borrow_return + "]";
	}
	
	
	
	}

