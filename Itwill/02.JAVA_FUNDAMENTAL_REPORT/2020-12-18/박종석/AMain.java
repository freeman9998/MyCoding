package com.itwill02.constructor;

//2.AMain 이라는 이름의 클래스작성
public class AMain {
	// 2-1.AMain 클래스에 메인메쏘드 작성(생성)
	public static void main(String[] args) {
		// 2-1-1.메인메쏘드에 코드작성
		// - A객체생성
		A a1 = new A();
		// - A객체멤버변수에 값대입
		a1.no = 1;
		a1.name = "박종석";
		// - A객체멤버변수의 값출력
		System.out.println(a1.no);
		System.out.println(a1.name);

		// 2-1-1.메인메쏘드에 코드작성
		// - A객체생성
		// -A객체멤버변수2개에 값대입
		a1.x = 3;
		a1.y = 8;
		// -A객체멤버변수2개의 값출력
		System.out.println(a1.x);
		System.out.println(a1.y);
		// -A객체멤버메쏘드2개호출(m1,m2)
		a1.m1();
		a1.m2();
	}

}
