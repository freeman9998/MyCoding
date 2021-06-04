package com.itwill02.constructor;

//번호
//타이틀
//쟝르
public class Dvd {
	private int no;
	private String title, genre;

	public Dvd() {
	}

	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	public void print() {
		System.out.printf("%3d %s %s", this.no, this.title, this.genre);
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
