package com.itwill03.포함;

//1. A 라는 이름의 클래스작성
public class A{
	
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
	
// 1-2. 멤버메쏘드 m1, m2 선언
	public void m1() {
		System.out.println("m1호출");
	}
	public void m2() {
		System.out.println("m2호출");
	}
	
	// 객체 멤버변수 값을 출력하는 메쏘드
	public void print() {
		System.out.println("A 객체멤버변수 2개의 값 출력 : " + x + "," + y);	
	}
	
}