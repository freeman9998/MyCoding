package com.itwill04.array;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		DvdMember mem1 = new DvdMember(1, "김영희", "01056785432");

		/*
		 * Dvd객체생성
		 */
		Dvd[] dvd1 = {
				new Dvd(9874, "이웃집 토토로", "animation"),
				new Dvd(8596, "데드풀", "action"),
				new Dvd(1020, "컨저링2", "thriler"),
				};
		
		
		/*
		 * 회원이Dvd을 대여
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		mem1.setDvds(dvd1);

		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		DvdMember.headPrint();
		mem1.print();
		
		
		
	}

}