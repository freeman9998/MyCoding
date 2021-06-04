package com.itwill00.variable.김동현;

public class Book {

	private int book_no;
	private String title,manual,type;
	
	public Book() {}
	
	public Book(int book_no, String title, String manual, String type) {
		this.book_no = book_no;
		this.title = title;
		this.manual = manual;
		this.type = type;
	}

	public void setBookData(int book_no, String title, String manual, String type) {
		this.book_no = book_no;
		this.title = title;
		this.manual = manual;
		this.type = type;
	}
	
	public void bookdataPrint() {
		System.out.printf("-------책 정보---------------------%n");
		System.out.printf("영국의 시인이자 수필가, 비평가, 소설가인 C. S. 루이스의 총 7편의 판타지 소설을 일컫는다.%n 사실 명석하며 신랄하기까지한 저서들로 유명한 루이스가 어린 아이들을 위해 만든 시리즈다.%n 때문에 스토리상 전투나 전쟁에 대한 묘사를 세밀하게 표현하지 않는 대신 캐릭터들의 성장과 소통에 중점을 맞추는 경향이 있다.%n");
		System.out.printf("-----------------------------------%n");

	}
