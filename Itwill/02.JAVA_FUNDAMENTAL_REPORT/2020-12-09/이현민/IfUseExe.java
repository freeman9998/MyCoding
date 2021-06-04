package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * 윤년여부출력 평년 (1900, 2020, 2200, 2300, 2500)
		 */
		int year1 = 1900;
		int year2 = 2020;
		int year3 = 2200;
		int year4 = 2300;
		int year5 = 2500;
		
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
			System.out.printf("%d 는 윤년\n", year1);
		} else {
			System.out.printf("%d 는 평년\n", year1);
		}
		
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
			System.out.printf("%d 는 윤년\n", year2);
		} else {
			System.out.printf("%d 는 평년\n", year2);
		}
		
		if ((year3 % 4 == 0 && year3 % 100 != 0) || (year3 % 400 == 0)) {
			System.out.printf("%d 는 윤년\n", year3);
		} else {
			System.out.printf("%d 는 평년\n", year3);
		}
		
		if ((year4 % 4 == 0 && year4 % 100 != 0) || (year4 % 400 == 0)) {
			System.out.printf("%d 는 윤년\n", year4);
		} else {
			System.out.printf("%d 는 평년\n", year4);
		}
		
		if ((year5 % 4 == 0 && year5 % 100 != 0) || (year5 % 400 == 0)) {
			System.out.printf("%d 는 윤년\n", year5);
		} else {
			System.out.printf("%d 는 평년\n", year5);
		}

		/*
		 * 문자판단 
		 *  1.한글여부 
		 *  2.알파벳대문자 
		 *  3.소문자 
		 *  4.숫자형태의문자
		 */
		char c = '김';
		char c1 = '가';
		char c2 = '힣';
		char c3 = 'A';
		char c4 = 'Z';
		char c5 = 'a';
		char c6 = 'z';
		char c7 = '0';
		char c8 = '9';
		int i1 = c1;
		int i2 = c2;
		int i3 = c3;
		int i4 = c4;
		int i5 = c5;
		int i6 = c6;
		int i7 = c7;
		int i8 = c8;
		
		if (c >= i1 && c <= i2) {
			System.out.println(c + "는 한글입니다.");
		}

		if (c >= i3 && c <= i4) {
			System.out.println(c + "는 알파벳대문자 입니다.");
		}
		if (c >= i5 && c <= i6) {
			System.out.println(c + "는 알파벳 소문자 입니다.");
		}
		if (c >= i7 && c <= i8) {
			System.out.println(c + "는 숫자형 문자입니다.");
		}

		/*
		 * 다음문자는 아이디의 첫글자입니다. 
		 * 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		 *  - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */

		char idFirstLetter = '김';

		if ((idFirstLetter >= i3 && idFirstLetter <= i4) || (idFirstLetter >= i5 && idFirstLetter <= i6)) {
			System.out.println("아이디로 적합");
		} else {
			System.out.println("아이디로 부적합");

		}

	}

}
