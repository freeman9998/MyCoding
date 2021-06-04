package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember(1, "KIM", "01011112222");
		DvdMember m2 = new DvdMember(2, "LEE", "01022223333");

		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd(1, "가가", "로맨스");
		Dvd d2 = new Dvd(2, "나나", "느와르");
		Dvd d3 = new Dvd(3, "다다", "코메디");

		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m1.rentDvd(d1);
		m1.rentDvd(d2);
		m2.rentDvd(d1);

		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m1.printMember();
		m2.printMember();

	}

}
