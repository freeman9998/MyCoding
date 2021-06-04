package com.itwill03.포함;


public class Dvd {
	//번호
	//타이틀
	//장르
	
	private int no;
	private String name;
	private String genre;

	public Dvd() {
		
	}
	public Dvd(int no, String name, String genre) {
		this.no = no;
		this.name = name;
		this.genre = genre;
	}
	
	public void print() {
		System.out.printf("%6d %6s %3s%n",no,name,genre);
	}
	
	//getter, setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
