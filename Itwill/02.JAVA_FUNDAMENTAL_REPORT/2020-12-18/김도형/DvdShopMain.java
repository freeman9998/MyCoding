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
		Dvd d1 = new Dvd(2019, "미션임파서블6", "액션");
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */				
		dm1.setMemberNo(2020);
		dm1.setMemberName("김도형");
		dm1.setPhoneNo("010-2255-4884");		
		dm1.setDvd(d1);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		
		dm1.headerPrint();
		dm1.print();
				
	}

}