package com.itwill00.variable;

public class DuoMenberInfoPrint {

	public static void main(String[] args) {
		

		System.out.println("*************************");
		
		// 1. 출력할 데이타를 담을 변수선언
		// 2. 변수에 데이타 대입
		// 3. 변수를 출력
		int no;
		no = 181818;
		System.out.println("회원번호 :" + no);
		
		String name; 
		name = "홍길동";
		System.out.println("이    름 :" + name);
		
		int rrn1; 
		rrn1 = 201212;
		int rrn2;
		rrn2 = 3495039;
		System.out.println("주민번호 : " + rrn1 + "-" + rrn2);
		
		String sex; 
		sex = "male"; 
		System.out.println("성    별 :" + sex);
		
		int marital;
		marital = 0; 
		System.out.println("결혼횟수 : " + marital);
		
		boolean shs; 
		shs = true;
		System.out.println("흡연여부 : " + shs);
		System.out.println("*************************");
		
		
		
		/*
		 	*************************
			회원번호 :181818
			이    름 :홍길동
			주민번호 : 201212-3495039
			성    별 :male
			결혼횟수 : 0
			흡연여부 : true
		 	*************************
		 */
	
	
	}

}
