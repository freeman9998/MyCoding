package com.itwill03.포함;


public class Dvd {
	//번호
	//타이틀
	//쟝르
	
	private int no;
	private String title;
	private String type;
	
	public Dvd() {
		
	}
	public Dvd(int no, String title, String type) {
		this.no = no;
		this.title = title;
		this.type = type;
	}
	public void print( ) {
		System.out.println("=====================================");
		System.out.printf("%s %s %s%n", "  DVD번호 ", "  DVD타이틀 ", "  DVD종류  ");
		System.out.println(this.no + this.title + this.type);
	}
}