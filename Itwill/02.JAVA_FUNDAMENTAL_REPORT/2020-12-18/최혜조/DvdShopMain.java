package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember();
		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd(31,"주토피아","애니메이션");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m1.setNo(1);
		m1.setName("강성태");
		m1.setTel("010-1234-1234");
		m1.setDvd(d1);
	
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m1.headerprint();
		m1.print();

	}

}
