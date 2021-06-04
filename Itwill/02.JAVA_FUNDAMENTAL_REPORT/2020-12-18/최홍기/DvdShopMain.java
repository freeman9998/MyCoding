package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dm1 = new DvdMember();
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(1, "배트맨 비긴즈", "액션");
		Dvd dvd2 = new Dvd(2, "다크나이트", "액션");
		Dvd dvd3 = new Dvd(3, "다크나이트 라이즈", "액션");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dm1.setNo(1);
		dm1.setName("크리스찬 베일");
		dm1.setPhoneNo("010-1111-1111");
		dm1.setBrDvd(dvd1);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dm1.print();
		dm1.setBrDvd(dvd2);
		dm1.print();
	}

}