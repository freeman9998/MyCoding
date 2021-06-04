/*
오버로딩(메쏘드다중정의)
  1. 자바 다형성구현기법 중의하나이다.
  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
           - 규칙: 
               * 메쏘드의 이름(식별자)이 같아야한다.
               * 메쏘드의 매개변수의 갯수가 다르거나
               * 메쏘드의 매개변수의 타입이 달라야한다.
               * 메쏘드의 리턴타입,접근지정자(public)는 메쏘드다중정의와 상관없다.

*/
class OverLoading{
	public void method() {
		System.out.println("public void method()");
	}
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	public void method(int a,int b) {
		System.out.println("public void method(int a,int b)");
	}
	public void method(int a,int b,int c) {
		System.out.println("public void method(int a,int b,int c)");
	}
	public void method(String a) {
		System.out.println("public void method(String a)");
		
	}
	public void method(String a,int b) {
		System.out.println("public void method(String a,int b)");
	}
	public void method(int a,int b,String c) {
		System.out.println("public void method(int a,int b,String c)");
	}
	/*
	<< Duplicate method method(int, int, String) in type OverLoading >>
	public int method(int a,int b,String c) {
		return 0;
	}
	*/
}

public class OverloadingMain {

	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.method();
		ol.method(12);
		ol.method(12, 34);
		ol.method(12, 34,44);
		ol.method("문자");
		ol.method("문자",132);
		ol.method(12,45,"제임스딘~~");
		

	}

}
