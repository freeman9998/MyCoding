package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
	
		int num;
		String name;
		int rrn1, rrn2;
		String gen;
		int mar;
		boolean smo;
		
		num = 181818;
		name = "홍길동";
		rrn1 = 201212;
		rrn2 = 3495039;
		gen = "male";
		mar = 0;
		smo = true;
	
		
		System.out.println("*************************");
		System.out.println("회원번호 : " + num);
		System.out.println("이    름 : " + name);
		System.out.println("주민번호 : " + rrn1 + "-" + rrn2);
		System.out.println("성    별 : " + gen);
		System.out.println("결혼횟수 : " + mar);
		System.out.println("흡연여부 : " + smo);
		System.out.println("*************************");


	}

}
