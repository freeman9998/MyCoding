package com.itwill03.포함;

public class Dvd {
	// 번호
	private int no;

	// 타이틀
	private String title;

	// 쟝르
	private String genre;

	// 대출가능여부
	private boolean rentAvailable;

	public Dvd() {

	}

	public Dvd(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
		rentAvailable = true;

	}

	public void dvdPrint() {
		System.out.printf("%5d %9s %8s\n", no, title, genre);

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isRentAvailable() {
		return rentAvailable;
	}

	public void setRentAvailable(boolean rentAvailable) {
		this.rentAvailable = rentAvailable;
	}

}
