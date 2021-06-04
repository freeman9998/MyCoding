
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	/*
	 * 외부에서 생성자호출 불가능
	 */
	private Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * - add( 두개의 정수를 인수로 받아서 더한결과를 반환)
	 * - sub 두개의 정수를 인수로 받아서 뺀결과를 반환)
	 * - div( 두개의 정수를 인수로 받아서 나눈결과를 반환)
	 * - mul( 두개의 정수를 인수로 받아서 곱한결과를 반환)
	 */
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	
}
