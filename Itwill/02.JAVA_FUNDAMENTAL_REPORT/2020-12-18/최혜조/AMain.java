/* 선택과제 A 
1.A 라는 이름의 클래스작성
	1-1. A 클래스안에 멤버변수 x,y  2개선언(정의) 
        1-2. A 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
	       - 멤버메쏘드내용은 System.out.println("m1호출");	 
			      System.out.println("m2호출");	 
2.AMain 이라는 이름의 클래스작성
	2-1.AMain 클래스에 메인메쏘드 작성(생성)
		2-1-1.메인메쏘드에 코드작성
              - A객체생성
	      - A객체멤버변수2개에 값대입
              - A객체멤버변수2개의 값출력
	      -	A객체멤버메쏘드2개호출(m1,m2)	


3.객체그래프를 그리고 주실행흐름을 표시하세요
*/
package com.itwill03.포함;

// 1. A 라는 이름의 클래스작성
class A{
	
	// 1-1. 멤버변수 x,y 2개선언
	int x;
	int y;
	
	// 기본생성자
	public A() {
		
	}
	
	// 초기값을 지정하기 위한 생성자
	public A (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 1-2. 멤버메소드 m1, m2 선언
	public void m1() {
		System.out.println("m1호출");
	}
	public void m2() {
	System.out.println("m2호출");
	}
	
	// 객체 멤버변수 값을 출력하기위한 프린트 메소드
	public void print() {
	 System.out.println("A객체멤버변수 2개의 값 출력 : " + x + "," + y);	
	}
	
}

public class AMain {

	// 2-1.AMain 클래스에 메인메쏘드 작성
	public static void main(String[] args) {
		// 2-1-1. A객체 생성과 동시에 A객체멤버변수2개에 값대입
		A a = new A(3,4);
		
		// A객체멤버변수2개의 값출력
		a.print();
		
		// A객체멤버메쏘드2개호출(m1,m2)	
		a.m1();
		a.m2();

	}

}
