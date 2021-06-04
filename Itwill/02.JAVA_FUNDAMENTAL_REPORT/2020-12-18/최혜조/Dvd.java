package com.itwill03.포함;

public class Dvd {
		//번호
		//타이틀
		//쟝르
	private int no;
	private String title;
	private String genre;
	
	public Dvd() {}

	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	public void print()
	{
		System.out.printf("%7d %9s %8s",this.no,this.title,this.genre);
	}
}
