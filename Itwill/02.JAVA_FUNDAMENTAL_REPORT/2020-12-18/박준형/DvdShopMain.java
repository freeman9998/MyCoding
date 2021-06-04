package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		/*
		 * Dvd객체생성
		 */
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		Dvd dvd1 = new Dvd(121412, "해리포터", "판타지");
		DvdMember member = new DvdMember(1, "홍길동", "010-4847-xxxx",dvd1);
		
		//member.setDvd(dvd1);
		
		member.print();
	}

}
