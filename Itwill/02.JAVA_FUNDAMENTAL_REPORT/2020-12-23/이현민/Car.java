package com.itwill04.array;

public class Car {
	//필드(속성)
	private String no;//번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	/*
	 * 생성자 오버로딩
	 */
	public Car () {
		
	}
	public Car(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	//메쏘드(기능) - 단위 기능을 갖고 있어야 유연하게 작업할 수 있다.
	//  - 입차데이타(번호,입차시간) 세팅 기능
	public void setIntoData(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	//	- 요금계산기능
	public void calculateFee() {
		this.fee = (this.outTime-this.inTime)*1000;
	}
	//  - 타이틀출력
	public static void headerPrint() {
	System.out.println("-----------------------------------");
	System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
	System.out.println("-----------------------------------");
	}
	//  - 차량정보출력기능
	public void print() {
		System.out.printf("%6s %7d %7d %9d%n",this.no,this.inTime,this.outTime,this.fee);
		return;
	}
	//setter,getter
	//  - 출차시간 세팅 기능
	public void setOutTime(int outTime) {
		this.outTime=outTime;
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
