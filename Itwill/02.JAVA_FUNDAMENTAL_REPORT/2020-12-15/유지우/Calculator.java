package com.itwill01.method;
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * - add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * - sub 두개의 정수를 인수로 받아서 뺀결과를 반환)
	 * - div( 두개의 정수를 인수로 받아서 나눈결과를 반환)
	 * - mul( 두개의 정수를 인수로 받아서 곱한결과를 반환)
	 */
	
	int a;
	int b;
	int add;
	int sub;
	int div;
	int mul;
	
	
	int add(int a, int b) {
		return this.add = a+b;
	}
	
	int sub(int a, int b) {
		return this.add = a-b;
	}
	
	int div(int a, int b) {
		return this.div = a/b;
	}
	
	int mul(int a, int b) {
		return this.mul = a*b;
	}
	
	
}