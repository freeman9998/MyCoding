package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {

		
		int year = 2300;
		if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.printf("%d 는 윤년\n", year);
		} else {
			System.out.printf("%d 는 평년\n", year);
		}
		
		
		

		char c = '나';
		if (c >= '가' && c <= '힣') {
			System.out.printf("%c 는 한글입니다.%n", c);
		}
		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c 는 알파벳대문자 입니다.%n", c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c 는 알파벳 소문자 입니다.%n", c);
		}
		if (c >= '0' && c <= '9') {
			System.out.printf("%c 는 숫자형 문자입니다.%n", c);
		}

		
		
		

		char idFirstLetter = 'A';

		if (idFirstLetter >= 'A' && idFirstLetter <= 'Z' || idFirstLetter >= 'a' && idFirstLetter <= 'z') {
			System.out.printf("%c 아이디로 적합 %n", idFirstLetter);
		} else {
			System.out.printf("%c 아이디로 적합 %n", idFirstLetter);

		}

		
		
		
	}

}
