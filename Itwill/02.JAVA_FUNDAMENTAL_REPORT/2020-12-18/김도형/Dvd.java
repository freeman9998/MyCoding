package com.itwill03.포함;


public class Dvd {
	//번호
	//타이틀
	//쟝르
	private int dvdNo;
	private String dvdName;
	private String dvdCategory;
	
	public Dvd() {
		
	}

	public Dvd(int dvdNo, String dvdName, String dvdCategory) {
		//super();
		this.dvdNo = dvdNo;
		this.dvdName = dvdName;
		this.dvdCategory = dvdCategory;
	}
	
	public void headPrint() {
		System.out.println("------------------------------");
		System.out.printf("%s %s %s%n","DVD번호","타이틀","장르");
		System.out.println("------------------------------");
	}
	
	public void print() {
		System.out.printf("%10s %17s %4s",this.dvdNo,this.dvdName,this.dvdCategory);
		
		
	}
	
	//setter
	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public void setDvdCategory(String dvdCategory) {
		this.dvdCategory = dvdCategory;
	}

	
	
	
	
}