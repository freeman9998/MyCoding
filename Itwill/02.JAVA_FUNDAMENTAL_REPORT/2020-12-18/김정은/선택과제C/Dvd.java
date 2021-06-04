package com.itwill4.array;

public class Dvd {
	private int no;
	private String title;
	private String genre;

	public Dvd() {

	}

	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
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

	public void print() {
		System.out.println("\t" + no + "\t" + title + "\t" + genre);
	}

}
