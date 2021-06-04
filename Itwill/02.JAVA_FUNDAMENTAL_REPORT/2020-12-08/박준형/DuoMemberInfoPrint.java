package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 */
		int account_num,wedding_count;
		String account_name,resident_num,gender,starline;
		boolean smoking;
		/*
		 * 2.변수에 데이타대입
		 */
		starline="*************************";
		account_num=20201208;
		account_name="고길동";
		resident_num="19520110-1348515";
		gender="male";
		wedding_count=1;
		smoking=true;
		/*
		 * 3.변수를 출력
		 *************************
		 회원번호 : 181818
	     이    름 : 홍길동
		 주민번호 : 201212-3495039
		 성    별 : male
		 결혼횟수 : 0
		 흡연여부 : true	
		 **************************
		 */
		System.out.println(starline);
		System.out.println("회원번호 : " + account_num);
		System.out.println("이 름 : " + account_name);
		System.out.println("주민번호 : "+ resident_num);
		System.out.println("성 별 : "+ gender);
		System.out.println("결혼횟수 : "+ wedding_count);
		System.out.println("흡연여부 : "+ smoking);
		System.out.println(starline);
		
		
	}

}
