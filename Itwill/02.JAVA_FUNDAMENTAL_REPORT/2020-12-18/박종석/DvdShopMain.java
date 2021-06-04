package com.itwill02.constructor;

public class DvdShopMain {

	public static void main(String[] args) {
		DvdMember dvdmb = new DvdMember();// 회원객체생성
		Dvd cd = new Dvd();// Dvd객체생성
		/*
		 * 회원이Dvd을 대여
		 */
		dvdmb.setId(23);
		dvdmb.setName("유곤충");
		dvdmb.setTel("010-3434-2423");
		dvdmb.setDvd(cd);// Dvd객체참조변수를 회원의 멤버변수에대입

		cd.setNo(7);
		cd.setTitle("곤충탐험");
		cd.setGenre("공포");
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdmb.headprint();
		dvdmb.print();

	}

}
