package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 */
		int no;
		String name;
		int sonum1;
		int sonum2;
		String sex;
		int manum;
		boolean smoke;
		
		/*
		 * 2.변수에데이타대입
		 */
		no=181818;
		name="홍길동";
		sonum1=201212;
		sonum2=3495039;
		sex="mail";
		manum=0;
		smoke=true;
		/*
		 * 3.변수를 출력
		 */
		System.out.println("*************************");
		System.out.println("회원번호 : "+no);
		System.out.println("이    름 : "+name);
		System.out.println("주민번호 : "+sonum1+"-"+sonum2);
		System.out.println("성    별 : "+sex);
		System.out.println("결혼회수 : "+manum);
		System.out.println("흡연여부 : "+smoke);
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
