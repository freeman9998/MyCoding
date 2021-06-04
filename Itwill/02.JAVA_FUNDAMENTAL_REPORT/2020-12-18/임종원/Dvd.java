package com.itwill03.B;

public class Dvd {
	// 번호
	// 타이틀
	// 쟝르
	private int dvdNum;
	private String dvdTitle;
	private String dvdGenre;
	
	public Dvd() {
		// TODO Auto-generated constructor stub
	}

	public Dvd(int dvdNum, String dbdTitle, String genre) {
		
		this.dvdNum = dvdNum;
		this.dvdTitle = dbdTitle;
		this.dvdGenre = genre;
	}
	public void print() {
		System.out.printf("%5d %15s %5s",this.dvdNum,this.dvdTitle,this.dvdGenre);
		
	}
	
	
	//setter
	public int  setDvdNum(int dvdNum) {
		return this.dvdNum = dvdNum;
	}

	public void setdvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public void setdvdGenre(String dvdGenre) {
		this.dvdGenre = dvdGenre;
	}
	
}
