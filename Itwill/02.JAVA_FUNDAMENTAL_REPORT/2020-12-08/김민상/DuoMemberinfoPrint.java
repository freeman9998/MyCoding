package com.itwill00.variable;

public class DuoMemberinfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이터를 담을 변수선언
		 */
		int number;
		String name ="홍길동";
		String sex ="male" ;
		String resident1 = "201212";
		String resident2 = "-3495039";
		
		int marriage;
		boolean smoke;
		/*
		 * 2.변수에 데이터대입
		 */
		number = 181818;
		marriage = 0;
		smoke = true; 	
		/*
		 * 3.변수를 출력
		 */
		
		
		System.out.println("******************************");
		System.out.println("회원번호 :" + number );
		System.out.println("이    름 :" + name);
		System.out.println("주민번호 :" + resident1 + resident2);
		System.out.println("성별 :" + sex);
		System.out.println("결혼횟수 :" + marriage);
		System.out.println("흡연여부 :" + smoke);
		System.out.println("******************************");
		/*
		 * ******************************
		 * 회원번호 : 181818
		 * 이    름	: 홍길동
		 * 주민번호 : 201212-3495039
		 * 성    별 : male 
		 * 결혼횟수 : 0
		 * 흡연여부 : true
		 * ******************************
		 */
		
	}

}
