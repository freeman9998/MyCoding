package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m = new DvdMember();
		m.setNo(1);
		m.setName("KIM");
		m.setNumber("01012341234");
		/*
		 * Dvd객체생성
		 */
		Dvd d = new Dvd(40, "노트북", "로맨스");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m.setDvd(d);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m.headprint();
		m.print();

	}

}
