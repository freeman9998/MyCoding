package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dm1 = new DvdMember(1, "홍경아", "010-9845-4575");
		DvdMember dm2 = new DvdMember(2, "이우윤", "010-7572-1248");
			
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(1, "취권", "액션");
		Dvd dvd2 = new Dvd(2, "인턴", "코미디");
		
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
		dm1.headerPrint();
		dm1.print();
		dm2.print();
	}

}
