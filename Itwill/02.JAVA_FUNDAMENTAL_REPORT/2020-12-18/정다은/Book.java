package com.itwill03.포함;
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
	
	/*
	 * 멤버필드 캡슐화
	 */
	
	private int no;
	private String subject;
	private String sort;
	private String direction;
	
	/*
	 * 생성자 정의 
	 */
	
	public Book() {
		
	}

	public Book(int no, String subject, String sort, String direction) {
		super();
		this.no = no;
		this.subject = subject;
		this.sort = sort;
		this.direction = direction;
	}
	
	//책 정보 출력 메소드
	public void print() {
		System.out.printf("%6s %4d %5s %s%n",this.subject,this.no,this.sort,this.direction);
	}

	
	//getter, setter
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	
	
	
	
}
