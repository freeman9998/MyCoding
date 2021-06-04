package com.itwill04.array;


public class Dvd {
	//번호
	//타이틀
	//쟝르
	
	private int dvdNum;
	private String dvdTitle;
	private String dvdGenre;
	
	
	public Dvd() { //기본 생성자
	}

	public Dvd(int dvdNum, String dvdTitle, String dvdGenre) { //인자 3개 생성자
		this.dvdNum = dvdNum;
		this.dvdTitle = dvdTitle;
		this.dvdGenre = dvdGenre;
	}
	
	
	public void dvdInfoPrint() { //프린트 메소드
		System.out.printf("%6d %9s %11s%n", this.dvdNum, this.dvdTitle, this.dvdGenre);
	}

	
	//getset 메소드
	public int getDvdNum() {
		return dvdNum;
	}

	public void setDvdNum(int dvdNum) {
		this.dvdNum = dvdNum;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdGenre() {
		return dvdGenre;
	}

	public void setDvdGenre(String dvdGenre) {
		this.dvdGenre = dvdGenre;
	}
	
	
}