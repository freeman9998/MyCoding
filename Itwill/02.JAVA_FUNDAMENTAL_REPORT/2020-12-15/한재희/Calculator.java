package com.itwill01.method;

/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * - add(두개의 정수를 인수로 받아서 더한 결과를 반환)
	 */
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	/*
	 * - sub(두개의 정수를 인수로 받아서 뺀 결과를 반환)
	 */
	int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	/*
	 * - div(두개의 정수를 인수로 받아서 나눈 결과를 반환)
	 */
	int div(int a, int b) {
		int result = a / b;
		return result;
	}
	/*
	 * - mul(두개의 정수를 인수로 받아서 곱한 결과를 반환)
	 */
	int mul(int a, int b) {
		int result = a * b;
		return result;
	}
}
