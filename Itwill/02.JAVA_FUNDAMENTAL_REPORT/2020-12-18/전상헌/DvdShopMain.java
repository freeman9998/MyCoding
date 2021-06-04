package com.itwill04.array;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember[] dm= {
				new DvdMember(1,"KIM", "010-5161-5555"),
				new DvdMember(2, "LEE", "010-5161-5552"),
				new DvdMember(3, "LIE", "010-1261-4445"),
				new DvdMember(4, "HEE", "010-6751-5885")
				};
		/*
		 * Dvd들객체생성
		 */
		Dvd[] dvd= {
				
		new Dvd(123,"영화1","전쟁"),
		new Dvd(343,"영화2","전쟁"),
		new Dvd(566,"영화3","전쟁"),
		new Dvd(889,"영화4","전쟁")
		
		};
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		//회원들이 빌린 dvd
		Dvd[] borrowDvd0= {dvd[0],dvd[1],dvd[2], /* dvd[3] */};
		Dvd[] borrowDvd1= {dvd[2]};
		Dvd[] borrowDvd2= {dvd[0],dvd[2]};
		Dvd[] borrowDvd3= {dvd[1],dvd[2]};
		
		dm[0].setDvds(borrowDvd0);
		dm[1].setDvds(borrowDvd1);
		dm[2].setDvds(borrowDvd2);
		dm[3].setDvds(borrowDvd3);
		
		
		
		
		
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		for (int i = 0; i < dm.length; i++) {
		     dm[i].print();	
		}
		
	}

}