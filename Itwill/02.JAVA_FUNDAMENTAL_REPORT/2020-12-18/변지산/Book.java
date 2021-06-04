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
	private int no;
	private String bname;
	private String bookc;
	private String bookexp;
	
	
	public Book() {
		
	}
	public Book(int no, String bname, String bookc, String bookexp) {
		this.no = no;
		this.bname = bname;
		this.bookc = bookc;
		this.bookexp = bookexp;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void bprint() {
		System.out.printf("%3d %s %2s %4s%n", this.no, this.bname, this.bookc, this.bookexp);
	}

	
}
