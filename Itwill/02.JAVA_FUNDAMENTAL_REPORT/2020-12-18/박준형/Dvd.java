package com.itwill03.포함;


public class Dvd {
	//번호
	//타이틀
	//쟝르
	private int num;
	private String title;
	private String genre;
	
	public Dvd() {
		
	}

	public Dvd(int num, String title, String genre) {
		this.num = num;
		this.title = title;
		this.genre = genre;
	}
	
	public void print() {
		System.out.println("번호:"+num+" 제목:"+title+" 장르:"+genre);
	}
		
}
