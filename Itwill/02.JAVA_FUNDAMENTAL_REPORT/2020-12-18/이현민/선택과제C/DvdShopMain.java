package com.itwill04.array;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1=new DvdMember(23,"최민식","010-6575-2728");
		/*
		 * Dvd들객체생성
		 */
		Dvd dvd1=new Dvd(123,"봉오동 전투","액션");
		Dvd dvd2=new Dvd(343,"특별시민","드라마");
		Dvd dvd3=new Dvd(566,"명량","액션");
		Dvd dvd4=new Dvd(889,"신세계","범죄");
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		
		Dvd[] dvds1 = new Dvd[3];
		dvds1[0] = dvd1;
		dvds1[1] = dvd2;
		dvds1[2] = dvd4;
		m1.setDvds(dvds1);
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		DvdMember.headerPrint();
		m1.print();
		
	}

}