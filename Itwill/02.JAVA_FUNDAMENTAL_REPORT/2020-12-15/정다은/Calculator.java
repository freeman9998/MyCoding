package com.itwill01.field;
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * substract (빼기)
	 * div (나누기)
	 * multiple (곱하기)
	 */
	
	
	//멤버메소드 add 셋팅
	int add(int a, int b) {
		int result = a + b;
	return result;
	}
	
	//멤버메소드 subtract 셋팅
	int sub(int a, int b) {
		int result = a - b;
	return result;
	}
	
	//멤버메소드 div 셋팅
	int div(int a, int b) {
		int result = a / b;
	return result;
	}
	
	//멤버메소드 multiple 셋팅
	int mul(int a, int b)	{
		int result = a * b;
	return result;
	}
	
	
}
