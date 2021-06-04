package com.itwill01.method;
/*
 *  4개의 멤버메쏘드를 가짐
 */
public class CalCulator {
		/*
		 * -add(두 개의 정수를 인수로 받아서 더한 결과를 반환)
		 * -sub(두 개의 정수를 인수로 받아서 뺀 결과를 반환)
		 * -div(두 개의 정수를 인수로 받아서 나눈 결과를 반환)
		 * -mul(두 개의 정수를 인수로 받아서 곱한 결과를 반환)
		 */
		//멤버메쏘드를 이용해서 두 개의 값을 받고 그 두 값을 연산한 값을 반환
		int add(int a, int b) {
			int c = a+b;
			return c;
		}
		int sub(int a, int b) {
			int c = a-b;
			return c;
		}
		int div(int a, int b) {
			int c = a/b;
			return c;
		}
		int mul(int a, int b) {
			int c = a*b;
			return c;
		}
}
