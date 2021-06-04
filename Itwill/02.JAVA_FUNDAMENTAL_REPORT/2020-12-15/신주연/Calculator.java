package com.itwill01.method;

public class Calculator {
	/*
	 * add (두개의 정수를 인수로 받아서 더한결과를 반환)
	 * sub (두개의 정수를 인수로 받아서 뺀 결과를 반환)
	 * div (두개의 정수를 인수로 받아서 나눈결과를 반환)
	 * mul (두개의 정수를 인수로 받아서 곱한결과를 반환)
	 */
	
	//add 메소드 
	int add(int a, int b) {
		int result = a+b;
		return result;
	}
	// sub메소드
	int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	// div 메소드
	int div(int a, int b) {
		int result = a/b;
		return result;
	}
	// mul메소드
	int mul(int a, int b) {
		int result = a*b;
		return result;
	}


}
