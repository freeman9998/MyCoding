package itwill03.포함;


	/*
	   1.A 라는 이름의 클래스작성 
	     1-1. A 클래스안에 멤버변수 2개선언(정의)
	  
	  
	   2.AMain 이라는 이름의 클래스작성 
	     2-1.AMain 클래스에 메인메쏘드 작성(생성) 
	     2-1-1.메인메쏘드에 코드작성 
	        - A객체생성
	        - A객체멤버변수에 값대입 
	        - A객체멤버변수의 값출력
	  
	   3.객체그래프를 그리고 주실행흐름을 표시하세요
	 */

	class A {
		// 멤버변수 선언
		int x;
		int y;
		
		public A() {
		}
		
		public A (int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void m1() {
			System.out.println("m1 호출");
		}
		public void m2() {
			System.out.println("m2 호출");
		}
		public void print() {
			 System.out.println("A 객체멤버변수 2개의 값 출력 : " + x + "," + y);	
			}

	
	}
	
	
	public class AMain {
	
		public static void main(String[] args) {
			
			A a = new A(1, 2);
			
			a.print();
			
			
			a.m1();
			a.m2();
			
		}
	}
	
	
	
	
	
	
