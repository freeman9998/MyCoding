package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 *1. 출력할 데이타를 담을 변수선언
		 *2. 변수에데이타대입
		 *3. 변수를 출력
		 */
		
	int num = 181818;
	String name = "홍길동";
	String jumin = "201212-3495039";
	String sex = "male";
	int marry = 0;
	boolean smok;
	smok = true;
	System.out.println("*************");
	System.out.println("회원번호"+num);
	System.out.println("이    름"+name);
	System.out.println("주민번호"+jumin);
	System.out.println("성    별"+sex);
	System.out.println("결혼횟수"+marry);
	System.out.println("흡연여부"+smok);
	System.out.println("*************");
	
	}

}
