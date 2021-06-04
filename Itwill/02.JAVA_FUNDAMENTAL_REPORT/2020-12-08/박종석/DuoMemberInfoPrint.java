package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		1.출력할 데이타를 담을 변수선언
		 */
		int no1;
		String name;
		int id1;
		int id2;
		String sex;
		int marri;
		boolean smoke;
		
		/*
		 2.변수에 데이타 대입
		 */
		no1 = 181818;
		name = "홍길동";
		id1 = 201212;
		id2 = 3495039;
		sex = "남성";
		marri = 0;
		smoke = true;
		/*
		 3.변수를 출력
		 */
		/*
		 *************************
회원 번호 : 181818
이 름 : 홍길동
주민 번호 : 201212-3495039
성 별 : 남성
결혼 횟수 : 0
흡연 여부 : true	
**************************
		 */
		
		System.out.println("***************************");
		System.out.println("회원 번호 : "+no1);
		System.out.println("이 름 : "+name);
		System.out.println("주민 번호 : "+id1+"-"+id2);
		System.out.println("성 별 : "+sex);
		System.out.println("결혼 횟수 : "+marri);
		System.out.println("흠연 여부 : "+smoke);
		System.out.println("***************************");
		
	}

}
