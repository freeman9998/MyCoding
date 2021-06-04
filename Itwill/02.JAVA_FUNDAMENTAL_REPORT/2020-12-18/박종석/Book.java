package com.itwill02.constructor;
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

public class Book {
	private int no;
	private String title, type, explain;

	public Book() {
	}

	public Book(int no, String title, String type, String explain) {
		super();
		this.no = no;
		this.title = title;
		this.type = type;
		this.explain = explain;
	}

	void print() {
		System.out.printf("%2d %2s %5s %4s%n", this.no, this.title, this.type, this.explain);
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

}
