package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dvdMember1=new DvdMember();
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1=new Dvd(1, "어린왕자를 찾아서", "소설");
		/*
		 * 회원이Dvd을 대여
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdMember1.setData(1, "강준우", 1020123412, dvd1);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdMember1.print();
		
	}

}
