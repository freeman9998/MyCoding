package com.itwill03.포함;

public class Dvd {

	/*
	 * 번호
	 * 타이틀
	 * 장르
	 */
	private int no;
	private String title;
	private String genre;


	//생성자
	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}

	//출력
		public void print() {
			System.out.printf("%6d %5s %s%n",this.no, this.title, this.genre);
		}

	//getter, setter
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
	
	
}
