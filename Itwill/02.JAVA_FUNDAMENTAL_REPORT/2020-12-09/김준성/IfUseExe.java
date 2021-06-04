package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * 윤년여부출력 평년 (1900, 2100, 2200, 2300, 2500)
		 */
		int year = 1900;
		boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}
		year = 2100;
		isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}
		year = 2200;
		isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}
		year = 2300;
		isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}
		year = 2500;
		isleapyear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (isleapyear) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}

		/*
		 * 문자판단 1.한글여부 2.알파벳대문자 3.소문자 4.숫자형태의문자
		 */

		char c = '꽯';
		if (c >= '가' && c <= '힣') {
			System.out.println(c + "은(는) 한글입니다.");
		}

		if (c >= 'A' && c <= 'Z') {
			System.out.println(c + "은(는) 알파벳 대문자 입니다.");
		}
		if (c >= 'a' && c <= 'z') {
			System.out.println(c + "은(는) 알파벳 소문자 입니다.");
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c은(는) 숫자형 문자입니다.%n", c);
		}

		/*
		 * 다음문자는 아이디의 첫글자입니다. 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */

		char idFirstLetter = 'か';

		if (idFirstLetter >= 'A' && idFirstLetter <= 'Z' && idFirstLetter >= 'a' && idFirstLetter <= 'z') {
			System.out.printf("%c은(는) 아이디의 첫 글자로 적합합니다. %n", idFirstLetter);
		} else {
			System.out.printf("%c은(는) 아이디의 첫 글자로 부적합합니다. %n", idFirstLetter);

		}
	}

}