package com.itwill03.포함;

public class Dvd {
	//번호
	//타이틀
	//쟝르
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

	public void headprint() {
		System.out.println("----------dvd정보---------");
		System.out.printf("%5s %5s %5s%n", "번호", "제목", "장르");
		System.out.println("--------------------------");
	}

	public void print() {
		System.out.printf("%6d %6s %4s%n", this.no, this.title, this.genre);
	}
	
	
	
	
}
