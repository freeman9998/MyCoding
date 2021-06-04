package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dm1 = new DvdMember();
		dm1.setNo(1);
		dm1.setName("정다은");
		dm1.setPhoneNumber("010-9910-9412");
		dm1.setDvd(null);
		
		DvdMember dm2 = new DvdMember(2, "김자바", "010-9876-5432", null);
		
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(152, "해리포터", "판타지");
		Dvd dvd2 = new Dvd(980, "어바웃타임", "로맨스");
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dm1.setDvd(dvd1);
		dm2.setDvd(dvd2);
		
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dm1.headerprint();
		dm1.print();
		dm2.print();
		
	}

}
