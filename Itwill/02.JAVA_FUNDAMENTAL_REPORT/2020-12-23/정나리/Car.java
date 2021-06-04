package com.itwill04.array;
public class Car {
	
	/*
	 * 클래스의 구성요소
	 * 1. 멤버필드(변수)[속성](자동차의 속성을 저장항 변수들)
	 * 2. 멤버메소드
	 */
	
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
	
	/*
	 * 생성자 연습
	 */
	public Car() {
		
	}
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	

	
	//요금을 계산하는 메소드를 만들어보자
	public void calculateFee() {
		
		this.fee = (this.outTime-this.inTime)*1000;
	}

	
	//차량정보를 출력하는 메소드를 만들어보자
	public void print() { 
		
		System.out.printf("%9s %7d %8d %9d%n", this.no, this.inTime, this.outTime, this.fee); 
	}

	public static void headerPrint() { //리턴타입 void 반환하는 것이 없다
		
		System.out.println("==========================================");
		System.out.printf("   %s %s %s %s%n", "차량번호", "입차시간", "출차시간","주차요금");
		System.out.println("==========================================");
	}
	
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	

}
