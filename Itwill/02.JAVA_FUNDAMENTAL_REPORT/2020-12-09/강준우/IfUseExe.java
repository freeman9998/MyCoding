package com.itwill00.variable;

public class IfUseExe {
	public static void main(String[] args) {
		/*
		 윤년여부출력(1900, 2100, 2200, 2300, 2500)
		 */
		
		int year1 = 1900;
		int year2 = 2100;
		int year3 = 2200;
		int year4 = 2300;
		int year5 = 2500;

		if ((year1 % 4 == 0 && year1 % 100 == 0)) {
			System.out.printf("%d는 윤년%n", year1);
		} else {
			System.out.printf("%d는 평년%n", year1);
		}

		if ((year2 % 400 == 0)) {
			System.out.printf("%d는 윤년%n", year2);
		} else {
			System.out.printf("%d는 평년%n", year2);
		}

		if ((year3 % 400 == 0)) {
			System.out.printf("%d는 윤년\n", year3);

		} else {
			System.out.printf("%d는 평년\n", year3);

		}

		if ((year4 % 400 == 0)) {
			System.out.printf("%d는 윤년\n", year4);
		} else {
			System.out.printf("%d는 평년\n", year4);
		}

		if (year5 % 400 == 0) {
			System.out.printf("%d는 윤년\n", year5);
		} else {
			System.out.printf("%d는 평년\n", year5);
		}
		
		/*
		문자판단
		1.한글여부
		2.알파벳대문자
		3.소문자
		4.숫자형태의문자
		 */
		 
		char lang = '강';

		if (lang >= '가' && lang <= '힣') {
			System.out.printf("%c는 한글입니다.\n", lang);
		}

		if (lang >= 'A' && lang <= 'Z') {
			System.out.printf("%c는 알파벳대문자입니다.\n", lang);
		} else {
			System.out.printf("%c는 알파벳대문자가 아닙니다.\n", lang);
		}

		if (lang >= 'a' && lang <= 'z') {
			System.out.printf("%c는 소문자입니다.\n", lang);
		} else {
			System.out.printf("%c는 소문자가아닙니다.\n", lang);
		}

		if (lang >= '0' && lang <= 9) {
			System.out.printf("%c는 숫자형문자입니다.\n", lang);
		} else {
			System.out.printf("%c는 숫자형문자아닙니다.\n", lang);
		}

		/*
		다음문자는 아이디의 첫글자입니다
		이 문자가 아이디의 첫글자로 유효한지 판단 후 출력하세요
		- 아이디의 첫글자는 알파벳대문자 이거나 소문자이다
		 */

		char lang1 = 7;
		if ((lang1 >='A' && lang1 <='B') || (lang >='a' && lang <='b')) {
			System.out.printf("%c는 아이디로적합",lang1);
		} else {
			System.out.printf("%c는 아이디로 부적합",lang1);

		}







	}
	}


