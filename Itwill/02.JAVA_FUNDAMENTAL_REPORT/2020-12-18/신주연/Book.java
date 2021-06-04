package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	private int bnumber;
	private String bname;
	private String btype;
	private String breview;
	
	public Book() {
		
	}
	public Book(int bnumber,String bname,String btype,String breview) {
		this.bnumber = bnumber;
		this.bname = bname;
		this.btype = btype;
		this.breview = breview;
	}
	
	public void print() {
		System.out.print(this.bnumber+" "+this.bname+" "+this.btype+" "+this.breview);
		System.out.println();
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getBreview() {
		return breview;
	}

	public void setBreview(String breview) {
		this.breview = breview;
	}
	
}
