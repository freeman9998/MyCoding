package com.itwill03.포함;

public class Book {
	private int no;
	private String title;
	private String group;
	private String explain;
	
	public Book() {}

	public Book(int no, String title, String group, String explain) {
		this.no = no;
		this.title = title;
		this.group = group;
		this.explain = explain;
	}
	
	public void print() {
		System.out.printf("%6d %7s %5s %8s%n",this.no,this.title,this.group,this.explain);
		
	}

	//setter
	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}
	
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
}
