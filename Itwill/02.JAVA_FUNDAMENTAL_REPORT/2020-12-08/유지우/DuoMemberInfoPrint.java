package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1. 출력할 데이타를 담을 변수 선언
		 */
		int number, number2;
		String name, name2, name3;
		boolean bool;
		/*
		 * 2. 변수에 데이타 대입
		 */
		number = 181818;
		name = "홍길동";
		name2 = "201212-3495039";
		name3 = "male";
		number2 = 0;
		bool = true;
		
		/*
		 * 3. 변수를 출력
		 */

		System.out.println("*************************");
		System.out.println("회원번호 : "+number);
		System.out.println("이    름 : "+name);
		System.out.println("주민번호 : "+name2);
		System.out.println("성    별 : "+name3);
		System.out.println("결혼횟수 : "+number2);
		System.out.println("흡연여부 : "+bool);
		System.out.println("*************************");
		
		/*
*************************
회원번호 : 181818
이    름 : 홍길동
주민번호 : 201212-3495039
성    별 : male
결혼횟수 : 0
흡연여부 : true	
**************************
		 */
	}

}
