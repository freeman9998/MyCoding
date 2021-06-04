package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 * 2.변수에 데이타 대입
		 * 3.변수를 출력
		 */
		
		int no1 = 181818;
		String name1 ="홍길동";
		int no2 = 201212;
		int no3 = 3495039;
		String name2 = "male";
		int no4 = 0;
		boolean smoking = true;
		
		
		System.out.println("*************************");
		System.out.println("회원번호 :"+" "+no1);
		System.out.println("이    름 :"+" "+name1);
		System.out.println("주민번호 :"+no2+"-"+no3);
		System.out.println("성    별 :"+" "+name2);
		System.out.println("결혼횟수 :"+" "+no4);
		System.out.println("흡연여부 :"+" "+smoking);
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
