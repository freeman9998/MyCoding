package com.itwill03.포함;
/*
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
// 클래스 A 작성
class A	{
	// 클래스 A안의 멤버변수 2개 선언
	private int x;
	private int y;
	// 디폴트 생성자
	public A() {
		
	}
	// A타입의 객체 멤버필드값 초기화용 
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 클래스 A안의 멤버메소드m1
	public void m1() {
		System.out.println("m1호출");
	}
	//클래스 A안의 멤버메소드m2
	public void m2() {
		System.out.println("m2호출");
	}
	// getter & setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
// Amain 클래스 작성
public class Amain {

	//클래스 안에 메인 메소드 작성(생성)
	public static void main(String[] args) {
		// A타입의 a객체 생성 (참조변수 a 에 생성된 객체의 주소저장)
		A  a = new A();
		// a객체의 멤버변수 x에 값 3 대입(저장)
		// a객체의 멤버변수 y에 값 7 대입(저장)
		a.setX(3);
		a.setY(7);
		// a객체의 멤버변수 값(x, y) 을 메인메소드(블록안) 에서 출력
		System.out.println(a.getX());
		System.out.println(a.getY());
		// a객체의 메소드(m1, m2)호출
		a.m1();
		a.m2();
	}
}
