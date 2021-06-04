package com.itwill03.포함;


public class Dvd {
	//번호
	//타이틀
	//쟝르
	private int no;
	private String name;
	private String type;
	public Dvd() {
		
	}
	public Dvd(int no, String name, String type) {
		this.no = no;
		this.name = name;
		this.type = type;
	}
	void dprint() {
		System.out.printf("%d %s %3s%n", this.no, this.name, this.type);
	}
}
