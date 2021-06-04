package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이터를 담을 변수 선언
		 */
		/*
		 * 2. 변수에 데이터를 대입
		 */
		/*
		 * 3. 변수를 출력
		 */
		
		int num = 181818;
		String name = "홍길동";
		int rrn1 = 201212;
		int rrn2 = 3495039;
		String sex = "male";
		int marry = 0;
		boolean smoke;
		smoke = true;
		
		System.out.println("*************************");
		System.out.println("회원번호 : "+ num);
		System.out.println("이    름 : "+ name);
		System.out.println("주민번호 : "+ rrn1 + "-" + rrn2);
		System.out.println("성    별 : "+ sex);
		System.out.println("결혼횟수 : "+ marry);
		System.out.println("흡연여부 : "+ smoke);
		System.out.println("*************************");
		
		/*
		 * ***************************
		 * 회원번호 : 181818
		 * 이    름 : 홍길동
		 * 주민번호 : 201212-3495039
		 * 성 	 별 : male
		 * 결혼횟수 : 0
		 * 흡연여부 : true
		 * ***************************
		 */
		
	}
	
}