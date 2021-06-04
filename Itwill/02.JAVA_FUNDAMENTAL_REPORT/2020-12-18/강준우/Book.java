package com.itwill03.포함;

public class Book {
	private int no;
	private String name;
	private String ganre;
	private String explain;
	
	//기본생성자메쏘드와 초기화를 할 수 있는 생성자메쏘드선언
	public Book() {}
	public Book(int no, String name, String ganre, String explain) {
		super();
		this.no = no;
		this.name = name;
		this.ganre = ganre;
		this.explain = explain;
	}


	public void print() {
		System.out.println("---------------------책정보------------------------");
		System.out.printf("%s %7s %7s %14s%n", "책번호", "책이름", "책종류", "책설명");
		System.out.printf("%4d %9s %8s %14s%n", this.no, this.name, this.ganre, this.explain);
	}
	
	
	
	
}
