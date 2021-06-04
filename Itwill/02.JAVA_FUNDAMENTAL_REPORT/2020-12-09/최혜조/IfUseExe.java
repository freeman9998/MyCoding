package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * 윤년여부출력 평년 (1900, 2100, 2200, 2300, 2500)
		 */
		int year19= 1900;
		int year21= 2100;
		int year22= 2200;
		int year23= 2300;
		int year25= 2500;		
	
		if((year19 % 4 == 0) && (year19 % 100 != 0)||(year19 % 400 == 0))
		{
			System.out.printf("%d 는 윤년\n", year19);
		} else {
			System.out.printf("%d 는 평년\n", year19);
		}
		
		if((year21 % 4 == 0) && (year21 % 100 != 0)||(year21 % 400 == 0))
		{
			System.out.printf("%d 는 윤년\n", year21);
		} else {
			System.out.printf("%d 는 평년\n", year21);
		}
		
		if((year22 % 4 == 0) && (year22 % 100 != 0)||(year22 % 400 == 0))
		{
			System.out.printf("%d 는 윤년\n", year22);
		} else {
			System.out.printf("%d 는 평년\n", year22);
		}
		
		if((year23 % 4 == 0) && (year23 % 100 != 0)||(year23 % 400 == 0))
		{
			System.out.printf("%d 는 윤년\n", year23);
		} else {
			System.out.printf("%d 는 평년\n", year23);
		}
		
		if((year25 % 4 == 0) && (year25 % 100 != 0)||(year25 % 400 == 0))
		{
			System.out.printf("%d 는 윤년\n", year25);
		} else {
			System.out.printf("%d 는 평년\n", year25);
		}
		
		/*
		 * 문자판단 
		 *  1.한글여부 
		 *  2.알파벳대문자 
		 *  3.소문자 
		 *  4.숫자형태의문자
		 */
		char c = '김';
		if (c >= '가' && c <= '힣') {
			System.out.printf( "%c는 한글입니다.\n", c);
		}

		if (c >= 'A' && c <= 'Z') {
			System.out.printf( "%c는 알파벳 대문자 입니다.\n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf( "%c는 알파벳 소문자 입니다.\n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf( "%c는 숫자형 문자 입니다.\n", c);
		}

		/*
		 * 다음문자는 아이디의 첫글자입니다. 
		 * 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		 *  - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */

		char idFirstLetter = '최';

		if (('A'<=idFirstLetter && idFirstLetter <='Z') || ('a'<=idFirstLetter && idFirstLetter <='z')) {
			System.out.println("아이디로 적합");
		} else {
			System.out.println("아이디로 부적합");
		}

	}
}
