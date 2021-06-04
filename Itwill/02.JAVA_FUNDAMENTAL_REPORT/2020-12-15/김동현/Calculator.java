package com.itwill00.variable.김동현;

public class Calculator {
	/*
	 * 4개의 멤버메쏘드를 가짐
	 */
		int a, b;
		
		
		public Calculator() {}
		
		public Calculator(int a,int b) {
			this.a =  a;
			this.b =  b;
		}
	/*
	 * - add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * - sub 두개의 정수를 인수로 받아서 뺀결과를 반환)
	 * - div( 두개의 정수를 인수로 받아서 나눈결과를 반환)
	 * - mul( 두개의 정수를 인수로 받아서 곱한결과를 반환)
	 */
		int add(int a ,int b) {
			int result = a+b;
			return result;
		}
		
		int sub(int a ,int b) {
			if (a<b){
				int result = b-a;
				return result;}
			else {
				int result = a-b;
				return result;
			}
		}
		
		int div(int a , int b) {
			int result = a/b;
			return result;
		}
		
		int mul(int a , int b) {
			int result = a*b;
			return result;
		}
			
}