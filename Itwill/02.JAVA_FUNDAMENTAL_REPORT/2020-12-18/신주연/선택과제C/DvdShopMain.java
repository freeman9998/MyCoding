package com.itwill04.array;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1=new DvdMember();
		/*
		 * Dvd들객체생성
		 */
		Dvd[] dvds = {
				new Dvd(1013, "기생충", "드라마"),
				new Dvd(1228,"나홀로집에1","모험"),
				new Dvd(3015,"어벤져스","액션"),
				new Dvd(5643,"라라랜드","드라마"),
				new Dvd(8568,"인터스텔라","SF")
		};
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		*/
		
		
		m1.setNo(901);
		m1.setName("LEE");
		m1.setTel("010-6767-4356");
		m1.setDvd(dvds);
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		m1.headerPrint();
		m1.print();
		
	}

}
