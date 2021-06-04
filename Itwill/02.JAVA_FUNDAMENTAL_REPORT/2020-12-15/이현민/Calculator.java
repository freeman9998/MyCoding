package com.itwill01.method;
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * - add(두개의 정수를 인수로 받아서 더한 결과를 반환)
	 * - sub(두개의 정수를 인수로 받아서 뺀 결과를 반환)
	 * - div(두개의 정수를 인수로 받아서 나눈 결과를 반환)
	 * - mul(두개의 정수를 인수로 받아서 곱한 결과를 반환)
	 */
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	int div(int x, int y) {
		int result = x / y;
		return result;
	}
	int mul(int x, int y) {
		int result = x * y;
		return result;
	}
	
	
}