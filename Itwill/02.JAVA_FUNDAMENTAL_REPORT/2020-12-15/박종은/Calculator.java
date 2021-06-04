package itwill01.method;
/*
 *  4개의 멤버 메쏘드를 가짐
 */
public class Calculator {
	/*
	 * - add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * - sub( 두개의 정수를 인수로 받아서 뺀결과를 반환)
	 * - div( 두개의 정수를 인수로 받아서 나눈결과를 반환)
	 * - mul( 두개의 정수를 인수로 받아서 곱한결과를 반환)
	 */
	
	// add 더한결과
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// sub 뺀결과
	int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// div 나눈결과
	int div(int a, int b) {
		int result = a / b;
		return result;
	}
	
	// mul 곱한결과
	int mul(int a, int b) {
		int result = a * b;
		return result;
	}
	
	
	
}
