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
package com.itwill03.포함;

//책의 멤버필드 작성
public class Book {
	private int no;
	private String bookname;
	private char group;
	private String info;
	
	//생성자 정의
	public Book() {

	}

	public Book(int no, String bookname, char group, String info) {
		super();
		this.no = no;
		this.bookname = bookname;
		this.group = group;
		this.info = info;
	//책정보 출력	
   }

	public void print() {
		System.out.printf("%d %s %c %s%n", this.no, this.bookname, this.group, this.info);
	}

	public void headprint() {
		System.out.println("-------------책정보-------------");
		System.out.printf("%s %s %s %s%n", "책번호", "책이름", "책분류", "책설명");
	}

}
