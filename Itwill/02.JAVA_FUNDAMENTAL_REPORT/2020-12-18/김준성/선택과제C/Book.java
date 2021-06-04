package com.itwill03.포함;

public class Book {
	// 책번호
	private int no;

	// 책제목
	private String title;

	// 책분류
	private String category;

	// 책설명
	private String explanation;

	// 대출가능여부
	private boolean rentAvailable;

	public Book() {

	}

	public Book(int no, String title, String category, String explanation) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.explanation = explanation;
		rentAvailable = true;

	}

	public void bookPrint() {
		System.out.printf("%5d %6s %5s %5s\n", no, title, category, explanation);

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public boolean isRentAvailable() {
		return rentAvailable;
	}

	public void setRentAvailable(boolean rentAvailable) {
		this.rentAvailable = rentAvailable;
	}

}
