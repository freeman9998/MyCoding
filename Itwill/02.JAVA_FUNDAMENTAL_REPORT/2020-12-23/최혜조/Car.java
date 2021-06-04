package com.itwill04.array;

public class Car {

	// 멤버필드(속성)의 선언
	private String no; // 번호
	private int inTime; // 입차시간
	private int outTime; // 출차시간
	private int fee; // 주차요금
	/*
	 * 생성자 오버로딩
	 */
	public Car() {
	}
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		super();
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	// 멤버메소드(기능·행위)
	// ★ 메소드는 단위기능으로 가지게 합시다!
	// - 입차데이터 setting (번호, 입차시간)
	public void inCar(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;		
	}
	
	public void outCar(int outTime) {
		this.outTime = outTime;
	}
		
	// - 요금계산
	public void calculateFee() {

		this.fee = (this.outTime-this.inTime)*1000;
	}
	// - 타이틀출력
	public static void headerPrint() {
		System.out.println("---------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("---------------------------------");
		
	}
	
	// 	- 차량정보 출력기능	
	public void print() {		
		System.out.printf("%7s %6d %7d %10d%n",this.no,this.inTime,this.outTime,this.fee);
	}

	//setter,getter
	public void setOutTime(int outTime) {
		this.outTime = outTime;
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

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
	}

}
