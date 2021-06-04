package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {
		
		/*
		 * 윤년여부출력 평년 (1900, 2100, 2200, 2300, 2500)
		 */
		int year = 2100;
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.printf("%d 는 윤년\n", year);
		} else {
			System.out.printf("%d 는 평년\n", year);
		}
		
			
		/*
		 * 문자판단 
		 *  1.한글여부 
		 *  2.알파벳대문자 
		 *  3.소문자 
		 *  4.숫자형태의문자
		 */
		char c = '9';
		if ((int)c>=44032 && (int)c<= 55203) {
			System.out.println(c + " 는 한글입니다.");
		}

		if ((int)c>=65 && (int)c<= 90) {
			System.out.println(c + " 는 알파벳대문자 입니다.");
		}
		if ((int)c>=97 && (int)c<= 122) {
			System.out.println(c + " 는 알파벳 소문자 입니다.");
		}
		if ((int)c>=48 && (int)c<= 57) {
			System.out.printf("%c 는 숫자형 문자입니다.%n",c);
		}

		
		/*
		 * 다음문자는 아이디의 첫글자입니다. 
		 * 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		 *  - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter = '4';
		
		if (((int)c>=65 && (int)c<= 90)||((int)c>=97 && (int)c<= 122)) {
			System.out.printf("%c 아이디로 적합 %n",idFirstLetter);
		} else {
			System.out.printf("%c 아이디로 부적합 %n",idFirstLetter);

		}

	}

}
