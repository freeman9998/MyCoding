package com.itwill01.method;

/*
 * 4개의 멤버메소드를 가짐
 */
public class Calculator {
	/*
	 * add (2개의 정수를 인수로 받아서 더한 결과를 반환)
	 * sub (2개의 정수를 인수로 받아서 뺀 결과를 반환)
	 * mul (2개의 정수를 인수로 받아서 곱한 결과를 반환)
	 * div (2개의 정수를 인수로 받아서 나눈 결과를 반환)
	 */

	int add(int x, int y) {
		return x + y;
	}
	int sub(int x, int y) {
		return x -y;
	}
	int mul(int x, int y) {
		return x * y;
	}
	int div(int x, int y) {
		return x / y;
	}
}
