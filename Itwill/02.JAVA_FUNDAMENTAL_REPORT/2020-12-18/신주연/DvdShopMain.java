package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember mem1 = new DvdMember(931, "Bell", "010-8989-4885");
		DvdMember mem2 = new DvdMember(943, "Hero", "010-3434-1919");
		/*
		 * Dvd객체생성
		 */
		Dvd dd1 = new Dvd(1102, "HomeAlone", "Adventure");
		Dvd dd2 = new Dvd(6430, "Inception", "Action");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */

		mem1.setDvd(dd1);
		mem2.setDvd(dd2);

		mem1.setName("Belle"); // 회원이름변경
		mem2.setHp("010-5855-3925");
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		mem1.headerPrint();
		mem1.print();
		mem2.print();

	}

}
