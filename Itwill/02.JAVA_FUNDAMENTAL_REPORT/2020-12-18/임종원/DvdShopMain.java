package com.itwill03.B;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dvdMember = new DvdMember();
		/*
		 * Dvd객체생성
		 */
		Dvd dvd = new Dvd(1,"해리포터와아이들","판타지");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdMember.setDvdMemberNum(1);
		dvdMember.setDvdMemberName("임종원");
		dvdMember.setDvdMemberGendere("남자");
		dvdMember.setAge(100);
		dvdMember.setAddress("경기도용인");
		dvdMember.setEmail("jw7632@hanmail.net");
		dvdMember.setDvd(dvd);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdMember.haedPrint();
		dvdMember.print();

	}

}
