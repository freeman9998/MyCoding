package com.itwill03.포함;

public class Dvd {
	// 번호
	// 타이틀
	// 쟝르

	private int number;
	private String title;
	private String genre;

	public Dvd(int number, String title, String genre) {
		this.number = number;
		this.title = title;
		this.genre = genre;
	}

	public void print() {
		System.out.print(this.number + " " + this.title + " " + this.genre);
	}

}
