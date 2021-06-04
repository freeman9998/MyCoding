package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이터를 담을 변수 선언
		 */
		int no;
		String name;
		int ssn1, ssn2;
		String sex;
		int marry;
		boolean smoke;
		
		
		/*
		 * 2. 변수에 데이터를 대입
		 */
		no = 1235;
		name = "홍길동";
		ssn1 = 940322;
		ssn2 = 1345731;
		sex = "male";
		marry = 0;
		smoke = true;
		
		/*
		 * 3. 변수를 출력/*
		 */
		System.out.println("******************************");
		System.out.println("회원번호 : " + no);
		System.out.println("이    름 : " + name);
		System.out.println("주민번호 : " + ssn1 + " - " + ssn2 );
		System.out.println("성    별 : " + sex);
		System.out.println("결혼여부 : " + marry);
		System.out.println("흡연여부 : " + smoke);
		System.out.println("******************************");
		/*
		 * ***************************
		 * 회원번호 : 181818
		 * 이    름 : 홍길동
		 * 주민번호 : 201212-2495039
		 * 성 	 별 : male
		 * 결혼횟수 : 0
		 * 흡연여부 : true
		 * ***************************
		 */

	}

}
